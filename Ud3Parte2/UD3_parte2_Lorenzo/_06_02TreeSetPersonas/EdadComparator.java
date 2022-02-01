package _06_02TreeSetPersonas;

import java.util.Comparator;

public class EdadComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		int resta = (p1.dameEdad() - p2.dameEdad());
		if (resta <= 0)
			return -1;
		else
			return 1;
		// No ponemos:
		// return p1.dameEdad() - p2.dameEdad();
		// Porque nos quita las personas con la misma edad
	}

}
