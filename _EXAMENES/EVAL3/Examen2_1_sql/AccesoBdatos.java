package Examen2_1_sql;

import java.sql.*;
import java.util.ArrayList;

public class AccesoBdatos {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "libros10mayo2022";
	private static String hostname = "localhost";
	private static String port = "3308";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";
	private Connection conecta;

	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}

	public void desconectar() throws SQLException, ClassNotFoundException {

		conecta = null; // = conecta.close();
	}

	public void librosEditorial(String editorial) {
		try {
			PreparedStatement ps = conecta.prepareStatement("select ISBN,titulo,autor from libros where editorial=?");
			ps.setString(1, editorial);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("ISBN: " + rs.getString("isbn") + " | Título: " + rs.getString("titulo")
						+ " | Autor: " + rs.getString("autor"));
			}
		} catch (SQLException e) {
			System.out.println("Error: " + e.getErrorCode());
		}
	}

	public int totalPrestados() {
		try {
			int prestados = 0;
			PreparedStatement ps = conecta.prepareStatement("select count(*) from libros where prestado='S'");
			ResultSet rs = ps.executeQuery();
			if (rs.next())
				prestados = rs.getInt(1);
			return prestados;
		} catch (SQLException e) {
			return -1;
		}

	}

	public String insertarUsuario(String nombre, String apellidos, String dni, String telefono) {
		try {
			String cadena = "";
			CallableStatement cs = conecta.prepareCall("select nuevoUsuario(?,?,?,?)");
			cs.setString(1, nombre);
			cs.setString(2, apellidos);
			cs.setString(3, dni);
			cs.setString(4, telefono);
			ResultSet rs = cs.executeQuery();
			if (rs.next()) 
				cadena = rs.getString(1);
			if (cadena.equals("OK"))
			return cadena;
			else return null;
		} catch (SQLException e) {
			return null;
		}

	}
	//
	//
	// COMPLETAR
	//
	//
}// De la clase AccesoBdatos