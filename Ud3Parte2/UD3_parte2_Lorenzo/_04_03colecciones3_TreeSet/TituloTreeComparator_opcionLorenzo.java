package _04_03colecciones3_TreeSet;

import java.util.Comparator;

public class TituloTreeComparator_opcionLorenzo implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {

		if (o1.dameIsbn().compareToIgnoreCase(o2.dameIsbn())==0)
		return 0;
		
		if (o1.dameTitulo().compareToIgnoreCase(o2.dameTitulo())<=0)
			return -1;
		return 1;
	}

}
