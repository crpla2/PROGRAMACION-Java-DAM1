package colecciones_I;

public class Cancion {

	private String titulo;
	private String autor;
	
	public Cancion(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public Cancion() {
		titulo = "";
		autor = "";
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

	@Override
	public String toString() {
		return "Cancion  "+ titulo + ", autor  "+ autor ;
	}
	
	
	
}
