package colecciones_III_ejercicio3y4;

import java.util.TreeSet;

public class TreeSetLibros {
	TreeSet<Libro> lista;

	public TreeSetLibros() {
		lista = new TreeSet<Libro>(new TituloComparator());
//		lista = new TreeSet<Libro>(new PaginasComparator());
	}

	public boolean vacio() {
		return lista.isEmpty();
	}

	public int tamanyo() {
		return lista.size();
	}

	public String buscar(String cadena) {
		String encontrados = "";
		for (Libro l : lista)
			if (l.getTitulo().toLowerCase().contains(cadena.toLowerCase()))
				encontrados += l + "\n--------------------\n";
			else
				return null;
		return encontrados;

	}

	public void buscar2(String cadena) {
		int c = 0;
		for (Libro l : lista) {
			if (l.getTitulo().toLowerCase().contains(cadena.toLowerCase())) {
				System.out.println(l);
				c++;
			}
		}
		if (c == 0)
			System.out.println("no se encontró");

	}

	public boolean existe(Libro libro) {
		return lista.contains(libro);
	}

	public boolean insertar(Libro libro) {
		return lista.add(libro);
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
