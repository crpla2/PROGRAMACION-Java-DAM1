package Ejercicio3;

public class MainListaProducto {

	public static void main(String[] args) {
		int posicion=4;
		int codigo=3456;
		double precio=100;
		ListaProducto p= new ListaProducto();
		
		p.agregar(new Producto(1234, "lavatodo", "detergente", 18.50, 100));
		p.agregar(new Producto(2345, "lavanada", "detergente", 15.50, 80));
		p.agregar(new Producto(3456, "pañalin", "pañales", 28.50, 150));
		p.agregar(new Producto(4567, "calocao", "cacao en polvo", 8.50, 100));
		p.agregar(new Producto(5678, "lavacasi", "detergente", 17.50, 130));
			
		
		//System.out.println("El número de productos registrados es: " + p.tamanyo()+"\n");
		//System.out.println(p);
		//System.out.println("El producto buscado en la posicion "+posicion+" es: \n"+p.recuperarPorPosicion(posicion));
		//System.out.println(p.cambiarPrecio(codigo, precio));
		p.eliminarPorCodigo(codigo);
		System.out.println(p);
	}

}
