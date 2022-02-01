package ClasesyObjetos;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private int numPaginas;
	private boolean prestado;
	
	//constructores
	public Libro() {
		prestado=false;
	}
	public Libro(String isbn, String titulo, String autor, int numPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
		prestado=false;
	}
	//getters and setters
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
	//metodos y funciones
	public boolean prestar() {
		if (prestado)
			return false;
		else {
			prestado=true;
			return true;
		}
	}
	public boolean devolver() {
		if (prestado)
			return true;
		else {
			prestado=false;
			return false;
		}
	}
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas
				+ ", prestado=" + prestado + "]";
	}
	

}//Clase Libro
