package colecciones_II_ejercicios3y4;

import java.util.LinkedList;

public class LinkedListProducto {
	LinkedList<Producto> lista;

	public LinkedListProducto() {
		lista = new LinkedList<Producto>();
	}

	public int tamanyoLista() {
		return lista.size();
	}

	public String imprimirLista() {
		String cadena = "";
		for (Producto p : lista)
			cadena = cadena + p + "\n**************\n";
		return cadena;
	}

	public boolean agregarProducto(Producto producto) {
		int contador = 0;
		for (Producto p : lista)
			if (p.getCodigo() == producto.getCodigo())
				contador++;
		if (contador > 0)
			return false;
		return lista.add(producto);
	}

	public Producto buscarRecuperarPorPosicion(int posicion) {
		if (posicion < 1 || posicion > lista.size())
			return null;
		return lista.get(posicion - 1);
	}

	public Producto buscarRecuperarPorCodigo(int codigo) {
		for (Producto p : lista)
			if (p.getCodigo() == codigo) {
				return p;
			}
		return null;
	}

	public boolean eliminarPorCodigo(int codigo) {
		Producto eliminar = buscarRecuperarPorCodigo(codigo);
		return lista.remove(eliminar);
	}

	public boolean cambiarPrecio(int codigo, double precio) {
		Producto cambiar = buscarRecuperarPorCodigo(codigo);
		if (cambiar == null)
			return false;

		cambiar.setPrecio(precio);
		return true;

	}
}
