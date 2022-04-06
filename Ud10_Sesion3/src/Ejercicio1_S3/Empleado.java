package Ejercicio1_S3;
import java.sql.Date;

public class Empleado {
	int numero;
	String nombre;
	String puesto;
	int jefe;
	Date antiguedad;//date sql
	double salario;
	double comision;
	int departamento;
	
	public Empleado() {};
	public Empleado(int EMPNO, String ENAME, String JOB, 
			int MRG, Date HIREDATE, double SAL, double COMM, int DEPTNO) {
		super();
		numero = EMPNO;
		nombre = ENAME;
		puesto = JOB;
		jefe = MRG;
		antiguedad = HIREDATE;
		salario = SAL;
		comision = COMM;
		departamento = DEPTNO;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int EMPNO) {
		numero = EMPNO;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String ENAME) {
		nombre = ENAME;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String JOB) {
		puesto = JOB;
	}
	public int getJefe() {
		return jefe;
	}
	public void setJefe(int MRG) {
		jefe = MRG;
	}
	public Date getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(Date HIREDATE) {
		antiguedad = HIREDATE;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalarioL(double SAL) {
		salario = SAL;
	}
	public double getComision() {
		return comision;
	}
	public void setComision(double COMM) {
		comision = COMM;
	}
	public int getDepartamento() {
		return departamento;
	}
	public void setDepartamento(int DEPTNO) {
		departamento = DEPTNO;
	}
	@Override
	public String toString() {
		return "\nEmpleado [numero=" + numero + ", nombre=" + nombre + ", puesto=" + puesto + ", jefe=" + jefe + ", antiguedad="
				+ antiguedad + ", salario=" + salario + ", comisión=" + comision + ", departamento=" + departamento + "]";
	}
	
	
	

}
