package Ejercicio2C;

import java.io.Serializable;

public class Departamento implements Serializable{
	int Numdepartamento;
	String Nombre;
	String Localidad;
	public Departamento(int numdepartamento, String nombre, String localidad) {
		super();
		Numdepartamento = numdepartamento;
		Nombre = nombre;
		Localidad = localidad;
	}
	public int getNumdepartamento() {
		return Numdepartamento;
	}
	public void setNumdepartamento(int numdepartamento) {
		Numdepartamento = numdepartamento;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getLocalidad() {
		return Localidad;
	}
	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}
	@Override
	public String toString() {
		return "Departamento [Numdepartamento=" + Numdepartamento + ", Nombre=" + Nombre + ", Localidad=" + Localidad
				+ "]";
	}
	
	
	
}
