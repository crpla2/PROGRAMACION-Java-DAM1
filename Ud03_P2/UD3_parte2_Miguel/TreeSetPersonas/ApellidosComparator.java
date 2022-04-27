package TreeSetPersonas;

import java.util.Comparator;

public class ApellidosComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		if(o1.dameApellidos().compareToIgnoreCase(o2.dameApellidos())<=0)
			return-1;
		return 1;
		//return o1.dameApellidos().compareToIgnoreCase(o2.dameApellidos());
	}

}
