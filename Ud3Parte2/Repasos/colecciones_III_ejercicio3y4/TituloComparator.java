package colecciones_III_ejercicio3y4;

import java.util.Comparator;

public class TituloComparator implements Comparator<Libro>{
	@Override
	public int compare(Libro l1, Libro l2) {
		if (l1.getIsbn().compareTo(l2.getIsbn())==0)
			return 0;
		if( (l1.getTitulo().compareToIgnoreCase(l2.getTitulo()))<=0)
			return-1;
		return 1;
	}
	

}
