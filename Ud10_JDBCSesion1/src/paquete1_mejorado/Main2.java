/*
 * Alberto Carrera Martín 
 * 1 de marzo de 2020
 * 
 * Ejemplo preparado para movimientos por el RESULTSET
 * 
 */
package paquete1_mejorado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) throws SQLException {
		Libro primerLibro, ultimoLibro;
		AccesoBdatos abd=new AccesoBdatos();
		//
		try {
			abd.conectar();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("NO SE PUDO ESTABLECER CONEXIÓN");
			System.exit(-1);
		}
		
		ResultSet rs = abd.consultarTodosResultSet();
		System.out.print("¿Donde estoy situado --> " + rs.getRow());
		System.out.println(" - ¿Antes de la primera? --> " + rs.isBeforeFirst());
		System.out.println("-------------------------------------------------------");
		rs.last(); // Ahora me voy ¿Dónde?
		System.out.println("El último libro ocupa la fila " + rs.getRow() + " del ResultSet"); // ¿Qué me está diciendo?
		System.out.println ("Datos del último libro: ");
		System.out.println (rs.getInt (1)+ "-"+ rs.getString (2)+ "-"+ rs.getInt (3));
		rs.next(); // Me muevo detrás del último registro del ResultSet
		System.out.println("¿Estoy detrás del último registro del ResultSet? -->" + rs.isAfterLast()); 
		// Pues sí y si intento leer rs.get........ -->  java.sql.SQLException
		// No le pregunto por número de fila, getRow, pues no me sirve el valor (devuelve 0)
		
		System.out.println("-------------------------------------------------------");
		System.out.println ("Ahora me voy al primer libro del ResultSet: ");
		rs.first();
		System.out.println ("Datos del primer libro: ");
		System.out.println (rs.getInt (1)+ "-"+ rs.getString (2)+ "-"+ rs.getInt (3));
		//
		//
		System.out.println("-------------------------------------------------------");
		System.out.println ("Ahora me voy al siguiente libro del ResultSet. Tengo dos alternativas ");
		// La Primera -->  rs.next();
		rs.absolute(2); // La segunda alternativa
		System.out.println ("Datos del segundo libro: ");
		System.out.println (rs.getInt (1)+ "-"+ rs.getString (2)+ "-"+ rs.getInt (3));
		//
		System.out.println("-------------------------------------------------------");
		System.out.println ("Ahora me vuelvo al primer libro del ResultSet de otra manera: ");
		rs.previous();
		System.out.println (rs.getInt (1)+ "-"+ rs.getString (2)+ "-"+ rs.getInt (3));
		//
		System.out.println("-------------------------------------------------------");
		System.out.print ("¿Sigo en la primera fila? Voy a ver --> ");
		System.out.println (rs.getRow());
		try {
			abd.desconectar();
		} catch (SQLException e) {
			System.out.println("NO SE PUDO DESCONECTAR - NO SE LLEGÓ A ESTABLECER CONEXIÓN");
			System.exit(-1);
		}
	}

}
