package Ejercicio_Obligatorio_Sesion7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class Bd_Baloncesto {
	private String maquina = "localhost";
	private String usuario = "root";
	private String clave = "root";
	private int puerto = 3308;
	private String servidor = "";
	private static Connection conexion = null;

	// CONSTRUCTOR
	// Recibe el nombre de la base de datos
	Bd_Baloncesto(String baseDatos) {
		this.servidor = "jdbc:mysql://" + this.maquina + ":" + this.puerto + "/" + baseDatos + "?useSSL=false"
				+ "&serverTimezone=CET";
		;

		// Registrar el driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("ERROR AL REGISTRAR EL DRIVER");
			System.exit(0); // parar la ejecución
		}

		// Establecer la conexión con el servidor
		try {
			conexion = DriverManager.getConnection(this.servidor, this.usuario, this.clave);
		} catch (SQLException e) {
			System.err.println("ERROR AL CONECTAR CON EL SERVIDOR");
			System.exit(0); // parar la ejecución
		}
		System.out.println("Conectado a " + baseDatos);
	}

	// Devuelve el objeto Connection que se usará en la clase Controller
	public static Connection getConexion() {
		return conexion;
	}

	public static void desconectar() throws SQLException, ClassNotFoundException {

		conexion = null; // = conecta.close();
	}

	public static int añadir(String id, String nombre, String estatura, String edad, String localidad) {
		String cadenaSQL = "INSERT INTO socio VALUES(?,?,?,?,?)";
		try {

			PreparedStatement consulta = conexion.prepareStatement(cadenaSQL);
		
			consulta.setInt(1, Integer.parseInt(id));
			if (nombre.isEmpty())
				consulta.setNull(2, Types.VARCHAR);
			else
				consulta.setString(2, nombre);
			if (estatura.isEmpty())
				consulta.setNull(3, Types.VARCHAR);
			else
				consulta.setString(3, estatura);
			if (edad.isEmpty())
				consulta.setNull(4, Types.VARCHAR);
			else
				consulta.setString(4, edad);
			if (localidad.isEmpty())
				consulta.setNull(5, Types.VARCHAR);
			else
				consulta.setString(5, localidad);

			return consulta.executeUpdate();

		} catch (SQLException e) {
			System.out.print(" ERROR: " + e.getErrorCode());
		}
		return -1;

	}

	public static int editar(String id, String nombre, String estatura, String edad, String localidad) {
		String cadenaSQL = "UPDATE socio SET nombre = ?, estatura=?, edad=?, localidad=? WHERE socioID=?";
		try {
			PreparedStatement consulta = conexion.prepareStatement(cadenaSQL);
			if (nombre.isEmpty())
				consulta.setNull(1, Types.VARCHAR);
			else
				consulta.setString(1, nombre);
			if (estatura.isEmpty())
				consulta.setNull(2, Types.INTEGER);
			else
				consulta.setString(2, estatura);
			if (edad.isEmpty())
				consulta.setNull(3, Types.INTEGER);
			else
				consulta.setString(3, edad);
			if (localidad.isEmpty())
				consulta.setNull(4, Types.VARCHAR);
			else
				consulta.setString(4, localidad);
			
			consulta.setInt(5, Integer.parseInt(id));

			return consulta.executeUpdate();

		} catch (SQLException e) {
			System.out.print(" ERROR: "+ e.getErrorCode());
		}
		return -1;
	}

	public static int borrar(String id) {
		String cadenaSQL = " DELETE FROM socio WHERE socio.socioID = ?";
		try {
			PreparedStatement consulta = conexion.prepareStatement(cadenaSQL);
			consulta.setInt(1, Integer.parseInt(id));

			return consulta.executeUpdate();

		} catch (SQLException e) {
			System.out.print(" ERROR: "+ e.getErrorCode());
		}
		return -1;
	}

	public static ResultSet getCliente(int id) {
		String cadenaSQL = "SELECT * FROM socio WHERE socio.socioID= ?";
		try {
			PreparedStatement consulta = conexion.prepareStatement(cadenaSQL);
			consulta.setInt(1, id);
			return consulta.executeQuery();
		} catch (SQLException e) {
			System.out.print(" ERROR: "+e.getErrorCode());
		}
		return null;
	}

	public static ResultSet getClientes() {
		String cadenaSQL = "SELECT * FROM socio ORDER BY nombre";
		try {
			PreparedStatement consulta = conexion.prepareStatement(cadenaSQL);
			return consulta.executeQuery();
		} catch (SQLException e) {
			System.out.print(" ERROR: "+e.getErrorCode());
		}
		return null;
	}

	public static boolean existeId(String id) {
		ResultSet rs;
		String cadenaSQL = "SELECT socioID FROM socio";
		try {
			PreparedStatement consulta = conexion.prepareStatement(cadenaSQL);
			rs = consulta.executeQuery();

			while (rs.next()) {
				if (String.valueOf(rs.getInt("socioID")).equalsIgnoreCase(id))
					return true;
			}
		} catch (SQLException e) {
			System.out.print(" ERROR: "+e.getErrorCode());
		}

		return false;

	}
}