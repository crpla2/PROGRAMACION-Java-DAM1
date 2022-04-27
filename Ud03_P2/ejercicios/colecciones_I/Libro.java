package colecciones_I;

public class Libro {
	private String titulo;
	private Persona autor;
	private String isbn;
	private int paginas;
	private int edicion;
	private String editorial;
	private String lugar;
	private Fecha fecha;
		
	public Libro() {
		
		titulo = "";
		autor = new Persona();
		isbn = "";
		paginas = 0;
		edicion = 0;
		editorial = "";
		lugar = "";
		fecha = new Fecha();
	}

	public Libro(String titulo, Persona autor, String isbn, int paginas, 
				 int edicion, String editorial, String lugar, Fecha fecha) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.paginas = paginas;
		this.edicion = edicion;
		this.editorial = editorial;
		this.lugar = lugar;
		this.fecha = fecha;
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
	
	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
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
	
	public void Leer() {
		System.out.println("Introduzca el título:");
		titulo = MyInput.readString();
		System.out.println("Introduzca el autor:");
		autor.leer2();
		System.out.println("Introduzca el ISBN:");
		isbn = MyInput.readString();
		System.out.println("Introduzca el número de páginas:");
		paginas = MyInput.readInt();
		System.out.println("Introduzca la edición:");
		edicion = MyInput.readInt();
		System.out.println("Introduzca la editorial:");
		editorial = MyInput.readString();
		System.out.println("Introduzca el lugar:");
		lugar = MyInput.readString();
		System.out.println("Introduzca la fecha:");
		fecha.leer();
	}

	@Override
	public String toString() {
		return  "Titulo: " + titulo + "\n" +
				edicion + "a edición" +"\n" +
				"Autor: " + autor.nombreCompleto() +"\n" +
				"ISBN: " + isbn + "\n" +
				lugar + ", " + fecha.toString() +"\n" +
				paginas + " páginas" ;
				
	}
	
	
	
	
	
	
	

}
