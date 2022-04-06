package Ejercicio1_S3;

import java.sql.SQLException;





public class Main {
	static AccesoBD_S3 abd= new AccesoBD_S3();
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		abd.conectar();
		//C
//		System.out.println(abd.busquedaPorCodigo(100));
//		System.out.println(abd.busquedaPorCodigo(7788));
		//D
//		System.out.println(abd.busquedaPorPuesto("Profesor"));
//		System.out.println(abd.busquedaPorPuesto("CLERK"));
		//E
//		System.out.println("Empleados contratados antes del 22 de febrero de 1981");
//		System.out.println("=====================================================");
		System.out.println(abd.consultaPorAntiguedad(dateToSqlDate.fechaSQL("1981/02/22")));
		//F
//		Empleado e1 = new Empleado(1, "CARRERA", "PROFESOR", 7788, dateToSqlDate.fechaSQL("2020/03/18"), 700, 0, 20);
//		System.out.println(abd.insertarConBean(e1)); // 1 (y se inserta en la tabla)
//		//Repito la misma instrucción:
//		System.out.println(abd.insertarConBean(e1)); 
//		// 1062, ya existe un registro con esa clave!!!!
		//G
//		Empleado e2 = new Empleado(10, "CARRERA", "PROFESOR", 7788, dateToSqlDate.fechaSQL("2020/03/18"), 700, 0, 35);
//		System.out.println(abd.insertarConBean(e2)); 
//		//Ya existe un registro con esa clave, ERROR: 1452 El numero de departamento no existe, da error por la clave foranea
//		//H
//		Empleado e3 = new Empleado(10, "CARRERA", "PROFESOR",null, dateToSqlDate.fechaSQL("2020/03/18"),null, 35);
//		System.out.println(abd.insertarConBean(e3)); 
		//I
		System.out.println("Subir un 20% el salario de los empleados del Departamento 30");
		System.out.println(abd.actualizarSalario(30, 0.2)); //6
//		//
		System.out.println("Subir un 15% el salario de los empleados del Departamento 44");
		System.out.println(abd.actualizarSalario(44, 0.15));//0
//		// No existe el departamento 44
		//J
//		System.out.println(abd.borrarEmpleado(1));
		//1 - Se ha borrado el empleado de código 1 de la tabla
//		System.out.println(abd.borrarEmpleado(99));
		//0 – No se ha borrado ninguno pues no existe el empleado 99
//		System.out.println(abd.borrarEmpleado(7839));
		//1 – Se ha borrado el empleado 7839.
		
		abd.desconectar();
	}

}
