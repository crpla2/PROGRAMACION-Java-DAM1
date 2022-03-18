package paquete1;
/*
 * Revisado para versión 8.19 de MySQL 
 * Alberto Carrera Martín
 * 29 febrero 2020
 */
import java.sql.*;
public class HolaMundoGestionErrores {
	    private static String driver = "com.mysql.cj.jdbc.Driver";
	    private static String database = "sample";
	    private static String hostname = "localhost";
	    private static String port = "3306";
	    private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=Europe/Madrid";
	    private static String username = "root";
	    private static String password = "rootroot";
	public static void main(String[] args) {
     
     try {
	Class.forName(driver);
     } catch (ClassNotFoundException e) {
	System.err.println("El driver no se encuentra");
	System.exit(-1);
     }

     Connection conn = null;
     try {
	conn = DriverManager.getConnection(url, username, password);

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
              } catch (SQLException e) {
                 System.err.println("Error en la base de datos: "+
                   e.getMessage());
                 e.printStackTrace();
              } finally {
                 if(conn != null){
           	 try {
           	    conn.close();
           	 } catch (SQLException e) {
           	    System.err.println("Error al cerrar la conexión: "+
                        e.getMessage());
             	 }
                 }
               }
             }
           }
