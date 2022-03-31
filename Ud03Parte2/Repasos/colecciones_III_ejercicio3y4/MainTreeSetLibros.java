package colecciones_III_ejercicio3y4;

public class MainTreeSetLibros {

	public static void main(String[] args) {
		Libro l2= new Libro("La historia interminable",new Persona("Michael","Ende"),"12345",1000,18,"Lincon, Massatchussets(USA)",new Fecha(12,10,1927));
		Libro l3= new Libro("Parque Jurasico",new Persona("Michael","Chricton"),"23456",589,7,"Londres, Gran Bretaña(RU)",new Fecha(10,07,2001));
		Libro l4= new Libro("La metamorfosis",new Persona("Frankz","Kafka"),"34567",234,11,"Orlando, Florida",new Fecha(7,06,1987));
		Libro l5= new Libro("Cien años de soledad",new Persona("Gabriel","Garcia"),"45678",245,8,"Medellin, Colombia",new Fecha(23,05,1976));
		Libro l6= new Libro("Cien años de soledad",new Persona("Gabriel","Garcia"),"45679",245,8,"Medellin, Colombia",new Fecha(23,05,1976));
	
		TreeSetLibros lista1= new TreeSetLibros();
		lista1.insertar(l6);
		lista1.insertar(l5);
		lista1.insertar(l4);
		lista1.insertar(l3);
		lista1.insertar(l2);
//		System.out.println(lista1.insertar(l2));	
		System.out.println(lista1);
		System.out.println(lista1.buscar("x"));
		System.out.println(lista1.eliminar(l3));
		System.out.println(lista1.existe(l3));
		System.out.println(lista1);
		lista1.buscar2("j");
		
	}

}
