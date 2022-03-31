package colecciones_III_ejercicio1;

import java.util.Comparator;

public class PaginasComparator implements Comparator<Object> {
	public int compare(Object o1, Object o2) {
		Libro l1 = (Libro) o1;
		Libro l2 = (Libro) o2;
		return l1.getPaginas() - l2.getPaginas();
	}

	public boolean equals(Object o) {
		return this == o;
	}

}
