package Ejercicios;
import java.text.ParseException;

public class Main2Ej {

	public static void main(String[] args) throws ParseException {
        
		AccesoBdatosEj abd = new AccesoBdatosEj();
		abd.conectar();

//		abd.Ejercicios();
//		System.out.println(abd.incrementarSalario(-1000));
//		System.out.println(abd.incrementarOficio("Empleado", -1000));
//		System.out.println(abd.incrementarSalarioDepartamento(10,-1000));
		System.out.println(abd.borrarEmpleado(1039));
		System.out.println(abd.borrarDepartamento(10));
//		
		abd.desconectar();
	

	}

}

