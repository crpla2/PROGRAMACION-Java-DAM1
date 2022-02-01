package colecciones_II_ejercicios3y4;

import java.util.ArrayList;

public class ArrayListProducto {
	ArrayList<Producto> lista;

	public ArrayListProducto() {
		lista = new ArrayList<Producto>();
	}

	public int tamanyoLista() {
		return lista.size();
	}

	public String imprimirLista() {
		String cadena = "";
		for (Producto p : lista)
			cadena = cadena + p + "\n******************\n";
		return cadena;
	}

	public boolean agregarProducto(Producto producto) {
		int contador = 0;
		for (Producto p : lista) {
			if (p.getCodigo() == producto.getCodigo())
				contador++;
		}
		if (contador > 0) {
			return false;
		}
		return lista.add(producto);
	}

	public Producto buscarRecuperarPorPosicion(int posicion) {

		if (lista.size() < posicion || posicion < 1)
			return null;
		return lista.get(posicion - 1);
	}

	public Producto buscarRecuperarPorCodigo(int codigo) {
		for (Producto p : lista) {
			if (p.getCodigo() == codigo)
				return p;
		}
		return null;
	}

//	public boolean eliminarProductoPorCodigo(int codigo) {
//			Producto eliminar= buscarRecuperarPorCodigo(codigo);
//			return lista.remove(eliminar);				
//	}
	public Producto eliminarProductoPorCodigo(int codigo) {
		for (Producto p : lista) {
			if (p.getCodigo() == codigo) {
				lista.remove(p);
				return p;
			}
		}
		return null;
	}

	public Producto cambiarPrecio(int codigo, double precio) {
		for (Producto p : lista) {
			if (p.getCodigo() == codigo) {
				p.setPrecio(precio);
				return p;
			}
		}
		return null;
	}

}