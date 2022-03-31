package discos;

public class MainCD {

	public static void main(String[] args) {
		Cancion c1= new Cancion("Cumpleaños feliz","Parchis");
		Cancion c2= new Cancion("Come as you are", "Nirvana");
		Cancion c3= new Cancion("La hormigonera asesina", "Los nikkis");
		Cancion c4= new Cancion("Dookie","GreenDay");
		
		CD cd1= new CD();
		cd1.agrega(c4);
		cd1.agrega(c3);
		cd1.agrega(c2);
		cd1.agrega(c1);
		
//		System.out.println(cd1.numeroCanciones());
//		System.out.println(cd1.imprimeCD());
////		System.out.println(cd1.dameCancion(1).toString());
		cd1.ordenarTitulo();
		System.out.println(cd1.imprimeCD());
		cd1.ordenarAutor();
		System.out.println();
		System.out.println(cd1.imprimeCD());
//		Cancion c5=new Cancion();
//		c5.leer();
//		cd1.grabaCancion(2, c5);
//		cd1.elimina(1);
//		System.out.println("nueva lista de canciones:");
//		System.out.println(cd1.imprimeCD());
		
		
		
		

	}

}
