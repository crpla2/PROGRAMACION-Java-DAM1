package colecciones_I;

public class MainBiblioteca {

	public static void main(String[] args) {
		//Creación de libro vacio + insercción de datos por teclado
		//Libro l1 = new Libro();
		//l1.Leer();
		//System.out.println(l1);
		//System.out.println(".............................");

		Libro l2 = new Libro("la historia interminable", new Persona("Michael", "Ende"), "1222222-DF", 300, 3,
				"Alfaguara", "Huesca, España", new Fecha(12, 1, 2121));
		
	
		Libro l3 =new Libro();
		l3.setTitulo("La metamorfosis");
		l3.setAutor(new Persona("Frank","Kafka"));
		l3.setEdicion(3);
		l3.setEditorial("Anaya");
		l3.setIsbn("AA-122345656-NJ");
		l3.setFecha(new Fecha(1,2,2000));
		l3.setLugar("Madrid, España");
		l3.setPaginas(329);
		
		Libro l4 =new Libro();
		l4.setTitulo("La odisea");
		l4.setAutor(new Persona("Heracles","Ovidio"));
		l4.setEdicion(25);
		l4.setEditorial("Anaya");
		l4.setIsbn("AA-1345345656-NJ");
		l4.setFecha(new Fecha(1,4,1895));
		l4.setLugar("Creta, Grecia");
		l4.setPaginas(800);
	
		Libro l6 =new Libro();
		l6.setTitulo("Lalaland");
		l6.setAutor(new Persona("Hurreracles","Ovidio"));
		l6.setEdicion(23);
		l6.setEditorial("Anaya");
		l6.setIsbn("AA-13453335656-NJ");
		l6.setFecha(new Fecha(1,4,1895));
		l6.setLugar("Creta, Grecia");
		l6.setPaginas(800);
		
		Biblioteca b1= new Biblioteca();
		b1.insertarEnOrden(l2);
		b1.insertarEnOrden(l3);
		b1.insertarEnOrden(l4);
		b1.insertarEnOrden(l6);
		
	//	System.out.println(b1.numeroLibros());
	//	System.out.println(b1);
	//	b1.eliminarPosicion(1);
		System.out.println("...............");
		System.out.println(b1.numeroLibros());
		System.out.println(b1);
		System.out.println("...............");
		System.out.println(b1.dameLibroPosicion(2));
		System.out.println("...............");
	//	System.out.println(b1.buscarLibro("la"));
		System.out.println(b1.buscarTodos("la o"));
	}
}
