package Ejercicios08;

public class Libro extends Biblioteca implements Prestable {
	private boolean prestado;

	public Libro() {
		super();
		prestado = false;
	}

	public Libro(String codigo, String titulo, int año, boolean prestado) {
		super(codigo, titulo, año);

		this.prestado = false;
	}

	@Override
	public String toString() {
		return super.toString() + " prestado: " + prestado+"\n";
	}

	@Override
	public void prestar() {
		prestado = true;
	}

	@Override
	public void devolver() {
		prestado = false;
	}

	@Override
	public boolean prestado() {
		return prestado;
	}

}
