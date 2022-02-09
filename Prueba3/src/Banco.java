

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


public class Banco {
	private HashSet<Cuenta> listaCuentas;

	public Banco() {
		listaCuentas = new HashSet<Cuenta>();
	}

	public void crearCuenta(Cuenta c) {
		listaCuentas.add(c);
	}

	public void mostrarCuentas() {
		for(Cuenta c:listaCuentas)
			System.out.println(c);
		
	}

	public boolean annadirCuenta(Cuenta c) {
		
		for(Cuenta d:listaCuentas)
			if (d.getNumero()==c.getNumero())
				return false;
		return listaCuentas.add(c);
	}
	
	public boolean borrarCuenta(Cuenta c) {
		if(listaCuentas.contains(c))
			
			return listaCuentas.remove(c);
		return false;
	}
	
	public boolean egreso(long l,double d) {
		for(Cuenta s:listaCuentas)
			if(s.getNumero()==l)
				if(s.getSaldo()<d) {
					return false;
					}else {
				 s.setSaldo(s.getSaldo()-d);
				 return true;}
		return false;
				
	}
	
	public void ordenarPorNumero() {
		ArrayList<Cuenta>lista=new ArrayList<Cuenta>();
		for(Cuenta c:listaCuentas)
			lista.add(c);
		Collections.sort(lista);
		for(Cuenta d:lista)
			System.out.println(d);
	}
	
	

}// de Banco
