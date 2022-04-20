package Ejercicio_Obligatorio_Sesion7;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
 
public class Bd_Baloncesto {
    private String  maquina     = "localhost";
    private String  usuario     = "root";
    private String  clave       = "root";
    private int puerto          = 3308;
    private String  servidor    = "";
    private static Connection conexion  = null;
 
    //CONSTRUCTOR
    //Recibe el nombre de la base de datos
    Bd_Baloncesto(String baseDatos){
        this.servidor="jdbc:mysql://"+this.maquina+":"+
                        this.puerto+"/"+baseDatos +
						"?useSSL=false" + "&serverTimezone=CET";;
 
        //Registrar el driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("ERROR AL REGISTRAR EL DRIVER");
            System.exit(0); //parar la ejecución
        }
 
        //Establecer la conexión con el servidor
        try {
            conexion = DriverManager.getConnection(this.servidor,
                        this.usuario, this.clave);
        } catch (SQLException e) {
            System.err.println("ERROR AL CONECTAR CON EL SERVIDOR");
            System.exit(0); //parar la ejecución
        }
        System.out.println("Conectado a "+baseDatos);
    }
 
    //Devuelve el objeto Connection que se usará en la clase Controller
    public static Connection getConexion() {
        return conexion;
    }
    
    public static void desconectar() throws SQLException, ClassNotFoundException {

		conexion = null; // = conecta.close();
	}
    
    public static int añadir(String id,String nombre,String estatura,String edad, String localidad) {
    	String cadenaSQL="INSERT INTO socio VALUES(?,?,?,?,?)";
    	try {
			PreparedStatement consulta= conexion.prepareStatement(cadenaSQL);
			consulta.setInt(1, Integer.parseInt(id));
			consulta.setString(2, nombre);
			consulta.setString(3, estatura);
			consulta.setString(4, edad);
			consulta.setString(5, localidad);
			
			return consulta.executeUpdate();
			
		}catch (SQLException e){
			System.out.print(" ERROR: ");
			return e.getErrorCode();
		}
    }
    

    public static int editar(String id,String nombre,String estatura,String edad, String localidad) {
    	String cadenaSQL="UPDATE socio SET socio.nombre = ?, socio.estatura=?, socio.edad=?, socio.localidad=? WHERE socio.socioID=?";
    	try {
			PreparedStatement consulta= conexion.prepareStatement(cadenaSQL);
			consulta.setString(1, nombre);
			consulta.setString(2, estatura);
			consulta.setString(3, edad);
			consulta.setString(4, localidad);
			consulta.setInt(5, Integer.parseInt(id));
			
			return consulta.executeUpdate();
			
		}catch (SQLException e){
			System.out.print(" ERROR: ");
			return e.getErrorCode();
		}
    }
   
    public static int borrar(String id) {
    	String cadenaSQL=" DELETE FROM socio WHERE socio.socioID = ?";
    	try {
			PreparedStatement consulta= conexion.prepareStatement(cadenaSQL);
			consulta.setInt(1, Integer.parseInt(id));
					
			return consulta.executeUpdate();
			
		}catch (SQLException e){
			System.out.print(" ERROR: ");
			return e.getErrorCode();
		}
    }
    
    public static ResultSet getCliente(int id) {
    	String cadenaSQL="SELECT * FROM socio WHERE socio.socioID= ?";
    	try {
			PreparedStatement consulta= conexion.prepareStatement(cadenaSQL);
			 consulta.setInt(1, id);
			 return consulta.executeQuery();
    	}catch (SQLException e){
			System.out.print(" ERROR: ");
			 e.getErrorCode();
		}
		return null;
    }
    
    public static  ResultSet getClientes() {
    	String cadenaSQL="SELECT id, nombre, nif FROM cliente ORDER BY nombre";
    	try {
			PreparedStatement consulta= conexion.prepareStatement(cadenaSQL);
			return consulta.executeQuery();
    	}catch (SQLException e){
			System.out.print(" ERROR: ");
			 e.getErrorCode();
		}
		return null;
    }
    
    
}