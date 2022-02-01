package _05_02hashSetPersonas;
import java.util.HashSet;

public class Lista {
	
	private HashSet<Persona> lista;
	
	public Lista() {
		lista = new HashSet<Persona>();
	}
	
	public Lista(HashSet<Persona> hs) {
		lista = hs;
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
	
	public HashSet<Persona> buscarPorApellido2(String apellido) {
		HashSet<Persona> encontrados = new HashSet<Persona>();
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
