package Objetos2;

import java.util.ArrayList;
import java.util.Collections;

public class Banco$ {
	private ArrayList<Cuenta> lista;

	public Banco$() {
		lista = new ArrayList<Cuenta>();
	}

	public int tamanyo() {
		return lista.size();
	}

	public double saldoMedio() {
		double saldoTotal = 0, saldoMedio = 0;
		for (Cuenta c : lista)
			saldoTotal += c.getSaldo();
		

		if (lista.size() > 0)
			saldoMedio = saldoTotal / lista.size();
		return saldoMedio;
	}

	public boolean crearCuenta(Cuenta c) {
		if (lista.contains(c))
			return false;
		return lista.add(c);
	}

	public void mostrarCuentas() {
		for (Cuenta c : lista)
			System.out.println(c);
	}

	public boolean buscarCuentaPorNumero(int n) {
		for (Cuenta c : lista)
			if (c.getNumero() == n)
				return true;
		return false;
	}

	public boolean annadirCuenta(Cuenta c) {
		for (Cuenta cu : lista)
			if (cu.getNumero() == c.getNumero())
				return false;
		return lista.add(c);
	}

	public boolean existeCuenta(Cuenta c) {
		if (lista.contains(c))
			return true;
		else
			return false;
	}

	public boolean borrarCuenta(Cuenta c) {
		if (existeCuenta(c))
			return lista.remove(c);
		else
			return false;
	}

	public String buscarPorNombre(String s) {
		String cadena = "";
		for (Cuenta c : lista)
			if (c.getNombre().toLowerCase().contains(s.toLowerCase()))
				cadena = cadena + c + "\n";
		return cadena;
	}

	public boolean ingreso(long numero, double dinero) {
		for(Cuenta c:lista)
			if(c.getNumero()==numero) {
				c.setSaldo(c.getSaldo()+dinero);
				return true;
			}
		return false;
	}
	
	public void ordenarPorNombre() {
		Collections.sort(lista);
	}
}
