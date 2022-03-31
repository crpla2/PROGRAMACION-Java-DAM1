package colecciones_III_ejercicio1;

import java.util.Objects;

public class Libro {

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(isbn, other.isbn);
	}

	private String titulo;
	private Persona autor;
	private String isbn;
	private int paginas;
	private int edicion;
	private String lugar;
	private Fecha fecha;

	public Libro(String titulo, Persona autor, String isbn, int paginas, int edicion, String lugar, Fecha fecha) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.paginas = paginas;
		this.edicion = edicion;
		this.lugar = lugar;
		this.fecha = fecha;
	}

	public Libro() {
		super();
		this.titulo = "";
		this.autor = new Persona();
		this.isbn = "";
		this.paginas = 0;
		this.edicion = 0;
		this.lugar = "";
		this.fecha = new Fecha();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Persona getAutor() {
		return autor;
	}

	public void setAutor(Persona autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public void leer() {
		System.out.println("Introduzca el título del libro:");
		titulo = MyInput.readString();
		System.out.println("Introduzca el Autor del libro:");
		autor.leerCorto();
		System.out.println("Introduzca el ISBN del libro:");
		isbn = MyInput.readString();
		System.out.println("Introduzca el número de páginas del libro:");
		paginas = MyInput.readInt();
		System.out.println("Introduzca el número de edición del libro:");
		edicion = MyInput.readInt();
		System.out.println("Introduzca La ciudad y el pais donde se editó el libro:");
		lugar = MyInput.readString();
		System.out.println("Introduzca la fecha en que se editó el libro:");
		fecha.leer();
	}

	@Override
	public String toString() {
		return titulo+", "+autor.nombreCompleto()+", "+paginas+" páginas, ISBN: "+isbn;
	}
	
}