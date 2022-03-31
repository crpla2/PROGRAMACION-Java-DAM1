package colecciones_III_ejercicio3y4;

import java.util.HashSet;

public class HashSetLibros {

	HashSet<Libro> lista;

	public HashSetLibros() {
		lista = new HashSet<Libro>();
	}

	public boolean vacio() {
		return lista.isEmpty();
	}

	public int tamanyo() {
		return lista.size();
	}

	public boolean existe(Libro libro) {
		return lista.contains(libro);
	}

	public boolean insertar(Libro libro) {
		return lista.add(libro);
	}

	public Libro buscar(String cadena) {
		for (Libro l : lista)
			if (l.getTitulo().toLowerCase().contains(cadena.toLowerCase()))
				return l;
		return null;
	}

	public boolean eliminar(Libro libro) {
		return lista.remove(libro);
	}

	@Override
	public String toString() {
		String cadena = "";
		for (Libro l : lista)
			cadena += l + "\n-------------------\n";
		return cadena;
	}

}
