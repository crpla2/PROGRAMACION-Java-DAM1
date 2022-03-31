package ArrayList;

import java.util.Comparator;

public class PaginasComparator implements Comparator<Libro>{

	
	public int compare(Libro o1, Libro o2) {
		
		return o1.damePaginas()-o2.damePaginas();
	}}
