package discos;

import java.util.ArrayList;
import java.util.Collections;

public class CD {
	
	ArrayList<Cancion> canciones;
	
	public CD() {
		canciones= new ArrayList<Cancion>();
	}
	
	public int numeroCanciones() {
		return canciones.size();
	}
	
	public Cancion dameCancion(int posicion) {
		return canciones.get(posicion-1);
	}
	
	public boolean grabaCancion(int posicion, Cancion cancion) {
		if (posicion>=canciones.size()||posicion<0)
			return false;
		canciones.set(posicion-1, cancion);
		return true;
	}
	
	public boolean agrega(Cancion cancion) {
		return canciones.add(cancion);
	}
	
	public boolean elimina(int posicion) {
		if  (posicion>=canciones.size()||posicion<0)
			return false;
		canciones.remove(posicion-1);
		return true;
	}
	
	public String imprimeCD() {
		String cadena="";
		for(Cancion c: canciones)
			cadena+=c+"\n";
		return cadena;
	}
	public void ordenarTitulo() {
		Collections.sort(canciones);
	}
	
	
	public void ordenarAutor() {
		canciones.sort(new autorComparator());
	}
	
}
