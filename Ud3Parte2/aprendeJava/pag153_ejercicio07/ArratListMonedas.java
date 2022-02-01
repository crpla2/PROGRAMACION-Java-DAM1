package pag153_ejercicio07;

import java.util.ArrayList;

public class ArratListMonedas {
	ArrayList<Moneda> lista;

	public ArratListMonedas() {
		lista = new ArrayList<Moneda>();
	}

	public boolean insertarPorPosicion(int posicion, Moneda moneda) {
		if (posicion < 1 || posicion > lista.size())
			return false;
		else
			lista.add(posicion, moneda);

		return true;
	}

	public boolean insertar(Moneda moneda) {
		
		return lista.add(moneda);
	}

	public Moneda buscarPorPosicion(int posicion) {
		if (posicion < 1 || posicion > lista.size())
			return null;
		return lista.get(posicion - 1);

	}

	public int tamanyo() {
		return lista.size();
	}

	@Override
	public String toString() {
		String cadena = "";
		for (Moneda m : lista)
			cadena += m + "\n";
		return cadena;
	}

}
