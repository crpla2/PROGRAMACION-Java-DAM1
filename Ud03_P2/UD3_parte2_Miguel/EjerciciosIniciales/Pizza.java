package EjerciciosIniciales;

public class Pizza {

	private static int pedidas=0;
	public static int getPedidas() {
		return pedidas;
	}
	private static int servidas=0;
	public static int getServidas() {
		return servidas;
	}
	
	private String tipo;
	private String tamaño;
	private String estado;

	//Constructores
	public Pizza(String tipo, String tamaño) {
		this.tipo = tipo;
		this.tamaño = tamaño;
		this.estado = "pedida";
		pedidas++;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public String getEstado() {
		return estado;
	}
	//Metodos
	public void servir() {
		if(estado!="servida") {
			this.estado="servida";
			servidas++;
		}else {
			System.out.println("esta pizza ya está servida");
		}
	}

	@Override
	public String toString() {
		return "pizza "+ tipo+ " " + tamaño + ", " + estado;
	}
	


}
