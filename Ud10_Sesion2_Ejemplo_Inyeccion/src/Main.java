/*
 * Revisado para versión 8.0.19 de MySQL 
 * Alberto Carrera Martín
 * 16 marzo 2020
 */
import java.sql.*;

public class Main {
	private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String database = "sample";
    private static String hostname = "localhost";
    private static String port = "3308";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database +
									"?serverTimezone=Europe/Madrid";
    private static String username = "root";
    private static String password = "root";
	
	public static Usuario LoginError(String uname, String pass) throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);

		  try {
		    
		    String sql = "SELECT * FROM usuario WHERE username='" + uname + "' AND password='" + pass + "'";
		    Statement st = conn.createStatement();
		    ResultSet rs = st.executeQuery(sql);
		    Usuario u = null;
		    if (rs.next()) {
		        u =new Usuario(rs.getString(1), rs.getString(2), rs.getString(3));
		    }
		    rs.close();
		    st.close();
		    return u;
		  } finally {
		    if (conn != null) {
		      conn.close();
		    }
		  }
		}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		System.out.println ("Resultado línea 41 -> " + LoginError("Alberto", "11111"));
//		System.out.println ("Resultado línea 42 -> " +LoginError("Alberto", "12345"));
//		System.out.println ("Resultado línea 43 -> " +LoginError("x", "' OR ''='"));
		System.out.println ("Resultado línea 44 -> " +LoginError("xxx", "' OR username='admin"));
		
	}

}
