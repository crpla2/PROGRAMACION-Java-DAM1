package _03_01colecciones2;

import java.util.LinkedList;

public class PilaPalabras1 {
	
	LinkedList<String> pila;

	public PilaPalabras1() {
		pila = new LinkedList<String>();
	}
	
	public void apilarPalabra(String palabra) {
		pila.addLast(palabra);
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
	
	public String imprimir() {
		String cadena ="";
		for(int i=0; i<pila.size();i++) {
			cadena=cadena+pila.get(i)+"\n";
		}
		return cadena;
	}
}
