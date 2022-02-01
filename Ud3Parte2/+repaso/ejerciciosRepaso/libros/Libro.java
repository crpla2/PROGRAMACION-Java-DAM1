package libros;

import java.util.Date;
import java.util.Objects;

public class Libro implements Comparable<Libro> {
	private String titulo;
	private String autor;
	private int paginas;
	private Date fechaPubli;
	private String isbn;

	public Libro() {
		titulo = "";
		autor = "";
		paginas = 0;
		fechaPubli = new Date("1900/01/01");
		isbn = "";
	}

	public Libro(String titulo, String autor, int paginas, Date fechaPubli,String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.fechaPubli = fechaPubli;
		this.isbn=isbn;
	}

	public String getTitulo() {return titulo;}

	public void setTitulo(String titulo) {this.titulo = titulo;}

	public String getAutor() {return autor;}

	public void setAutor(String autor) {this.autor = autor;}

	public int getPaginas() {return paginas;}

	public void setPaginas(int paginas) {this.paginas = paginas;}

	public Date getFechaPubli() {return fechaPubli;	}

	public void setFechaPubli(Date fechaPubli) {this.fechaPubli = fechaPubli;}
	
	@Override
	public int hashCode() {
		return Objects.hash(autor, fechaPubli, isbn, paginas, titulo);
	}

	@Override
	public String toString() {
		return "Libro: " + titulo + ", -" + isbn + "-\nEscrito por " + autor + ", " + paginas + " páginas"
				+ ", publicado el " + fechaPubli.getDate()+"/"+(fechaPubli.getMonth()+1)+"/"+((fechaPubli.getYear())+1900);
	}

	public boolean equals(Libro l) {
		return Objects.equals(this.isbn, l.isbn);
	}

	@Override
	public int compareTo(Libro l) {
		return (this.titulo.compareTo(l.getTitulo()));
	}

}
