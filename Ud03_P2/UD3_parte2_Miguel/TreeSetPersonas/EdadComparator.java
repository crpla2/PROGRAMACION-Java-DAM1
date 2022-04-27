package TreeSetPersonas;

import java.util.Comparator;

public class EdadComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona arg0, Persona arg1) {
		if(arg0.dameEdad()>=arg1.dameEdad()) 
			return 1;
		return -1;
	}
	
}
