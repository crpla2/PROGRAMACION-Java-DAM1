package paquete1;
/*
 * Revisado para versión 8.19 de MySQL 
 * Alberto Carrera Martín
 * 29 febrero 2020
 */
import java.sql.*;
public class HolaMundoBaseDatos {
	
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String database = "sample";
    private static String hostname = "localhost";
    private static String port = "3306";
	// private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=CET";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=Europe/Madrid";
    private static String username = "root";
    private static String password = "rootroot";
 
  
    public static void main(String[] args) 
     throws ClassNotFoundException, SQLException {
	     
	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url, username, password);

	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery(
 		"SELECT titulo, precio FROM Libros WHERE precio > 2");
		
	while (rs.next()) {
		String name = rs.getString("titulo");
		float price = rs.getFloat("precio");
		System.out.println(name + "\t" + price);
	}
	rs.close();
	stmt.close();		
	conn.close();
  }
}
