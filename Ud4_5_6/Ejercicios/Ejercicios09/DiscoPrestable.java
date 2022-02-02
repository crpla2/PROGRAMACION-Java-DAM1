package Ejercicios09;

import Ejercicios07.Disco;
import Ejercicios08.Prestable;

public class DiscoPrestable extends Disco  implements Prestable{
	private boolean prestado;

	public DiscoPrestable(String titulo, String autor, String formato, double duracion, String genero, boolean prestado) {
		super(titulo, autor, formato, duracion, genero);
		prestado=false;
	}

	@Override
	public void prestar() {
		prestado=true;
		
	}

	@Override
	public void devolver() {
		prestado=false;
		
	}

	@Override
	public boolean prestado() {
		
		return prestado;
	}

}
