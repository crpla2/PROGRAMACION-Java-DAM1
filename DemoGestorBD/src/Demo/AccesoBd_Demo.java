package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccesoBd_Demo {

	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "demodb";
	private static String hostname = "localhost";
	private static String port = "3309";
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

	public Empleado consultaPorNumeroSocio(int numero) throws SQLException {
		Empleado e = new Empleado();
		String cadenaSQL = "select * from emp where EMPNO = ?  ";
		PreparedStatement consulta = conecta.prepareStatement(cadenaSQL);
		consulta.setInt(1, numero);
		ResultSet reg = consulta.executeQuery();
		if (reg.next()) {
			e.setNumero(reg.getInt(1));
			e.setNombre(reg.getString(2));
			e.setPuesto(reg.getString(3));
			e.setJefe(reg.getInt(4));
			e.setAntiguedad(reg.getDate(5));
			e.setSalario(reg.getDouble(6));
			e.setComision(reg.getDouble(7));
			e.setDepartamento(reg.getInt(8));
			return e;
		} else
			return null;

	}
	
	public ArrayList<Empleado> consultaPorAntiguedad(java.sql.Date fecha) throws SQLException{
		ArrayList<Empleado>lista=new ArrayList<Empleado>();
		String cadenaSQL="select * from emp where HIREDATE <= ?";
		PreparedStatement consulta= conecta.prepareStatement(cadenaSQL);
		consulta.setDate(1, fecha);
		ResultSet reg=consulta.executeQuery();
		while(reg.next()) {
			lista.add(new Empleado(
				reg.getInt(1),
				reg.getString(2),
				reg.getString(3),
				reg.getInt(4),
				reg.getDate(5),
				reg.getDouble(6),
				reg.getDouble(7),
				reg.getInt(8)));
		}
		
		return lista;
		
	}
	

	public void desconectar() throws SQLException {
		if (conecta != null) {
			conecta.close();
		}
	}
}
