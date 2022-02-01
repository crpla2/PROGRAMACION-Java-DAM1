package ejercicio1y2;

public class MainCancion {

	public static void main(String[] args) {
		Cancion c1= new Cancion();
		c1.ponTitulo("Titulo1");
		c1.ponAutor("Autor1");
		System.out.println(c1);
		Cancion c2= new Cancion("Titulo2","Autor1");
		Cancion c3= new Cancion("Titulo3","Autor1");
		Cancion c4= new Cancion("Titulo2","Autor2");
		System.out.println(c4.dameTitulo());
		System.out.println(c2.dameAutor());
	}
}
