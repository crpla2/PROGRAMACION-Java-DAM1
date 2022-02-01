package Ejercicios07;

public class Pelicula extends Multimedia {

	private String actorPrincipal;
	private String actrizPrincipal;

	public Pelicula(String titulo, String autor, String formato, double duracion, String actorPrincipal,
			String actrizPrincipal) {
		super(titulo, autor, formato, duracion);

		this.actorPrincipal = actorPrincipal;
		this.actrizPrincipal = actrizPrincipal;

		if ((actorPrincipal == null) && (actrizPrincipal == null))
			throw new IllegalArgumentException("Los argumentos no son válidos");
	}
	
	
	public String getActorPrincipal() {
		return actorPrincipal;
	}


	public void setActorPrincipal(String actorPrincipal) {
		this.actorPrincipal = actorPrincipal;
	}


	public String getActrizPrincipal() {
		return actrizPrincipal;
	}


	public void setActrizPrincipal(String actrizPrincipal) {
		this.actrizPrincipal = actrizPrincipal;
	}


	@Override
	public String toString() {
		return super.toString() +"\nActor principal:"+ actorPrincipal + ", actriz pricipal:  " + actrizPrincipal;
		
	}

}
