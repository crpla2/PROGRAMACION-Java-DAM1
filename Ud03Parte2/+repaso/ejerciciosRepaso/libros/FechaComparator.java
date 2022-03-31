package libros;

import java.util.Comparator;

public class FechaComparator implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		
		return (o1.getFechaPubli()).compareTo(o2.getFechaPubli());
		
	}
	

}
