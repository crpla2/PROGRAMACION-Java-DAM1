package _03_01colecciones2;

import java.util.ArrayList;

public class ArrayProducto {

	ArrayList<Producto> lista;
	
	public ArrayProducto() {
		lista=new ArrayList<Producto>();
	}
	
	public int tamanyo() {
		return lista.size();
	}

	public boolean agregarProducto(Producto nuevo) {
		return lista.add(nuevo);
	}
	
	public Producto buscarPorPosicion(int posicion) {
		if(posicion<1||posicion>lista.size())
			return null;
		return lista.get(posicion-1);
	}
	
	public Producto buscarPorCodigo(int codigo) {
		for(int i=0; i<lista.size();i++) {
			if(lista.get(i).getCodigo()==codigo) {
				return lista.get(i);
			}
		}
		return null;
	}
	
	public Producto eliminarPorCodigo(int codigo) {
		
	/*	Con este método le tengo que devolver booleano, ya que le paso un objeto:
	 	Producto eliminar=buscarPorCodigo(codigo);
		if (eliminar==null) {
			return false;
		}
		return lista.remove(eliminar);
	*/
		
		for(int i=0; i<lista.size();i++) {
			if(lista.get(i).getCodigo()==codigo) {
				return lista.remove(i);
			}
		}
		return null;
	}
	
	public Boolean cambiarPrecioPorCodigo (int codigo, double precio) {
		Producto cambiar = buscarPorCodigo(codigo);
		if (cambiar == null) {
			return false;
		}
		cambiar.setPrecio(precio);
		return true;
	}
	
	public String toString() {
		String cadena="";
		for(int i=0;i<lista.size();i++) {
			cadena = cadena + lista.get(i)+"\n===========================================================================\n";
		}
		return cadena;
	}
	
	
}
