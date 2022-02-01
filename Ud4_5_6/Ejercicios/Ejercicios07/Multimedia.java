package Ejercicios07;

public class Multimedia {
	private String titulo;
	private String autor;
	private String formato;
	private double duracion;
	
	public Multimedia (String titulo, String autor, String formato, double duracion) {
		this.titulo=titulo;
		this.autor=autor;
		this.formato=formato;
		this.duracion=duracion;
	}
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
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
	
	public String toString() {
		return titulo+", autor: "+autor+", formato: "+formato+", "+duracion+" minutos";
	}
	
	public boolean equals(Multimedia m) {
		return ((this.titulo.equalsIgnoreCase(m.getTitulo()))
				&&(this.autor.equalsIgnoreCase(m.getAutor())));				
	}
}
