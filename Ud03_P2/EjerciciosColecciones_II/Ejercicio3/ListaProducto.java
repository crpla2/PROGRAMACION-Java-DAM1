package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaProducto {
	
	ArrayList <Producto> lista;
	
	public ListaProducto() {
		lista = new ArrayList <Producto>();
	}

	public int tamanyo() {
		return lista.size();
	}

	public boolean agregar(Producto p) {
		return lista.add(p);
	}
	
	public Producto recuperarPorPosicion(int posicion) {
		if(posicion<1 || posicion>lista.size()) {
			return null;
		}
		else
			return lista.get(posicion -1);
	}

	public Producto recuperarPorCodigo(int codigo) {
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getCodigo()==codigo)
				return lista.get(i);
		}
		return null;
	}
	
	public Producto eliminarPorCodigo(int codigo) {
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getCodigo()==codigo)
				return lista.remove(i);
		}
		return null;
	}
	
	public boolean cambiarPrecio (int codigo, double precio) {
		for(int i=0; i<lista.size();i++) {
			if(lista.get(i).getCodigo()==codigo) {
				lista.get(i).setPrecio(precio);
				return true;	
			}
		}
		return false;
	}
	
	
	
	@Override
	public String toString() {
		String cadena="";
		
		Iterator it= lista.iterator();
		while(it.hasNext()) {
			cadena=cadena+it.next();
		}
		
		return cadena;
	}
	
	
}
