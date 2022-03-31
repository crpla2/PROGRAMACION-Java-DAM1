package p152_ejercicio_1;

import java.util.Comparator;

public class EdadComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Alumno a1=(Alumno)o1;
		Alumno a2=(Alumno)o2;
		return a1.getEdad()-a2.getEdad();
	}

}
