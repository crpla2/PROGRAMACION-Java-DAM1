package _01objetos;

public class Pizza {
	
	private static int pedidas = 0;
	private static int servidas = 0;
	
	private String tipo;
	private String tamaño;
	private String estado;
	
	public Pizza(String tipo, String tamaño) {
		this.tipo=tipo;
		this.tamaño=tamaño;
		estado="pedida";
		pedidas++;
	}
	
	public void sirve() {
		if(this.estado=="servida") {
		System.out.println("esa pizza ya se ha servido");
		return;
		}
		this.estado="servida";
		servidas++;
	}

	public String toString() {
		return ("pizza " + this.tipo + " " + this.tamaño + ", " + this.estado);
	}
	
	public static int getTotalPedidas() {
		return pedidas;
	}
	
	public static int getTotalServidas() {
		return servidas;
	}
}
