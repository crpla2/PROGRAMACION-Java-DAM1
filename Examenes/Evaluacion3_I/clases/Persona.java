package clases;

import java.io.Serializable;

public class Persona implements Serializable, Comparable<Persona> {

	private static final long serialVersionUID = 1L;
	//
	private String nombre;
	private String movil;
	private String email;

	//
	public Persona() {
	}

	public Persona(String nombre, String movil, String email) {
		this.nombre = nombre;
		this.movil = movil;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMovil() {
		return movil;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return nombre + "\t" + movil + "\t" + email;
	}

	@Override
	public int compareTo(Persona o) {
		return this.nombre.compareTo(o.getNombre());
	}

	
	

}
