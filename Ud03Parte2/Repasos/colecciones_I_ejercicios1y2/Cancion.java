package colecciones_I_ejercicios1y2;

public class Cancion {
	private String titulo;
	private String autor;
	
	public Cancion(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public Cancion() {
		titulo="";
		autor="";
	}
	
	public String dameTitulo() {
		return titulo;
	}
	
	public String dameAutor() {
		return autor;
	}
	
	public void ponTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public void ponAutor(String autor) {
		this.autor=autor;
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + ", Autor: " + autor;
	}
	
}
