package Ejercicio01;

import java.util.Date;

public class Caballo {
	
	private String nombre;
	private String raza;
	private double peso;
	private Date fechaNacimiento;
	private double velocidad;
	
	public Caballo () {	
	}
//
	public Caballo(String nombre, String raza, double peso, Date fechaNacimiento, double velocidad) {
	
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.fechaNacimiento = fechaNacimiento;
		this.velocidad = velocidad;
	}
//
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
//
	public void relincha() {
		System.out.println("Hiiiiiiiiiiii");
	}
//
	public Caballo compite(Caballo contrincante) {
		if(this.velocidad>contrincante.velocidad)
			return this;
		else 
			return contrincante; 
	}
//
	@Override
	public String toString() {
		return "Caballo [nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", fechaNacimiento="
				+ fechaNacimiento + ", velocidad=" + velocidad + "]";
	}
	
}
