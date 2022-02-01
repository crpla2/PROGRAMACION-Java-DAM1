package _02colecciones1;

public class MainCD {

	public static void main(String[] args) {
		
		//Creo CD y compruebo el contador.
		CD cd1 =new CD();
		System.out.println(cd1.numeroCanciones());
		System.out.print("\n");
		
		//Creo canciones.
		Cancion c1 = new Cancion();
		c1.ponTitulo("Titulo 1");
		c1.ponAutor("Autor 1");
		Cancion c2 = new Cancion("Titulo 2", "Autor 1");
		Cancion c3 = new Cancion("Titulo 3", "Autor 1");
		Cancion c4 = new Cancion("Titulo 4", "Autor 2");
		
		//Agrego canciones al CD.
		cd1.agregaCancion(c1);
		cd1.agregaCancion(c2);
		cd1.agregaCancion(c3);
		if (cd1.agregaCancion(c4)) {
			System.out.println("Se añadió la canción " + c4);
		}
		else {
			System.out.println("No se pudo añadir la canción " + c4);
		}
		
		cd1.agregaCancion(new Cancion("Titulo 5", "Autor 2"));
		
		System.out.print("\n");
		System.out.println(cd1.numeroCanciones());
		System.out.print("\n");
		
		//Pido una canción.
		int posicion=1;
		if (cd1.dameCancion(posicion)==null) {
			System.out.println("No existe ninguna canción en la posición " + posicion);
		}
		else {
			System.out.println(cd1.dameCancion(posicion));
		}
		
		System.out.print("\n");
		
		//Imprimo la lista.
		System.out.println(cd1);
		System.out.print("\n");
		
		//Sobreescribo una canción.
		posicion=2;
		cd1.grabaCancion(posicion, new Cancion ("Titulo 6", "Autor 3"));
		System.out.println(cd1);
		System.out.print("\n");
		
		//Elimino cancion.
		cd1.eliminaCancion(3);
		System.out.println(cd1);
		
	}
}
