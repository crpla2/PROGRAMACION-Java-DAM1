package Ejercicios08;

public class Biblioteca {
	private String codigo;
	private String titulo;
	private int año;
	
	public Biblioteca() {
		codigo="";
		titulo="";
		año=1900;
	}
	
	public Biblioteca(String codigo, String titulo, int año) {
		
		this.codigo = codigo;
		this.titulo = titulo;
		this.año = año;
	}
	
	@Override
	public String toString() {
		return "Titulo=" + titulo + ", codigo: " + codigo +   ", año: " + año ;
	}

	public String getCodigo() {
		return codigo;
	}

	public int getAño() {
		return año;
	}
	

}
