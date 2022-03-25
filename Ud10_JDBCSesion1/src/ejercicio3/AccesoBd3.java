package ejercicio3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ejercicio1.Socio;

public class AccesoBd3 {
	
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "baloncesto";
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
	
	
	public ArrayList<Socio> consultarTodosSocios() {
		ArrayList<Socio> lista = new ArrayList<Socio>();

		try {
			Statement consulta = conecta.createStatement();
			ResultSet reg = consulta.executeQuery("SELECT * FROM socio");
			while (reg.next()) { // reg.getint(id..), reg.getint(nombre), reg.getint(precio)
				Socio socio = new Socio(reg.getInt(1), reg.getString(2), reg.getInt(3), reg.getInt(4),
						reg.getString(5));
				lista.add(socio);
			}
			consulta.close();
		} catch (SQLException e) {
			return null;
		}
		return lista;
	}

	public Socio consultarIdSocios(int numero) {
		try {
			Statement consulta = conecta.createStatement();
			ResultSet reg = consulta.executeQuery("SELECT * FROM socio WHERE id =" + numero);

			Socio socio = new Socio();
			if (reg.next()) {

				socio.setId(reg.getInt(1));
				socio.setNombre(reg.getString(2));
				socio.setEstatura(reg.getInt(3));
				socio.setEstatura(reg.getInt(4));
				socio.setLocalidad(reg.getString(5));
			} else
				socio = null;
			consulta.close();
			return socio;
		} catch (SQLException e) {
			System.out.println("error en la consulta" + e.getMessage());
			return null;
		}
	} // de consultarId

	//

	public ArrayList<Socio> consultarPorLocalidadSocios(String localidad) {
		ArrayList<Socio> lista = new ArrayList<Socio>();
		try {
			Statement consulta = conecta.createStatement();

			ResultSet reg = consulta.executeQuery("SELECT * FROM socio  where localidad LIKE '" + localidad + "'");

			while (reg.next()) {

				Socio libro = new Socio(reg.getInt(1), reg.getString(2), reg.getInt(3), reg.getInt(4),
						reg.getString(5));
				lista.add(libro);
			}
			consulta.close();
			
			return lista;
		} catch (SQLException e) {
			System.out.println("error en la consulta" + e.getMessage());
			return null;
		}
	}

	public void consultarTodosResultSetSocios() throws SQLException {
		Statement consulta = conecta.createStatement();
		imprimirDatosResulSet(consulta.executeQuery("SELECT * FROM socio"));
	}

	public ResultSet consultarTodosRSetSocios() throws SQLException {
		Statement consulta = conecta.createStatement();
		ResultSet reg= consulta.executeQuery("SELECT * FROM socio");
		return reg;
	}
	
	public ResultSet consultarPorLocRS(String localidad) throws SQLException {
		
		
			Statement consulta = conecta.createStatement();

			ResultSet reg = consulta.executeQuery("SELECT * FROM socio  where localidad LIKE '" + localidad + "'");

			return reg;
		
	}
	public void imprimirDatosResulSet(ResultSet reg) {
		try {
			int cont = 0;
			while (reg.next()) {
				System.out.println(reg.getInt(1) + "-" + reg.getString(2) + "-" + reg.getInt(3) + "-" + reg.getInt(4)
						+ "-" + reg.getString(5));
				cont++;
			}
			System.out.println("Total: "+cont);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void desconectar() throws SQLException {
		if (conecta != null) {
			conecta.close();
		}}

}
