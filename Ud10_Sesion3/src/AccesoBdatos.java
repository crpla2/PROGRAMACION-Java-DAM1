/*
 * Revisado para versión 8.0.19 de MySQL 
 * Alberto Carrera Martín
 * y añadido comentarios el 17 de marzo de 2020
 * 
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
public class AccesoBdatos {
	private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String database = "demodb";
    private static String hostname = "localhost";
    private static String port = "3306";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database +
									"?serverTimezone=Europe/Madrid";
    private static String username = "root";
    private static String password = "rootroot";
    private Connection conecta;
	
	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}
	
	public void desconectar() throws SQLException, ClassNotFoundException {
		
		conecta = null; // = conecta.close();
	}
	//
	//método insertar. Recibe la clave (número de departamento), el nombre del departamento
	// y la localidad y los inserta dentro de una fila en la tabla dept de la base de datos demodb
	// 
	public boolean insertar(Integer clave, String nombre, String localidad){
		try {
			// Se utilizan por seguridad y rapidez sentencias preparadas que ya conocemos de la sesión anterior
			String sql="insert into dept values (?,?,?)";
			// Creo la sentencia preparada a partir de la conexión
			PreparedStatement inserta=conecta.prepareStatement(sql);
			// Ahora viene el acoplamiento de valores
			// El primer ? de la instrucción de la línea 37 es un entero y su valor se obtiene del argumento "clave" pasado al método insertar
			inserta.setInt(1,clave);
			// El segundo ? de la instrucción es una cadena y su valor se obtiene del argumento "nombre" pasado al método insertar
			inserta.setString(2,nombre);
			// El tercer ? de la instrucción es una cadena y su valor se obtiene del argumento "localidad" pasado al método insertar
			inserta.setString(3,localidad);
			// Se lleva a cabo la ejecución de la instrucción
			inserta.executeUpdate(); 
			// Nota a la línea anterior. Si pusiéramos en su lugar int filas = inserta.executeUpdate(); 
			// además de ejecutarse la instrucción anterior nos devolvería en la variable "filas" el número de filas insertadas
			// (que como mucho sería 1 ¿No?)
			return true; // Todo ha ido bien
			// Cualquier error en la inserción, sin distinción del tipo del error, lo atrapo a continuación
		} catch(SQLException e){
			// Atrapará cualquier problema en la inserción: El departamento ya existe, el número de departamento no puede ser null ...
			// Podría saber el error concreto MySQL preguntando por e.getErrorCode()
			return false;// No ha ido bien la inserción
		}
	}
	//
	//
	//método insertarConBean. Recibe un solo argumento, un objeto departamento, y lo inserta como una fila en la tabla dept de la base de datos demodb
	// Recordad que tengo una clase Depto.java "similar" a la tabla dept con la que estamos trabajando
	// Procedimiento Muy similar al anterior, con una modificación para que en caso que la inserción sea correcta devuelva un 1 y
	// si no es correcta devuelva el número de error MySQL
	public int insertarConBean(Depto registro){
		try {
			String sql="insert into dept values (?,?,?)";
			PreparedStatement inserta =conecta.prepareStatement(sql);
			inserta.setInt(1,registro.getDeptno());
			inserta.setString(2,registro.getDname());
			inserta.setString(3,registro.getLoc());
			inserta.executeUpdate();
			return 1;
		} catch(SQLException e){
			return e.getErrorCode();
		}
	}
	//
	// Método consultarTodos. ¡NO DEVUELVE UN RESULTSET O CONJUNTO DE FILAS DE UNA TABLA QUE TANTO NOS GUSTA! SINO
	// QUE ESE RESULTSET OBTENIDO, LO PASA A UN ARRAYLIST DE DEPARTAMENTOS  Y DEVUELVE DICHO ARRAYLIST
	//
	public ArrayList<Depto> consultarTodos(){
		// Creamos una lista donde ir añadiendo cada departamento que vamos recuperando del ResultSet
		ArrayList<Depto> deptos = new ArrayList<Depto> ();
		try {
			// Preparo la sentencia. Observad que no lleva "?" o datos que tenga que pasarle antes de ejecutarla.
			PreparedStatement consulta = conecta.prepareStatement("SELECT * FROM dept");
			// Ejecuto la instrucción y obtengo en reg el ResultSet o conjunto de filas resultantes de ejecutar la Select...
			ResultSet reg = consulta.executeQuery ();
			//Paso a recorrer cada una de las filas del ResultSet
			while (reg.next ()) {
				// Creo un departamento y a la vez le paso al constructor los datos con los que inicializo dicho departamento
				// Esos 3 datos con los que construyo el departamento son los datos que extraigo de la fila del ResultSet
				Depto departamento = new Depto(reg.getInt (1), reg.getString (2), reg.getString (3));
				// una vez creado el departamento con los datos extraídos de la fila, lo añado a la lista
				deptos.add(departamento);
			}
			consulta.close ();
		} catch (SQLException e) {
			return null; // En caso de error devuelvo la lista null
		} 
			return deptos; // Si todo va bien devuelvo la lista (¡ArrayList no ResultSet!) de departamentos
		}
	//
	// método consultarUno. Le paso como argumento  el número de departamento y me devuelve un objeto departamento 
	// que se corresponde con dicho número. Si no lo encuentra o se produce error, devuelve nulo
	public Depto consultarUno(int numero){
		try {
			PreparedStatement consulta = conecta.prepareStatement("SELECT * FROM dept WHERE deptno=?");
			// El dato que me falta para lanzar la sentencia anterior, el ?,
			// es un entero que se obtiene del argumento "numero" enviado al método consultarUno
			consulta.setInt(1, numero);
			// Ejecuto la instrucción
			ResultSet reg = consulta.executeQuery ();
			// Creo un departamento donde dejar el resultado obtenido. El ResultSet reg solo puede tener una fila o ninguna, 
			// pues realizo una búsqueda por clave primaria Select... WHERE deptno=....
			Depto departamento = new Depto();
			// Si he recuperado una fila, monto el departamento con los datos de las columnas de dicha fila
			if (reg.next ()) {
				departamento.setDeptno(reg.getInt (1));
				departamento.setDname(reg.getString(2));
				departamento.setLoc(reg.getString(3));
			}
			// si no he recuperado ninguna, devuelvo null
			else
				departamento=null;
			consulta.close ();
			return departamento;
		}
		catch (SQLException e) {
			//System.out.println("error en la consulta - "+e.getMessage());
			return null;
		}
	}
	
	// método actualizar. Le pasamos un objeto departamento y actualiza en la tabla dept,
	// el nombre y la localidad de la fila cuyo número de departamento coincide con el del departamento que le paso
	// Devuelve el número de filas actualizadas, que en este caso será 0 ó 1
	public int actualizar(Depto registro){
		try {
			String sql="update dept set dname=?, loc=? where deptno=?";
			// Preparo la sentencia
			PreparedStatement actualiza = conecta.prepareStatement(sql);
			// Seguidamente el acoplamiento de los 3 valores ?
			actualiza.setString(1,registro.getDname());
			actualiza.setString(2,registro.getLoc());
			actualiza.setInt(3,registro.getDeptno());
			// ejecuto la instrucción "actualiza.executeUpdate()" y después de ello devuelvo el número de filas afectadas
			return (actualiza.executeUpdate());
			// Nota la instrucción anterior equivale a:
			// int filas = actualiza.executeUpdate();
			// return filas
		} catch(SQLException e){
		//System.out.println("error al actualizar en dept - "+e.getMessage());
		return 0;
		}
	}
	//
	// metodo borrar. Le pasamos un número de departamento y borra dicho departamento.
	// devuelve el número de filas borradas, que como mucho será 1
	// o el número de error MySQL si se produce una excepción
	public int borrar (int numero){
		int filas=0; // 
		try {
			PreparedStatement baja = conecta.prepareStatement("DELETE FROM dept WHERE deptno=?");
			baja.setInt(1, numero);
			filas = baja.executeUpdate ();
			baja.close ();
		return filas;
		} catch (SQLException e) {
			return e.getErrorCode(); // En caso de error en la consulta devuelve el código de error MySQL
		}
	}
}