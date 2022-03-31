package libros;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class BibliotecaHash {

		HashSet<Libro> lista;
		
		public BibliotecaHash() {
			lista= new HashSet<Libro>();
		}

		public int tamanyo() {
			return lista.size();
		}

		public boolean vacia() {
			return lista.isEmpty();
		}

		public boolean insertar_(Libro l) {
			return lista.add(l);
		}

		public boolean eliminar(Libro l) {
			return lista.remove(l);
		}

		public boolean existe(Libro l) {
			return lista.contains(l);
		}

		public void buscar(String s) {
			for (Libro l : lista)
				if (l.getTitulo().toLowerCase().contains(s.toLowerCase()))
					System.out.println(l + "\n");
		}

		public void ordenas(String p) {
			String pag = "pag";
			String fec = "fec";
			Libro[] a = lista.toArray(new Libro[lista.size()]);
			if (p.equalsIgnoreCase(pag) || p.equalsIgnoreCase(fec)) {
				if (p.equalsIgnoreCase(pag))
					Arrays.sort(a, new paginasComparator());
				if (p.equalsIgnoreCase(fec))
					Arrays.sort(a, new FechaComparator());}
			else Arrays.sort(a);
			for (Object l : a)
				System.out.println(l+"\n");
		}
		
		
		public void imprimir() {
//			for(Libro l:lista)
//				System.out.println(l);
			
//			
			Iterator<Libro> i = lista.iterator();
			while (i.hasNext())
				System.out.println(i.next() + "\n");

		}

	

		
}
