package Colecciones_II_ejercicios1y2;
import java.util.ArrayList;
public class PilaPalabras2 {

	ArrayList<String> pila;
	public PilaPalabras2() {
		pila=new ArrayList<String>();
	}
	public void apilarPalabra(String palabra) {
		pila.add(palabra);
	}
	public void imprimir() {
		for (String string : pila) {
			System.out.println(string);
		}
	}
	public String desapilarPalabra() {
		return pila.remove(pila.size()-1);
	}
	public String obtenerPalabraCima() {
		return pila.get(pila.size()-1);
	}
	public boolean pilaPalabrasVacia() {
		return pila.isEmpty();
	}
}
