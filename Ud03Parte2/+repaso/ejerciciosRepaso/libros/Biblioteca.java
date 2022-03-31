package libros;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {
	private ArrayList<Libro> lista;

	public Biblioteca() {lista = new ArrayList<Libro>();}

	public int tamanyo() {return lista.size();}
	
	public boolean vacio() {return lista.isEmpty();}
	
	public boolean existe(Libro libro) {
		return lista.contains(libro);
	}
	public boolean insertar_(Libro libro) {
		if(existe(libro)) 
			return false;
		lista.add(libro);
		return true;
		
	}
		
	public boolean insertar(int posicion, Libro libro) {
		if(posicion-1 < 0 || posicion-1> lista.size()||existe(libro))
			return false;
		lista.add(posicion-1, libro);
		return true;}
	
	public boolean eliminar(int posicion){
		if (posicion-1>lista.size()||lista.isEmpty())
			return false;
		lista.remove(posicion-1);
		return true;}
	
	public Libro obtener(int posicion) {
		return lista.get(posicion-1);
	}
	
	public int buscar(String parteTitulo) {
		for(Libro l:lista) {
			if (l.getTitulo().toLowerCase().contains(parteTitulo.toLowerCase()))
				return lista.indexOf(l)+1;
		}
		return -1;
	}
	
	public void imprimir() {
		for(Libro l:lista)
			System.out.println(l+"\n");
	}

	
	public void ordena() {
		Collections.sort(lista);
		
	}
	
	public void ordenaFecha() {
		lista.sort(new FechaComparator());
	}
	
	public void ordenaPaginas() {
		lista.sort(new paginasComparator());;
	}
}

