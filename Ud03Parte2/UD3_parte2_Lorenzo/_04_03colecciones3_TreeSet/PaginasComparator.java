package _04_03colecciones3_TreeSet;

import java.util.Comparator;

class PaginasComparator implements Comparator<Object> {

	public int compare(Object o1, Object o2) {
		Libro l1 = (Libro) o1;
		Libro l2 = (Libro) o2;
		return l1.damePaginas() - l2.damePaginas();
	}
	
	 public boolean equals(Object o) {
		 return this == o;
	}
	
}
