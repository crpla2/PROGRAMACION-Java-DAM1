package Demo;

import java.sql.Date;

public class Empleado {
	int numero;
	String nombre;
	String puesto;
	int jefe;
	Date antiguedad;
	double salario;
	double comision;
	int departamento;
	
	public Empleado() {
		
	}
	public Empleado(int numero, String nombre, String puesto, int jefe, Date antiguedad, double salario,
			double comision, int departamento) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.puesto = puesto;
		this.jefe = jefe;
		this.antiguedad = antiguedad;
		this.salario = salario;
		this.comision = comision;
		this.departamento = departamento;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public int getJefe() {
		return jefe;
	}
	public void setJefe(int jefe) {
		this.jefe = jefe;
	}
	public Date getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(Date antiguedad) {
		this.antiguedad = antiguedad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}
	public int getDepartamento() {
		return departamento;
	}
	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "\nEmpleado [numero=" + numero + ", nombre=" + nombre + ", puesto=" + puesto + ", jefe=" + jefe
				+ ", antiguedad=" + antiguedad + ", salario=" + salario + ", comision=" + comision + ", departamento="
				+ departamento + "]";
	}
	
	
	

}
