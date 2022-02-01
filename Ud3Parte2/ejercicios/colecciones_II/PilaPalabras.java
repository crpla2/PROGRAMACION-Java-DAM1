package colecciones_II;

import java.util.LinkedList;

public class PilaPalabras {
	LinkedList<String> pila;
	
	public PilaPalabras() {
		 pila= new LinkedList<String>();
	}

	public void apilarPlabra(String palabra) {
		pila.addLast(palabra);
	}
	
	public String desabilarPalabra() {
		return pila.removeLast();
	}
	
	public String ObtenerPalabraPila() {
		return pila.getLast();
	}
	
	public boolean pilaPalabrasVacia() {
		return pila.isEmpty();
	}

	public String imprimepPila() {
		String cadena="";
		for(String s: pila)
			cadena=cadena+s+" ";
		return cadena;
	}


}
