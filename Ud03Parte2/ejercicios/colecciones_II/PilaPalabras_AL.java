package colecciones_II;

import java.util.ArrayList;

public class PilaPalabras_AL {
	ArrayList <String> pila_AL;
	
	public PilaPalabras_AL() {
		pila_AL = new ArrayList<String>();
	}
	
	public void apilarPalabra(String s) {
		pila_AL.add(s);
	}
	
	public String desapilarPalabra() {
		return pila_AL.remove(pila_AL.size()-1);
	}
	
	public String obtenerPalabraPila() {
		return pila_AL.get((pila_AL.size())-1);		
	}
	
	public boolean pilaPalabrasVacia() {
		return pila_AL.isEmpty();
	}
	
	public String imprimir() {
		String cadena="";
		for(String s:pila_AL)
			cadena=cadena+s+" ";
		return cadena;
	}
}