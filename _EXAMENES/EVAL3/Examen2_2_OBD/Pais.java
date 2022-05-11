package Examen2_2_OBD;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pais implements Serializable {
	@Id
	private int id;
	private String nombrePais;
	@OneToMany(mappedBy = "pais")
	private Set<Jugador> jugadores = new HashSet<Jugador>();

	//
	public Pais() {

	}

	public Pais(int id, String nombrePais) {

		this.id = id;
		this.nombrePais = nombrePais;
	}

	public Pais(int id, String nombrePais, Set<Jugador> jugadores) {
		this.id = id;
		this.nombrePais = nombrePais;
		this.jugadores = jugadores;
	}

//

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrepais) {
		this.nombrePais = nombrepais;
	}

	public Set<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(Set<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

//
	@Override
	public String toString() {
		return "Pais [id=" + id + ", nombrePais=" + nombrePais + ", jugadores=" + jugadores + "]";
	}

}
