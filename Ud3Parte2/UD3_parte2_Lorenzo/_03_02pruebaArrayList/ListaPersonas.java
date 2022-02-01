package _03_02pruebaArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class ListaPersonas {
	
	ArrayList<Persona> lista;

	public ListaPersonas() {
		lista = new ArrayList<Persona>();
	}

	public int tamanyo() {
		return lista.size();
	}
	
	public boolean vacia() {
		//return lista.size()==0;
		return lista.isEmpty();
	}
	
	public boolean insertar(Persona p) {
		return lista.add(p);
	}

	public Persona recuperar(int posicion) {
		if(posicion > lista.size() || posicion < 1) {
			return null;
		}
		return lista.get(posicion-1);
	}
	
	public Persona borrarPersonaPosicion(int posicion) {
		if(posicion > lista.size() || posicion < 1) {
			return null;
		}
		return lista.remove(posicion-1);
	}
	
	public int buscarPosicionPorDni(long num) {
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).dameNif().dameDni() == num) {
				return i+1;
			}
		}
		return -1; //no lo he encontrado
	}
	
	public Persona borrarPersonaPorDni(long num) {
		int posicion = buscarPosicionPorDni(num);
		if (posicion==-1) {
			return null;
		}
		return borrarPersonaPosicion(posicion);
	}
	
	/*
	public String buscarPorApellido(String apellido) {
		String cadena="";
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).dameApellidos().toUpperCase().contains(apellido.toUpperCase())) {
				cadena=cadena+lista.get(i)+"============\n";
			}
		}
		return cadena;
	}
	*/
	
	public ArrayList<Persona> buscarPorApellido(String apellido) {
		ArrayList<Persona> encontrados= new ArrayList<Persona>();
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).dameApellidos().toUpperCase().contains(apellido.toUpperCase())) {
				encontrados.add(lista.get(i));
			}
		}
		return encontrados;
	}
	
	public String toString() {
		String cadena="";
		
	/*	for(int i=0;i<lista.size();i++) {
			cadena=cadena+lista.get(i)+"==========================\n";
		}
	*/	
	/*	
		for (Persona p: lista) {
			cadena=cadena+p+"==========================\n";
		}
	*/	
		Iterator it = lista.iterator();
		while (it.hasNext()) {
			cadena=cadena+it.next()+"==========================\n";
		}
		return cadena;
	}
	

}
