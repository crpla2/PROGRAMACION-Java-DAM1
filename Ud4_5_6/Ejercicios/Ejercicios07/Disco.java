package Ejercicios07;

public class Disco extends Multimedia{
	private String genero;

	public Disco(String titulo, String autor, String formato, double duracion, String genero) {
		super(titulo, autor, formato, duracion);
		this.genero=genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return super.toString() + "\nGenero: "+genero ;
	}
	
	

}
