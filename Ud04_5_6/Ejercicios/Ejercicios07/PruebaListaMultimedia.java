package Ejercicios07;

public class PruebaListaMultimedia {

	public static void main(String[] args) {
		 ListaMultimedia lista= new ListaMultimedia();
		 
		 lista.agrega(new Disco("El fin de la primera parte", "Los Piratas", "mp3", 120, "rock"));
		 lista.agrega(new Disco("Nevermind", "Nirvana", "mp3", 90, "rock"));
		 lista.agrega(new Disco("La leyenda del tiempo", "Camarón de la Isla", "mp3", 87, "flamenco"));
		 lista.agrega(new Pelicula("El odio", "Mathieu Kassovitz", "mpeg", 98, "Vicent Cassel", null));
		 lista.agrega(new Pelicula("Torrente", "Santiago Segura", "mpeg", 99, "Santiago Segura", null));
		 lista.agrega(new Pelicula("Tesis", "Alejandro Amenabar", "mpeg", 100, "Eduardo Noriega","Ana Torrent"));
		 
		 lista.imprimeLista();
		 System.out.println(lista.duracionTotal()+" minutos"); //total de minutos de la lista
		 System.out.println(lista.genero("rock")); //Numero  de discos de rock
		 System.out.println(lista.actrizActor("yo")); //Hay que introducir actor o actriz para que la busqueda sea valida
		 System.out.println(lista.actrizNull()); //Numero de peliculas que tienen actriz ppal NULL
	}

}
