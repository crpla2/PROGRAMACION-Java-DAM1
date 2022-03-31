package colecciones_II;

public class MainProductoLinked {

	public static void main(String[] args) {
		
		Producto p1 = new Producto(111, "Ariel", 17.50);
		Producto p2 = new Producto(222, "Perlan", 15.89);
		Producto p3 = new Producto(333, "Mistol",7.6);
		Producto p4 = new Producto(444, "Fairi", 5.67);
		Producto p5 = new Producto (555, "Pato verde",5.66);
		
		LinkedListProducto l1 = new LinkedListProducto();	
		l1.agregar(p1);
		l1.agregar(p2);
		l1.agregar(p3);
		l1.agregar(p4);
		l1.agregar(p5);
		
		System.out.println(l1.imprimirLista());
		System.out.println("numero de productos: "+l1.tamanyoLista());
		System.out.println("¿La lista esta vacia? "+l1.vacia());
		System.out.println(l1.recuperarPorCodigo(333));
		System.out.println("¿se ha eliminado?"+ l1.eliminarPorCodigo(333));
		System.out.println(l1.imprimirLista());
		System.out.println("numero de productos: "+l1.tamanyoLista());
		System.out.println("¿se ha cambiado el precio?"+l1.cambiarPrecio(111,19.9));
		System.out.println(l1.imprimirLista());
	
	}

}
