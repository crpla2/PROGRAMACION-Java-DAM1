package p152_ejercicio_1;

public class MainALAlumnos {

	public static void main(String[] args) {
		
		Alumno a1=new Alumno();
		a1.setApellidos("Rodrigo Pla");
		a1.setDni("123456A");
		a1.setEdad(40);
		a1.setNombre("Carlos");
		Alumno a2=new Alumno("Carlos", "Pisa Gutierrez", "123457B",33);
		Alumno a3=new Alumno ("Andres","Lopez Lopez","123458",36);
		Alumno a4= new Alumno("Pedro","Perez de los Cobos","123459",22);
		
		ArrayListAlumnos lista1= new ArrayListAlumnos();
		lista1.agregar(a4);
		lista1.agregar(a3);
//		System.out.println(lista1.agregar(a4));
		lista1.agregar(a2);
		lista1.agregar(a1);
//		lista1.ordenarApellidos();
//		lista1.imprimir();
		lista1.ordenarEdad();
//		System.out.println(lista1);
//		System.out.println(lista1.buscarApellido("piSA"));
//		System.out.println(lista1.buscarPosicion(a1));
//		System.out.println(lista1.eliminarPorPosicion(2));
//		System.out.println(lista1.existe(a1));
		System.out.println(lista1);
		

	}

}

