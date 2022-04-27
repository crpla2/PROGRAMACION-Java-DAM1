package Colecciones_III_ej3y4;

import java.util.Objects;

public class Libro implements Comparable<Libro>{

	private String titulo;
	private Persona autor;
	private String ISBN;
	private int npaginas;
	private int edicion;
	private String editorial;
	private String lugar;
	private Fecha fecha;
	
	//CONSTRUCTORES
		public Libro(String titulo, Persona autor, String iSBN, int npaginas, int edicion, String editorial, String lugar,
				Fecha fecha) {
			this.titulo = titulo;
			this.autor = autor;
			ISBN = iSBN;
			this.npaginas = npaginas;
			this.edicion = edicion;
			this.editorial = editorial;
			this.lugar = lugar;
			this.fecha = fecha;
		}
		public Libro() {
			titulo="";
			autor=new Persona();
			ISBN="";
			npaginas=0;
			edicion=0;
			editorial="";
			lugar="";
			fecha=new Fecha();
		}
	
	
	//GETTERS AND SETTERS
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
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getNpaginas() {
		return npaginas;
	}
	public void setNpaginas(int npaginas) {
		this.npaginas = npaginas;
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
	public void leer(){
		System.out.println("Introduce el Titulo:");
		titulo =MyInput.readString();
		System.out.println("Autor: ");
		autor.leer();
		System.out.println("Introduce el ISBN:");
		ISBN=MyInput.readString();
		System.out.println("Introduce número de páginas:");
		npaginas=MyInput.readInt();
		System.out.println("Introduce el número de edición: ");
		edicion=MyInput.readInt();
		System.out.println("Introduce la editorial:");
		editorial=MyInput.readString();
		System.out.println("Introduce el lugar:");
		lugar=MyInput.readString();
		System.out.println("Introduce la fecha: ");
		fecha.leer();
	}
	@Override
	public String toString() {
		return "\n\nTitulo: " + titulo + "\n" + edicion+"a. edición" +"\nAutor: " + autor.dameApellidos() +", "+autor.dameNombre()+ "\nISBN: " + ISBN +"\n"
				 + editorial + ", " + lugar + ", " + fecha.larga() + "\nnpaginas: " + npaginas;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(ISBN, other.ISBN) && Objects.equals(autor, other.autor) && edicion == other.edicion
				&& Objects.equals(editorial, other.editorial) && Objects.equals(fecha, other.fecha)
				&& Objects.equals(lugar, other.lugar) && npaginas == other.npaginas
				&& Objects.equals(titulo, other.titulo);
	}
	@Override
	public int compareTo(Libro o) {
		return ISBN.compareTo(o.ISBN);
	}
}
