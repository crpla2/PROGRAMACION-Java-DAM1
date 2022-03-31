package _02colecciones1;

public class MainBiblioteca {

	public static void main(String[] args) {
		
		Persona a1= new Persona();
		a1.ponNombre("Renne");
		a1.ponApellidos("Goscini");
		Persona a2= new Persona();
		a2.ponNombre("Pablo");
		a2.ponApellidos("Tusset");
		Libro l1 = new Libro ("Asterix el Galo", a1, "013031977X", 48, 3, "Alfaguara", "Paris (Francia)", new Fecha(14,10,1983));
		//System.out.println(l1);
		Libro l2 = new Libro ("Sacamura, Corrales y los Muertos Rientes", a2, "0130317Q", 129, 3, "Espasa", "Barcelona (España)", new Fecha(9,11,2001));
		Libro l3 = new Libro ("Lo Mejor que le Puede Pasar a un Croissant", a2, "01309841337A", 250, 6, "Espasa", "Barcelona (España)", new Fecha(1,2,1998));
		Libro l4 = new Libro ("Mac Beth", a1, "013037B", 48, 1, "Alfaguara", "Paris (Francia)", new Fecha(13,9,1993));
		/*Libro l5 = new Libro();
		l5.leer();*/
		//System.out.println("\n"+l5);
		
		Biblioteca listaLibros = new Biblioteca();
		listaLibros.insertarLibro(l1);
		listaLibros.insertarLibro(l2);
		listaLibros.insertarLibro(l3);
		listaLibros.insertarLibro(l4);
		listaLibros.insertarLibro(l4);
		//System.out.println(listaLibros.numeroLibros());
		
		//listaLibros.eliminarLibro(3);
		//System.out.println(listaLibros.numeroLibros());
		
		//System.out.println(listaLibros.obtenerLibro(1));
		
		//System.out.println(listaLibros.obtenerLibro(listaLibros.buscarLibroporTitulo("Corrales")));
		
		
		System.out.println(listaLibros);
	}

}
