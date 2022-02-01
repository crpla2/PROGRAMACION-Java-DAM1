package Pila_y_mapa;

import java.util.LinkedList;

public class PilaPalabras {
	private LinkedList<String> pila;
	
	public PilaPalabras () {
		pila =new LinkedList<String>();
	}
	
	public boolean apilarPalabra(String palabra) {
		return pila.add(palabra);
	}
	
	public String desapilarPalabra() {
		return pila.removeLast();
	}
	
	public String obtenerPalabraCima() {
		return pila.getLast();
	}
	
	public boolean pilaPalabrasVacia() {
		return pila.isEmpty();
	}

	@Override
	public String toString() {
		return "PilaPalabras [pila=" + pila + "]";
	}
	
	
	

}
