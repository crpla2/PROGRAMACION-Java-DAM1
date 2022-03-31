package _03_01colecciones2;

public class MainArrayProducto {

	public static void main(String[] args) {
		
		ArrayProducto list = new ArrayProducto();

		Producto p1=new Producto(1,"Pan","Alimento",1.05,100);
		Producto p2=new Producto(21,"Camisa","Ropa",19.95,45);
		Producto p3=new Producto(14,"Fairy","Limpieza",3.45,75);
		list.agregarProducto(p1);
		list.agregarProducto(p2);
		list.agregarProducto(p3);
		list.agregarProducto(p3);
		list.agregarProducto(new Producto (3,"Agua","Alimento",0.95,157));
		list.agregarProducto(new Producto (58,"Gafas","Otros",149.95,7));
		//System.out.println(list.tamanyo());
		System.out.println(list);
		//System.out.println(list.buscarPorPosicion(3));
		//System.out.println(list.buscarPorCodigo(21));
		/*list.eliminarPorCodigo(1);
		System.out.println(list);*/
		/*list.cambiarPrecioPorCodigo(21, 200);
		System.out.println(list.buscarPorCodigo(21));*/
	}

}
