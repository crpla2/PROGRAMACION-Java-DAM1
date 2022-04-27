package Colecciones_I_ejercicios;

public class Cancion {
	private String titulo;
	private String autor;
	
	//constructores
	public Cancion() {}
	
	public Cancion(String titulo,String autor) {
		this.titulo=titulo;
		this.autor=autor;
	}
	
	//getters and setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "titulo: "+titulo + " autor: " + autor;
	}
	
	
}
