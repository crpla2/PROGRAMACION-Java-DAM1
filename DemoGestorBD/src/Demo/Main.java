package Demo;

import java.sql.SQLException;
 


public class Main {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBd_Demo abd= new AccesoBd_Demo();
		abd.conectar();
		System.out.println(abd.consultaPorNumeroSocio(100));
		System.out.println(abd.consultaPorNumeroSocio(7369));
		
		System.out.println("Empleados contratados antes del 22 de febrero de 1981");
		System.out.println("=====================================================");
		System.out.println(abd.consultaPorAntiguedad(dateToSqlDate.fechaSQL("1981/02/22")));

		abd.desconectar();
		
	}

}
