package colecciones_II;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProducto {

	ArrayList<Producto> lista;

	public ArrayListProducto() {
		lista = new ArrayList<Producto>();
	}

	public int tamanyoLista() {
		return lista.size();
	}

	public boolean vacia() {
		return lista.isEmpty();
	}

	public boolean agregar(Producto p) {
		return lista.add(p);
	}

	public Producto recuperarPorPosicion(int posicion) {
		if (posicion < 1 || posicion > lista.size())
			return null;
		return lista.get(posicion - 1);
	}

	public Producto recuperarPorCodigo(int codigo) {
		for (int i = 0; i < lista.size(); i++)
			if (lista.get(i).getCodigo() == codigo)
				return lista.get(i);
		return null;
	}

	public boolean eliminarPorCodigo(int codigo) {
		for (int i = 0; i < lista.size(); i++)
			if (lista.get(i).getCodigo() == codigo) {
				lista.remove(i);
				return true;
			}
		return false;
	}

	public boolean cambiarPrecio(int codigo, double precio) {
		for (int i = 0; i < lista.size(); i++)
			if (lista.get(i).getCodigo() == codigo) {
				lista.get(i).setPrecio(precio);
				return true;
			}
		return false;
	}

	public String imprimirLista() {
		String cadena = "";
		Iterator<Producto> it = lista.iterator();
		while (it.hasNext())
			cadena = cadena + it.next() + "\n";
		return cadena;
	}
}
