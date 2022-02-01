package colecciones_III_ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class ArrayListLibros {

	ArrayList<Libro> lista;

	public ArrayListLibros() {
		lista = new ArrayList<Libro>();
	}

	public boolean vacia() {
		return lista.isEmpty();
	}
	
	public int tamanyo() {
		return lista.size();
	}
	
	public boolean existe(Libro libro) {
		for (Libro l:lista)
			if (l.equals(libro))
				return true;
		return false;
	}
	
	public boolean insertar(Libro libro) {
		if(existe(libro))
			return false;
		return lista.add(libro);
	}
	
	public int buscarPosicion(Libro libro) {
		for(Libro l:lista)
			if(l.equals(libro))
				return lista.indexOf(libro)+1;
		return -1;
	}
	
	public boolean eliminar(int posicion) {
		if(posicion<1||posicion>lista.size()||vacia())
			return false;
		lista.remove(posicion-1);
		return true;
	}
	
	public Libro recuperarPorPosicion(int posicion) {
		if(posicion<1||posicion>lista.size()||vacia())
			return null;
		return lista.get(posicion+1);
	}
	
	public int buscar(String cadena) {
		for (Libro libro:lista)
			if(libro.getTitulo().toLowerCase().contains(cadena.toLowerCase()))
				return lista.indexOf(libro);
		return -1;
	}
	
	public void ordenarTitulo(){
		Collections.sort(lista,new TituloComparator());
	}
	
	public void ordenarPáginas() {
		Collections.sort(lista, new PaginasComparator());
	}

	@Override
	public String toString() {
		String cadena="";
		for(Libro l:lista)
			cadena=cadena+l+"\n---------------------\n";
		return cadena;
	}
	
	
}
