package p131_ejercicios1y2;

import java.util.Comparator;

public class NombreComparator implements Comparator<Gato> {

	@Override
	public int compare(Gato o1, Gato o2) {
		if((o1.getNombre().compareToIgnoreCase(o2.getNombre()))==0)
		return 0;
		if((o1.getNombre().compareToIgnoreCase(o2.getNombre()))<0)
			return -1;
		else 
			return 1;
		
	}

}
