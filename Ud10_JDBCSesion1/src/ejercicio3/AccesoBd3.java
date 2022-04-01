package ejercicio3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoBd3 {

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

		
	public ResultSet consulta(String cadenaSQL) throws SQLException {
		Statement consulta = conecta.createStatement();
		ResultSet reg = consulta.executeQuery(cadenaSQL);
		return reg;
	}

	
	public void desconectar() throws SQLException {
		if (conecta != null) {
			conecta.close();
		}
	}

}
