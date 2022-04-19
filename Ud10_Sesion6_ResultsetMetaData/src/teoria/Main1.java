package teoria;
import java.sql.*;		// Alberto Carrera Martín - Abril 2020

public class Main1 {
	private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String database = "empleados";
    private static String hostname = "localhost";
    private static String port = "3306";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database +
									"?useSSL=false" + "&serverTimezone=Europe/Madrid";
    private static String username = "root";
    private static String password = "root";

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String mensaje="";
		Class.forName(driver);
		Connection conexion = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = conexion.prepareStatement("SELECT * FROM empleados WHERE dpto=?");
		ps.setInt(1, 10); // P.ej. para el Departamento 10
	    ResultSet rs = ps.executeQuery();
	    // Recordad que el ResultSet es el conjunto de filas que nos devuelve
	    // el gestor de base de datos (MySQL en este caso) tras enviarle
	    // una sentencia Select como la anterior
	    //-----------------------------------------------------------------------------------------
	    mensaje = mensaje +
	    		"empno_id\tnombre\t\t\toficio\t\tdir_id\t\talta\t\tsalario\tcomision\tdpto \n";
	    // Paso a recorrer cada fila del ResultSet
	    while (rs.next()){
	    	// De cada fila extraigo sus columnas.
	    	mensaje= mensaje + rs.getInt("empno_id") + "\t\t"+ rs.getString ("nombre")+ "\t"+ rs.getString("oficio")
	    					+ "\t"+ rs.getInt("dir_id") + "\t\t"+ rs.getDate("alta") + "\t"+ rs.getInt("salario")
	    					+ "\t"+ rs.getInt("comision") + "\t\t"+ rs.getInt("dpto") + "\n";				 
	    }
	    System.out.println("Empleados del departamento 10:");
	    
	    System.out.println(mensaje);
	    ps.close();
	    rs.close();
	    conexion.close();	 
	}

}


