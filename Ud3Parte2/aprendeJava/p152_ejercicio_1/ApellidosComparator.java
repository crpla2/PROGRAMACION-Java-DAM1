package p152_ejercicio_1;

import java.util.Comparator;

public class ApellidosComparator implements Comparator<Alumno>{

	@Override
	public int compare(Alumno o1, Alumno o2) {
		if(o1.getDni().compareToIgnoreCase(o2.getDni())==0)
			return 0;
		if(o1.getApellidos().compareToIgnoreCase(o2.getApellidos())<0)
			return-1;
		return 1;
	}
	public boolean equals(Object o) {
		return this==o;
	}

}
