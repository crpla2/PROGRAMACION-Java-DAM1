package ejercicio3y4;

public class MainBiblioteca {

	public static void main(String[] args) {
		Libro li1 = new Libro("titulo1", new Persona(111, 33, "Alberto", "Carrera"),
				"isbnxxx", 222,1, "Planeta", "Huesca", new Fecha());
		
		Biblioteca l1=new Biblioteca();
		Libro libro1 = new Libro(), libro2 = new Libro(), libro3 = new Libro(), libro4 = new Libro(), libro5 = new Libro(), libro6= new Libro(), libro7=new Libro();
		libro1.ponAutor(new Persona("Francois","Chollet"));libro1.ponTitulo("Deep Learning con Python");libro1.ponIsbn("978-84-415-4225-9");libro1.ponPaginas(384);
		libro2.ponAutor(new Persona ("Oscar","Carranza Zavala" ));libro2.ponTitulo("AutoCad 2019");libro2.ponIsbn("978-84-267-2709-1");libro2.ponPaginas(500);
		libro3.ponAutor(new Persona("Luke","Welling"));libro3.ponTitulo("Desarrollo Web con PHP y MySQL");libro3.ponIsbn("978-84-415-3691-3");libro3.ponPaginas(656);
		libro4.ponAutor(new Persona("Rogers","Cadenhead"));libro4.ponTitulo("Java 8");libro4.ponIsbn("978-84-415-3631-9");libro4.ponPaginas(416);
		libro5.ponAutor(new Persona("Jesse","Liberty"));libro5.ponTitulo("C++");libro5.ponIsbn("978-84-415-2979-3");libro5.ponPaginas(464);
		libro6.ponAutor(new Persona("Eugenia","Bahit"));libro6.ponTitulo("Programador PHP");libro6.ponIsbn("1-204251-530227");libro6.ponPaginas(376);
		libro7.ponAutor(new Persona("F.Javier","Moldes"));libro7.ponTitulo("Java 9");libro7.ponIsbn("978-84-415-3940-2");libro7.ponPaginas(448);
		l1.insertarOrden(libro1);l1.insertarOrden(libro2);l1.insertarOrden(libro3);l1.insertarOrden(libro4);
		l1.insertarOrden(libro5);l1.insertarOrden(libro6);l1.insertarOrden(libro7);
		//System.out.println("Número de libros: " + l1.tamanyo());
		//System.out.println(l1.toString());
	    
	
	  //l1.Eliminar(2);
	//    System.out.println("Número de libros: " + l1.tamanyo());
	//	System.out.println(l1.toString());
	//System.out.println(l1.getLibro(l1.buscar("c++"))); //---> error por los datos incompletos del autor
	System.out.println(l1.getLibro(l1.buscar("c++")).toString2()); 
//	System.out.println(l1.buscarTodos("php"));
		
	    
	}
}
