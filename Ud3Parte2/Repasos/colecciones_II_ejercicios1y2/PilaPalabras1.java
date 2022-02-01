package colecciones_II_ejercicios1y2;
import java.util.LinkedList;

public class PilaPalabras1 {
	
	LinkedList <String> pila;
	
	public  PilaPalabras1() {
		pila= new LinkedList<String>();
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
	
	public void imprimePila() {
		for(String s: pila)
			System.out.println(s);
	}
}
