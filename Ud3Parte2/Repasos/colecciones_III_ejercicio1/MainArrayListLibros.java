package colecciones_III_ejercicio1;

import java.util.ArrayList;

public class MainArrayListLibros {

	public static void main(String[] args) {
		
		Libro l2= new Libro("La historia interminable",new Persona("Michael","Ende"),"12345",1000,18,"Lincon, Massatchussets(USA)",new Fecha(12,10,1927));
		Libro l3= new Libro("Parque Jurasico",new Persona("Michael","Chricton"),"23456",589,7,"Londres, Gran Bretaña(RU)",new Fecha(10,07,2001));
		Libro l4= new Libro("La metamorfosis",new Persona("Frankz","Kafka"),"34567",234,11,"Orlando, Florida",new Fecha(7,06,1987));
		Libro l5= new Libro("Cien años de soledad",new Persona("Gabriel","Garcia"),"45678",245,8,"Medellin, Colombia",new Fecha(23,05,1976));
		Libro l6= new Libro("Cien años de soledad",new Persona("Gabriel","Garcia"),"45679",245,8,"Medellin, Colombia",new Fecha(23,05,1976));
	
		ArrayListLibros  lista = new ArrayListLibros();
		lista.insertar(l5);
		lista.insertar(l4);
		lista.insertar(l3);
		lista.insertar(l2);
//		System.out.println(lista.insertar(l5));
		System.out.println(lista.insertar(l6));
//		System.out.println(lista.buscar("p"));
		System.out.println(lista);
//		System.out.println(lista.tamanyo());
//		System.out.println(lista.existe(l3));
//		System.out.println(lista.eliminar(lista.buscarPosicion(l3)));
//		System.out.println(lista.existe(l3));
		lista.ordenarTitulo();
		System.out.println(lista);
		lista.ordenarPáginas();
		System.out.println(lista);
	
	}

}
