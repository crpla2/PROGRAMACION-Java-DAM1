package colecciones_I;

public class MainCD {

	public static void main(String[] args) {

		Cancion c1 = new Cancion("Come as you are", "Nirvana");
		Cancion c2 = new Cancion("Mucha policia poca diversion", "Escorbuto");
		Cancion c3 = new Cancion("Lambada", "anónimo");
		Cancion c4 = new Cancion();
		c4.ponTitulo("Despacito");
		c4.ponAutor("Luis Fonsi");
		System.out.println("El autor de la canción " + c4.dameTitulo() + " es " + c4.dameAutor() + ".");
		System.out.println("********");
		System.out.println("La canción c1 es:\n" + c1);
		System.out.println("********");

		CD cd1 = new CD();
		cd1.agregaCancion(c1);
		cd1.agregaCancion(c2);
		cd1.agregaCancion(c3);
		cd1.agregaCancion(c4);
		System.out.println("Hemos grabado " + cd1.numeroCanciones() + " canciones.");
		System.out.println("********");
		System.out.println("La tercera pista del CD es: \n" + cd1.dameCancion(3));
		System.out.println("********");
		System.out.println(cd1);
		System.out.println("********");
		if (cd1.eliminaCancion(4))
			System.out.println("La canción ha sido eliminada");
		else
			System.out.println("No se ha podido eliminar");
		System.out.println("********");
		System.out.println(cd1);
		System.out.println("********");
		if (cd1.grabaCancion(2, c4))
			System.out.println("La canción ha sido grabada");
		else
			System.out.println("No se ha podido realizar la grabación");
		System.out.println("********");
		System.out.println(cd1);

	}

}
