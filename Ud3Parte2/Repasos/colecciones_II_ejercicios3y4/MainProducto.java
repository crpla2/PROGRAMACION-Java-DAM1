package colecciones_II_ejercicios3y4;

public class MainProducto {

	public static void main(String[] args) {
		
		Producto p1 = new Producto();
		p1.setCodigo(01);
		p1.setNombre("Perlan");
		p1.setPrecio(8.5);
		p1.setStock(100);
		p1.setTipo("detergente");
		Producto p2= new Producto(2,"Mistol", "detergente",9.8, 120 );
		Producto p3= new Producto(3,"Mistolo", "detergente",7, 120 );
		//System.out.println(p2);
		
//		ArrayListProducto l1 = new ArrayListProducto();
		LinkedListProducto l1= new LinkedListProducto();
		l1.agregarProducto(p1);
		l1.agregarProducto(p2);
		l1.agregarProducto(p3);
//		l1.agregarProducto(p1);
		
//		System.out.println(l1.imprimirLista());
		System.out.println(l1.buscarRecuperarPorPosicion(1));
		System.out.println(l1.buscarRecuperarPorCodigo(2));
		
//		System.out.println(l1.eliminarProductoPorCodigo(3));
//		System.out.println(l1.imprimirLista());
		
		System.out.println(l1.cambiarPrecio(3, 1000));
		System.out.println(l1.imprimirLista());
		
		

	}

}
