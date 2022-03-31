package libros;

import java.util.Comparator;

public class paginasComparator implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		
		return o1.getPaginas()-o2.getPaginas();
	}

}
