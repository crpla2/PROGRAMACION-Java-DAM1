package ejercicio1y2;

public class MainCD {

	public static void main(String[] args) {
		Cancion c1= new Cancion();
		c1.ponTitulo("Titulo1");
		c1.ponAutor("Autor1");
		
		Cancion c2= new Cancion("Titulo2","Autor1");
		Cancion c3= new Cancion("Titulo3","Autor1");
		Cancion c4= new Cancion("Titulo4","Autor2");
		//
		
		CD cd1 = new CD();
		
		cd1.agregarCancion(c1);
		cd1.agregarCancion(c2);
		cd1.agregarCancion(c3);
		if (cd1.agregarCancion(c4))
			System.out.println("Se añadió la canción"+c4);
		else
			System.out.println("No se pudo añadir la cancion "+c4);
		
		cd1.agregarCancion(new Cancion("titulo5","Autor2"));
		
		//System.out.println(cd1.numeroCanciones());
		//System.out.println(cd1.dameCancion(2));
		//System.out.println(cd1);
		System.out.println(cd1.eliminaCancion(5));
		System.out.println(cd1);
		
	}

}
