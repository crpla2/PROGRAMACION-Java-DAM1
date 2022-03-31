package discos;

import java.util.Scanner;

public class Cancion implements Comparable<Cancion> {
	private String titulo;
	private String autor;
	
	public Cancion (String titulo,String autor) {
		this.titulo=titulo;
		this.autor=autor;
	}
	
	public Cancion () {
		titulo="";
		autor="";
	}

	public String dameTitulo() {
		return titulo;
	}

	public void ponTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String dameAutor() {
		return autor;
	}

	public void ponAutor(String autor) {
		this.autor = autor;
	}
	
	public void leer() {
		Scanner s= new Scanner(System.in);
		System.out.println("Introduzca el titulo de la canción: ");
		ponTitulo(s.nextLine());
		System.out.println("Introduzca el autor de la canción: ");
		ponAutor(s.nextLine());
	}

	@Override
	public String toString() {
		return "Cancion: " + titulo + ", autor: " + autor ;
	}


	public int compareTo(Cancion o) {
		return (this.titulo).compareTo(o.dameTitulo());
	
	}

	public boolean equals(Cancion o) {
		
		return (this.titulo).equals(o.titulo);

	}
	
	
	

}
