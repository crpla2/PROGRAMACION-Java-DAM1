package ClasesyObjetos;

public class PruebaLibro {

	public static void main(String[] args) {
		Libro l1= new Libro();
		l1.setAutor("Alberto");
		Libro l2= new Libro("1111","Titulo1", "Autor1", 111);
		System.out.println(l2.getTitulo());
		System.out.println(l2);
	}

}
