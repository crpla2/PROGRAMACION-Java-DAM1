package Examen2_2_OBD;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Jugador implements Serializable{
@Id
private String nombre;
private String deporte;
private String ciudad;
private int edad;
@ManyToOne
private Pais pais;


public Jugador(){};
public Jugador(String nombre, String deporte, String ciudad, int edad, Pais pais) {

		this.nombre = nombre;
		this.deporte = deporte;
		this.ciudad = ciudad;
		this.edad = edad;
		this.pais= pais;
	}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDeporte() {
	return deporte;
}
public void setDeporte(String deporte) {
	this.deporte = deporte;
}
public String getCiudad() {
	return ciudad;
}
public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public Pais getPais() {
	return pais;
}
public void setPais(Pais pais) {
	this.pais = pais;
}
@Override
public String toString() {
	return "Jugador [nombre=" + nombre + ", deporte=" + deporte + ", ciudad=" + ciudad + ", edad=" + edad + ", pais="
			+ pais + "]";
}


}


