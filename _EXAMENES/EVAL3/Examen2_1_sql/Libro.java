package Examen2_1_sql;

public class Libro {

	private String autor;
	private String titulo;
	private String editorial;
	private int anno_publica;
	private int paginas;
	private double precio_euros;
	private char prestado;
	private String materia;
	private String isbn;
	private String resumen;
	private int registro;
	private String notas;
	//
	public Libro() {
		
	}
	//
	
	//
	
	public Libro(String autor, String titulo, String editorial, int anno_publica, int paginas, double precio_euros,
			char prestado, String materia, String isbn, String resumen, int registro, String notas) {
		this.autor = autor;
		this.titulo = titulo;
		this.editorial = editorial;
		this.anno_publica = anno_publica;
		this.paginas = paginas;
		this.precio_euros = precio_euros;
		this.prestado = prestado;
		this.materia = materia;
		this.isbn = isbn;
		this.resumen = resumen;
		this.registro = registro;
		this.notas = notas;
	}
	public Libro(int registro, String titulo, String editorial) {
		this.registro = registro;
		this.titulo = titulo;
		this.editorial = editorial;
		
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getAnno_publica() {
		return anno_publica;
	}
	public void setAnno_publica(int anno_publica) {
		this.anno_publica = anno_publica;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public double getPrecio_euros() {
		return precio_euros;
	}
	public void setPrecio_euros(double precio_euros) {
		this.precio_euros = precio_euros;
	}
	public char getPrestado() {
		return prestado;
	}
	public void setPrestado(char prestado) {
		this.prestado = prestado;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getResumen() {
		return resumen;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public String getNotas() {
		return notas;
	}
	public void setNotas(String notas) {
		this.notas = notas;
	}
	@Override
	public String toString() {
		return "Libro [Registro del libro (clave)=" + registro + ", titulo=" + titulo + ", editorial=" + editorial + "]";
	}
	
	
}
