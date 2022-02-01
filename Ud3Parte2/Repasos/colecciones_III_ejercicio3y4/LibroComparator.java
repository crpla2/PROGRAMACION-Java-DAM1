package colecciones_III_ejercicio3y4;

import java.util.Comparator;

public class LibroComparator implements Comparator<Libro>{
	
	@Override
	public int compare (Libro l1,Libro l2) {
		return (l1.getIsbn().compareToIgnoreCase(l2.getIsbn()));
	}

}
