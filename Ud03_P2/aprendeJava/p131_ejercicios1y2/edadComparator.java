package p131_ejercicios1y2;

import java.util.Comparator;

public class edadComparator implements Comparator<Object> {

	public int compare(Object o1, Object o2) {
		Gato g1 = (Gato) o1;
		Gato g2 = (Gato) o2;

		return -(g1.getEdad() - g2.getEdad());
	}
	public boolean equals(Object o) {
		return this==o;
	}
}
