/*
 * Alberto Carrera Martín
 * 29 febrero 2020
 */
package paquete1_mejorado;

public class Libro {
	private int idLibro;
	private String titulo;
	private int precio;
	
	public Libro(int idLibro, String titulo, int precio) {
		super();
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.precio = precio;
	}

	public Libro() {
		
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titulo=" + titulo + ", precio=" + precio + "]";
	}
	

}
