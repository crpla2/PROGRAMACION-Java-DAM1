package Repaso_4_5_6;

import java.util.ArrayList;

public class lista {
	private ArrayList<B>lista;

	public lista() {
		lista= new ArrayList<B>();
	}
	
	public boolean  Insertar(B b) {
		return lista.add(b);
		
	}
	
	public void recorrer() {
		for(B b:lista)
			System.out.println(b);
	}
	
	public int cuentaZ() {
		int cuenta=0;
		for(B b:lista)
			if(b instanceof Z)
				cuenta++;
		return cuenta;
				
	}
	

}
