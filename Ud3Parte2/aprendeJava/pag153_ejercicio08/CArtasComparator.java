package pag153_ejercicio08;

import java.util.Comparator;

public class CArtasComparator implements Comparator<Carta>{

	@Override
	public int compare(Carta o1, Carta o2) {
		if (o1.getPalo().equals(o2.getPalo())) 
			return o1.getValor()-(o2.getValor());
		else
			return o1.compareTo(o2);
		
		
			
		
	}

}
