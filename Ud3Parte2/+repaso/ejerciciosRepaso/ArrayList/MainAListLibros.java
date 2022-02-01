package ArrayList;

public class MainAListLibros {

	public static void main(String[] args) {
		
		ArrayListLibros al= new ArrayListLibros();
		al.insertarOrden(new Libro("dicotomia","Carmen Cocas","12346TT",210));
		al.insertarOrden(new Libro("abecadario","Carmen Cocos","12345TT",200));
		al.insertarOrden(new Libro("cacharraco","Claudia Cocios","12355TT",100));
		al.insertarOrden(new Libro("xilofono","Diego Cacos","12545TT",250));
		
		al.insertarOrden(new Libro("bebervino","Eustaquio Cocos","12385TT",200));
//		System.out.println(al.insertarOrden(new Libro("bebervino","Eustaquio Cocos","12385TT",200)));
		System.out.println(al.recuperar(1));
		System.out.println(al.buscar("bebe"));
//		System.out.println(al.eliminar(2));
		System.out.println(al.existe(new Libro("bebervino","Eustaquio Cocos","12385TT",200)));
		System.out.println((al.insertarOrden(new Libro("macaca","Carmencita Cocosa","1235TT",120))));
		al.ordenaPaginas();
		System.out.println(al);
		
		
		
	}

}
