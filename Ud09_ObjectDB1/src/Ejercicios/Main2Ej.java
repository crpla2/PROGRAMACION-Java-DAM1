package Ejercicios;
import java.text.ParseException;

public class Main2Ej {

	public static void main(String[] args) throws ParseException {
        
		AccesoBdatosEj abd = new AccesoBdatosEj();
		abd.conectar();
	//	abd.imprimirDepartamento(90);
	//	abd.imprimirDepartamento(40);
	//	abd.imprimirDepartamento(10);
		
    //  System.out.println(abd.insertarDepartamento(new DepartamentoEntity(60,"Recursos Humanos", "Chimillas")));
    //  System.out.println(abd.insertarDepartamento(new DepartamentoEntity(60,"Recursos Humanos", "Chimillas")));
    //  abd.imprimirDepartamento(60);
		
	//	System.out.println(abd.modificarDepartamento(new DepartamentoEntity(88,"RRHH", "Huerrios")));
	//	System.out.println(abd.modificarDepartamento(new DepartamentoEntity(60,"RRHH", "Esquedas")));
	//	abd.imprimirDepartamento(60);
		
	//	abd.borrarDepartamento(88); // false no existe
	//	abd.borrarDepartamento(60); // true
	//	abd.borrarDepartamento(10); // false pues tiene empleados
		
	//	abd.imprimirDepartamento(10);
	
	
	//  abd.demoJPQL();
//		Ejercicio1
//		abd.nombreFecha();
//		Ejercicio2
//		abd.nombreFecha2("Carrera");
//		Ejercicio3
//		abd.empleadosID();
//		Ejercicio4
//		abd.mas2003();
//		Ejercicio5
//		abd.EmpOrdenados();
//		Ejercicio6
//		abd.depConEmp();
//		Ejercicio7
//		abd.depConEmpMas5();
//		Ejercicio8
		abd.EmpCOnJefe();
		
		abd.desconectar();
	

	}

}

