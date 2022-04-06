package Ejercicio3_S2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoBd3_Sesion2 {

	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "baloncesto";
	private static String hostname = "localhost";
	private static String port = "3308";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";
	static ResultSet reg;
	private Connection conecta;

	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}

	public ResultSet consulta(String localidad) throws SQLException {
		PreparedStatement consulta;
		String cadenaSQL = "SELECT * FROM socio ";
		if (localidad.isEmpty()) {
			consulta = conecta.prepareStatement(cadenaSQL);
		} else {
			cadenaSQL = "SELECT * FROM socio  where localidad = ?";
			consulta = conecta.prepareStatement(cadenaSQL);
			consulta.setString(1, localidad);
		}

		ResultSet reg = consulta.executeQuery();
		return reg;
	}

	public void desconectar() throws SQLException {
		if (conecta != null) {
			conecta.close();
		}
	}

}
