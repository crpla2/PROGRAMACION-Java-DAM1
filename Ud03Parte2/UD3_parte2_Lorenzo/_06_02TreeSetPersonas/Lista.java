package _06_02TreeSetPersonas;

import java.util.TreeSet;

public class Lista {
	
	private TreeSet<Persona> lista;
	
	public Lista() {
		//lista = new TreeSet<Persona>(new ApellidosComparator());
		//lista = new TreeSet<Persona>(new EdadComparator());
		lista = new TreeSet<Persona>();
	}
	
	public Lista(TreeSet<Persona> ts) {
		lista = ts;
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
			if (persona.dameNif().dameDni()==num)
				return persona;
		}
		return null;
	}
	
	public boolean borrarPersonaPorDni(long num) {
		for (Persona persona : lista) {
			if (persona.dameNif().dameDni()==num) 
				return lista.remove(persona);
		}
		return false;
	}
	
	public String buscarPorApellido(String apellido) {
		String cadena="";
		for (Persona persona : lista) {
			if(persona.dameApellidos().toUpperCase().contains(apellido.toUpperCase()))
				cadena=cadena+persona+"\n";
		}
		return cadena;
	}
	
	public TreeSet<Persona> buscarPorApellido2(String apellido) {
		TreeSet<Persona> encontrados = new TreeSet<Persona>();
		for (Persona persona : lista) {
			if(persona.dameApellidos().toUpperCase().contains(apellido.toUpperCase()))
				encontrados.add(persona);
		}
		return encontrados;
	}
	
	public String toString() {
		String cadena = "";
		for(Persona p : lista) {
			cadena=cadena+p+"\n";
		}
		return cadena;
	}
}
