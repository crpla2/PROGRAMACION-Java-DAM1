package TreeSetPersonas;

import java.util.TreeSet;

public class PruebaLista {

	public static void main(String[] args) {
		Lista l= new Lista();
		l.insertar(new Persona(1234567,31,"Luis","Aldea Navarro"));
		l.insertar(new Persona(1234567,31,"Luis","Aldea Navarro"));
		l.insertar(new Persona(2345678,39,"Belén","Carrera Sausán"));
		l.insertar(new Persona(3456789,61,"Antonio","Lasierra Gardena"));
		l.insertar(new Persona(4567890,42,"Alberto","Carrera Martin"));
		l.insertar(new Persona(5678901,38,"Ana","Ereza Ferrer"));
		//System.out.println(l.tamanyo());
		//System.out.println(l.vacia());
		System.out.println(l);
		//System.out.println(l.buscarPorDni(4567890));
		//System.out.println(l.borrarPersonaPorDni(4567890));
		//System.out.println(l.buscarPorApellido("Carr"));
		/*
		TreeSet<Persona> encontrados=l.buscarPorApellido2("Carr");
		for (Persona persona : encontrados) {
			System.out.println(persona);
		}
		*/
	}

}
