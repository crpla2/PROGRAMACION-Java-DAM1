package discos;

import java.util.Comparator;

public class autorComparator implements Comparator<Cancion> {

	@Override
	public int compare(Cancion o1, Cancion o2) {
		
		return o1.dameAutor().compareTo(o2.dameAutor());
	}

}
