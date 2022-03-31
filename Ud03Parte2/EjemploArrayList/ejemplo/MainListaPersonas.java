package ejemplo;
import java.util.ArrayList;

public class MainListaPersonas {

	public static void main(String[] args) {
		
		ListaPersonas l= new ListaPersonas();
		
		
		Persona p1 = new Persona(6789012,25,"Clara","Cirac Nerin");
		l.insertar(new Persona(1234567,31,"Luis", "Aldea Navarro"));
		l.insertar(new Persona(2345678,39,"Belén", "Carrera Sausán"));
		l.insertar(new Persona(3456789,69,"Antonino", "Lasierra Gardena"));
		l.insertar(new Persona(4567890,42,"Alberto", "Carrera Martín"));
		l.insertar(new Persona(5678901,38,"Ana", "Ereza Ferrer"));
		l.insertar(p1);
		
		//System.out.println(l.vacia());
		//System.out.println(l.tamanyo());
		
		
		//System.out.println(l.recuperar(1));
		//System.out.println(l.borrarPersonaPosicion(1));
		//System.out.println(l);
		//System.out.println(l.recuperar(l.buscarPorDni(5678901)));
		//l.borrarPersonaPorDni(5678901);
		//System.out.println(l);
		//System.out.println(l.buscarPorApellido("alDea"));
		//System.out.println(l.buscarPorApellido2("alDea"));
		//System.out.println(l.buscarPorApellido2("wojpjfp"));
		ArrayList<Persona>encontrados=(l.buscarPorApellido2("carre"));
		for(Persona p:encontrados)
			System.out.println(p);
	}

}
