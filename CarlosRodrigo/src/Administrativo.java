
public class Administrativo extends Empleado{
	private int antiguedad;

	public Administrativo(String nombre, int edad, double salarioBase, int antiguedad) {
		super(nombre, edad, salarioBase);
		this.antiguedad = antiguedad;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "Administrativo ["+super.toString()+ ", antiguedad=" + antiguedad + "]";
	}

	@Override
	public double salarioTotal() {
		return getSalarioBase()+(antiguedad*PLUS);
	}
	
	

}
