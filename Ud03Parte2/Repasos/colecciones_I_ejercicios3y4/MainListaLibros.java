package colecciones_I_ejercicios3y4;

public class MainListaLibros {

	public static void main(String[] args) {
		
//		Libro l1=new Libro();
//		l1.leer();
//		System.out.println(l1);
		Libro l2= new Libro("La historia interminable",new Persona("Michael","Ende"),"12345",1000,18,"Lincon, Massatchussets(USA)",new Fecha(12,10,1927));
		Libro l3= new Libro("Parque Jurasico",new Persona("Michael","Chricton"),"23456",589,7,"Londres, Gran Bretaña(RU)",new Fecha(10,07,2001));
		Libro l4= new Libro("La metamorfosis",new Persona("Frankz","Kafka"),"34567",234,11,"Orlando, Florida",new Fecha(7,06,1987));
		Libro l5= new Libro("cien años de soledad",new Persona("Gabriel","Garcia"),"45678",245,8,"Medellin, Colombia",new Fecha(23,05,1976));
	
		ListaLibros lista1= new ListaLibros();
//		System.out.println(lista1.listaVacia());
		lista1.insertarLibro(l2);
		lista1.insertarLibro(l3);
		lista1.insertarLibro(l4);
		lista1.insertarLibro(l5);
//		System.out.println(lista1.insertarLibro(l5));
//		System.out.println(lista1.listaLlena());
//		System.out.println(lista1.tamanyo());
//		System.out.println(lista1);
//		System.out.println(lista1.buscaLibro("par"));
//		System.out.println(lista1.obtenerPorPosicion(lista1.buscaLibro("par")));
		lista1.eliminarPorPosicion(lista1.buscaLibro("la m"));
//		lista1.eliminarPorPosicion(1);
		System.out.println(lista1);
	
	
	}

}
