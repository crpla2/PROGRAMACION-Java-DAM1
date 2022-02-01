package Colecciones_III_ej3y4;

import java.util.Comparator;

public class LibroComparator implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		if(o1.getISBN().compareTo(o2.getISBN())<0)
			return-1;
		else if(o1.getISBN().compareTo(o2.getISBN())==0) {return 0;}
		else {return 1;}
	}

}
