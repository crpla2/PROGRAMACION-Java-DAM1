package Ejercicio1_S3;

import java.sql.SQLException;





public class Main {
	static AccesoBD_S3 abd= new AccesoBD_S3();
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		abd.conectar();
//		System.out.println(abd.busquedaPorCodigo(100));
//		System.out.println(abd.busquedaPorCodigo(7788));
//		System.out.println(abd.busquedaPorPuesto("Profesor"));
//		System.out.println(abd.busquedaPorPuesto("CLERK"));
		
		System.out.println("Empleados contratados antes del 22 de febrero de 1981");
		System.out.println("=====================================================");
		System.out.println(abd.consultaPorAntiguedad(dateToSqlDate.fechaSQL("1981/02/22")));
		abd.desconectar();
	}

}
