package Colecciones_II_ejercicios3y4;

public class MainListaProducto {

	public static void main(String[] args) {
		ListaProducto x=new ListaProducto();
		Producto p1=new Producto(1,"Ajedrez","Juego de Mesa",25.42,1000);
		Producto p2=new Producto(2,"Lego","Figuras",7.56,11000);
		Producto p3=new Producto(3,"Parchis","Juego de Mesa",4.50,5000);
		Producto p4=new Producto(4,"Pelota","Deportes",10.99,10000);
		x.añadirProducto(p1);
		x.añadirProducto(p2);
		x.añadirProducto(p3);
		x.añadirProducto(p4);
		
		//System.out.println(x.tamanyo());
		//x.imprimirLista();
		//System.out.println(x.recuperarProducto(3));
		System.out.println(x.eliminarPorCodigo(1));
		//x.cambiarPrecio(3, 2000.20);
		//x.imprimirLista();
		System.out.println(x);

	}

}
