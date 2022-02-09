package ExamenHerencias_Lo;

import java.util.ArrayList;
import java.util.Collections;

public class Banco$$ {
	private ArrayList<Cuenta> lista;

	public Banco$$() {
		lista = new ArrayList<Cuenta>();
	}

	public int tamanyo() {
		return lista.size();
	}

	public boolean crearCuenta(Cuenta c) {
		if (existeCuenta(c))
			return false;
		return lista.add(c);
	}

	public double saldoMedio() {
		double saldototal = 0, saldoMedio = 0;
		if (lista.size() > 0) {
			for (Cuenta c : lista)
				saldototal += c.getSaldo();
			saldoMedio = saldototal / lista.size();
		}
		return saldoMedio;
	}

	public void mostrarCuentas() {
		for (Cuenta c : lista)
			System.out.println(c);
	}

	public boolean buscarCuentaPorNumero(long l) {
		for (Cuenta c : lista)
			if (c.getNumero() == l)
				return true;
		return false;

	}

	public boolean existeCuenta(Cuenta cu) {
		for (Cuenta c : lista)
			if (c.equals(cu))
				return true;
		return false;
	}

	public boolean annadirCuenta(Cuenta cu) {
		if (buscarCuentaPorNumero(cu.getNumero()))
			return false;
		return lista.add(cu);
	}

	public boolean borrarCuenta(Cuenta cu) {
		if (existeCuenta(cu))
			return lista.remove(cu);
		return false;
	}

	public String buscarPorNombre(String s) {
		String cadena = "";
		for (Cuenta c : lista)
			if (c.getNombre().toLowerCase().contains(s))
				cadena += c + "\n";
		return cadena;
	}
	
	public boolean ingreso(long l,double d) {
		for(Cuenta c:lista) 
			if(c.getNumero()==l) {
				c.setSaldo(c.getSaldo()+d);
				return true;}
		return false;
			
				
	}
	
	public void ordenarPorNombre() {
		Collections.sort(lista);;
	}
	

}
