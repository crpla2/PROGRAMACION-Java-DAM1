package Colecciones_II_ejercicios3y4;

import java.util.ArrayList;


public class ListaProducto {

	ArrayList<Producto> lista;
	public ListaProducto() {
		lista= new ArrayList<Producto>();
	}
	
	public int tamanyo() {
		return lista.size();
	}
	public void imprimirLista(){
		for (Producto producto : lista) {
			System.out.println(producto);
		}
	}
	public boolean añadirProducto(Producto p) {
		return lista.add(p);
	}
	public Producto recuperarProducto(int pos) {
		if(pos<1||pos>lista.size())
			return null;
		return lista.get(pos-1);
	}
	public Producto busquedaPorCodigo(int cod) {
		for (Producto producto : lista) {
			if(producto.getCodigo()==cod)
				return producto;
		}
		return null;
	}
	public Producto eliminarPorCodigo(int cod) {
		for (Producto producto : lista) {
			if(producto.getCodigo()==cod) {
				lista.remove(producto);
				return producto;
			}		
		}
		return null;
	}
	public boolean cambiarPrecio(int cod,double newprecio) {
		for (Producto producto : lista) {
			if(producto.getCodigo()==cod) {
				producto.setPrecio(newprecio);
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String cad="";
		for (Producto producto : lista) {
			cad+=producto+"\n";
		}
		return cad;
	}
	
}
