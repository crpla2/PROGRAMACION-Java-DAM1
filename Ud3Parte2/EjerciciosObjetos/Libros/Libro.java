package Libros;

public class Libro {

	private String isbn;
	private String titulo;
	private String autor;
	private int numPaginas;
	private boolean prestado;
	
	public Libro() {
		prestado=false;
	}

	public Libro(String isbn, String título, String autor, int numPaginas) {
		this.isbn = isbn;
		this.titulo = título;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public boolean isPrestado() {
		return prestado;
	}
	
	public boolean prestar() {
		if (prestado)
			return false;
		else {
			prestado=true;
			return true;
		}
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas
				+ ", prestado=" + prestado + "]";
	}

}// de la clase Libro
