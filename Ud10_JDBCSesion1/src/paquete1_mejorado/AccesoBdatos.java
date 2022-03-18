/*
 * Revisado para versión 8.19 de MySQL 
 * Alberto Carrera Martín
 * 29 febrero 2020
 */
package paquete1_mejorado;
import java.sql.*;
import java.util.ArrayList;
public class AccesoBdatos {
private static String driver = "com.mysql.cj.jdbc.Driver";
private static String database = "sample";
private static String hostname = "localhost";
private static String port = "3306";
private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=Europe/Madrid";
private static String username = "root";
private static String password = "rootroot";

// NUNCA CONECTARSE CON USUARIO ROOT!!!!!!!!!!!!!!!!!!!
// SOLO PARA PRUEBAS!!!!!!!

public Connection conecta;

	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}
	
	
	
	public ArrayList <Libro> consultarTodos(){
		ArrayList <Libro>lista = new ArrayList<Libro> ();
	
		try {
			Statement consulta = conecta.createStatement();
			ResultSet reg = consulta.executeQuery ("SELECT * FROM Libros");
			while (reg.next ()) {
				Libro libro= new Libro(reg.getInt (1), reg.getString (2), reg.getInt (3));
				lista.add(libro);
		}
		consulta.close ();
		} catch (SQLException e) {
			return null;
		} 
		return lista;
		}
	
	public Libro consultarId(int numero){
		try {
			Statement consulta = conecta.createStatement();
			ResultSet reg = consulta.executeQuery ("SELECT * FROM Libros WHERE idLibro =" + numero);
			//NOOOOOOOOOOOOOOOOOOOOOOOOOO HACER ESTO NUNCA
			// SOLO EN ESTE MOMENTO
			// UTILIZAREMOS SENTENCIAS PREPARADAS!!!!!!!!!!!!!!!!!
			Libro libro = new Libro();
			if (reg.next ())	{
				
				libro.setIdLibro(reg.getInt (1));
				libro.setTitulo(reg.getString(2));
				libro.setPrecio(reg.getInt(3));
		    }
			else
				libro=null;
		consulta.close ();
		return libro; 
		}
		catch (SQLException e) {
			System.out.println("error en la consulta"+e.getMessage());
		return null;
		}
		} //de consultarId
	
	//
	
	public ArrayList <Libro> consultarPorTitulo(String titulo){
		ArrayList <Libro>lista = new ArrayList<Libro> ();
		try {
			Statement consulta = conecta.createStatement();
			ResultSet reg = consulta.executeQuery ("SELECT * FROM Libros WHERE titulo LIKE '%" + titulo + "%'");
			//NOOOOOOOOOOOOOOOOOOOOOOOOOO HACER ESTO NUNCA
			// SOLO EN ESTE MOMENTO
			// UTILIZAREMOS SENTENCIAS PREPARADAS!!!!!!!!!!!!!!!!!
			
			while (reg.next ()) {
				Libro libro= new Libro(reg.getInt (1), reg.getString (2), reg.getInt (3));
				lista.add(libro);
		}
		consulta.close ();
		return lista;
		}
		catch (SQLException e) {
			System.out.println("error en la consulta"+e.getMessage());
		return null;
		}
		} //de consultarporTitulo
        //
		//
	public ResultSet consultarTodosResultSet() throws SQLException{
		Statement consulta = conecta.createStatement();
		return consulta.executeQuery ("SELECT * FROM Libros");
	}
	//
	public void desconectar() throws SQLException {
		if (conecta !=null) {
			conecta.close();
		}
	}
}