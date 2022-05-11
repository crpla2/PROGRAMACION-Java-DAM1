package Ejercicio1_S5;

public class Main5 {

	public static void main(String[] args) {
		AccesoBD_S5.conectar_TRANSACCION();
		
		EmpleadoS5 e1 = new EmpleadoS5(1, "CARRERA", "PROFESOR", 7788, dateToSqlDate.fechaSQL("1982-11-03"), 700, 0, 20);
		
		System.out.println(AccesoBD_S5.insertarConBean_TRANSACCION(e1)); // 1 (y se inserta en la tabla)
	
		System.out.println(AccesoBD_S5.insertarConBean_TRANSACCION(e1)); 
	
		System.out.println("Subir un 20% el salario de los empleados del Departamento 30");
		System.out.println(AccesoBD_S5.actualizarSalario_TRANSACCION(30, 0.2)); //6
		
		System.out.println(AccesoBD_S5.actualizarSalario_TRANSACCION(44, 0.15));//0
		
		System.out.println(AccesoBD_S5.borrarEmpleado_TRANSACCION(1));
		
		System.out.println(AccesoBD_S5.borrarEmpleado_TRANSACCION(99));
	
		System.out.println(AccesoBD_S5.borrarEmpleado_TRANSACCION(7839));
		
		AccesoBD_S5.desconectar_TRANSACCION();
		
	}
}
