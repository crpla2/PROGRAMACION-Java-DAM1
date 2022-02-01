package TreeSetPersonas;

import java.util.TreeSet;

public class Lista {

	private TreeSet<Persona> lista;
	
	public Lista() {
		//lista=new TreeSet<Persona>(new EdadComparator());
		//lista=new TreeSet<Persona>(new ApellidosComparator());
		lista=new TreeSet<Persona>();//Comparador Natural de Clase Persona
	}
	public int tamanyo() {
		return lista.size();
	}
	public boolean vacia() {
		return lista.isEmpty();
	}
	public boolean insertar(Persona p) {
		return lista.add(p);
	}
	public Persona buscarPorDni(long num) {
		for (Persona persona : lista) {
			if(persona.dameNif().dameDni()==num)
				return persona;
		}
		return null;
	}
	public boolean borrarPersonaPorDni(long num) {
		for (Persona persona : lista) {
			if(persona.dameNif().dameDni()==num) {
				return lista.remove(persona);
			}
		}
		return false;
	}
	public String buscarPorApellido(String Apellido) {
		String cad="";
		for (Persona persona : lista) {
			if(persona.dameApellidos().toUpperCase().contains(Apellido.toUpperCase()))
				cad+=persona+"\n";
		}
		return cad;
	}
	public TreeSet<Persona> buscarPorApellido2(String Apellido){
		TreeSet<Persona> personas = new TreeSet<Persona>();
		for (Persona persona : lista) {
			if(persona.dameApellidos().toUpperCase().contains(Apellido.toUpperCase()))
				personas.add(persona);
		}
		return personas;
	}
	public String toString() {
		String cad="";
		for (Persona persona : lista) {
			cad+=persona+"\n";
		}
		return cad;
	}
}
