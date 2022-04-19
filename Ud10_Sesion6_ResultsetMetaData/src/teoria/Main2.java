package teoria;
import java.sql.*;
// https://docs.oracle.com/en/java/javase/14/docs/api/java.sql/java/sql/ResultSetMetaData.html
// Alberto Carrera Martín - Abril 2020

public class Main2 {
	private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String database = "empleados";
    private static String hostname = "localhost";
    private static String port = "3306";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database +
									"?useSSL=false" + "&serverTimezone=Europe/Madrid";
    private static String username = "root";
    private static String password = "root";

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		Connection conexion = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = conexion.prepareStatement("SELECT * FROM empleados WHERE dpto=?");
		ps.setInt(1, 10); // P.ej. para el Departamento 10
	    ResultSet rs = ps.executeQuery();
	    
	    // En este primer bucle for obtengo el encabezado del listado.
	    // Es decir, el nombre de las columnas del ResultSet:
	    // empno_id	nombre	oficio	dir_id	alta	salario	comision	dpto	
			      
		// El método getMetaData aplicado a un ResultSet nos devuelve un objeto
	    // de tipo ResultSetMetaData indicándonos el número, tipo y propiedades 
	    // de las columnas que forman el ResultSet. Si le aplicamos además el método getColumnCount() 
	    // nos devuelve exactamente el número de columnas  (8 en este caso)
	    
		for (int x=1;x<=rs.getMetaData().getColumnCount();x++)
				// Recorro cada una de las columnas para conocer su NOMBRE
				// getColumName(1) es el nombre  de la 1ª columna (empnp_id en este caso)
				// getColumName(8) es el nombre de la 8ª columna (dpto en este caso)...
				System.out.print(rs.getMetaData().getColumnName(x)+ "\t");
			      
		System.out.println("");
			      
		
		while(rs.next()) {
			// Recorro una a una cada una de las filas del ResultSet y le pregunto
			// por el CONTENIDO de cada una de sus columnas. 
			// Observad que extraigo TODAS las columnas como String.
			
			for (int x=1;x<=rs.getMetaData().getColumnCount();x++)
					System.out.print(rs.getString(x)+ "\t");
			      
			System.out.println("");
		}
		ps.close();
		rs.close();
		conexion.close();
	}
}


