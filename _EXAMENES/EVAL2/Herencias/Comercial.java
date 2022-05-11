package Herencias;

public class Comercial extends Empleado{
	private double ventasMensuales;

	public Comercial(String nombre, int edad, double salarioBase, double ventasMensuales) {
		super(nombre, edad, salarioBase);
		this.ventasMensuales = ventasMensuales;
	}

	public double getVentasMensuales() {
		return ventasMensuales;
	}

	public void setVentasMensuales(double ventasMensuales) {
		this.ventasMensuales = ventasMensuales;
	}

	@Override
	public String toString() {
		return "Comercial ["+super.toString()+", ventas mensuales=" + ventasMensuales + "]";
	}

	@Override
	public double salarioTotal() {
		return getSalarioBase()+(ventasMensuales/100);
		
	}
	
	
	
}
