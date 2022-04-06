package Ejercicio2_S2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoBdatosUsu_Sesion2 {
	
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "sample";
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
	
	
	public String compruebaContraseña(String usu, String pass) throws SQLException {
		PreparedStatement consulta;
		String cadenaSQL = "select * from usuario where username = ? and password=? ";
		consulta = conecta.prepareStatement(cadenaSQL);
		consulta.setString(1, usu);
		consulta.setString(2, pass);
		reg= consulta.executeQuery();
		if (reg.next())
			return reg.getNString(3);
		else
			return "No existe el Usuario/Contraseña";
		
	}
	
	public void desconectar() throws SQLException {
		if (conecta != null) {
			conecta.close();
		}}

}
