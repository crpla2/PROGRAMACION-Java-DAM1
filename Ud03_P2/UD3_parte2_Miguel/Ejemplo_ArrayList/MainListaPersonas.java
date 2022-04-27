package Ejemplo_ArrayList;
import java.util.ArrayList;

public class MainListaPersonas {

	public static void main(String[] args) {
		
		ListaPersona l =new ListaPersona();
		//System.out.println(l.vacia());
		//System.out.println(l.tamanyo());
		Persona p1=new Persona(6789012,25,"Clara","Cirac Nerín");
		l.insertar(new Persona(1234567,31,"Luis","Aldea Navarro"));
		l.insertar(new Persona(2345678, 39,"Belén","Carrera Sausán"));
		l.insertar(new Persona(3456789,61,"Antonino","Lasierra Gardena"));
		l.insertar(new Persona(4567890,42,"Alberto","Carrera Martín"));
		l.insertar(new Persona(5678901,38,"Ana", "Ereza Ferrer"));
		l.insertar(p1);
		//System.out.println(l.recuperar(5));
		//System.out.println(l.borrarPersonaPosicion(1));
		//System.out.println(l);
		//System.out.println(l.recuperar(l.buscarPorDni(5678901)));
		//System.out.println(l.borrarPersonaPorDni(6789012));
		//System.out.println(l.buscarPorApellido2("Carrera"));
		ArrayList<Persona> encontrados=l.buscarPorApellido2("carre");
		for (Persona persona : encontrados) {
			System.out.println(persona);
		}
	}

}
