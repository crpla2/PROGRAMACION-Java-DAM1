package Colecciones_III_ej1;

import java.util.Comparator;

class TituloComparador implements Comparator<Object> {
	 public int compare(Object o1, Object o2) {
		 Libro l1 = (Libro) o1;
		 Libro l2 = (Libro) o2;
		 return l1.getTitulo().compareTo(l2.getTitulo()) ;
		 }
}
