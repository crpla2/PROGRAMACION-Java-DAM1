package objetos_ejercicios_1_2_3;

public class Pizza {

	private static int TotalPedidas = 0;
	private static int TotalServidas = 0;

	private String tamanyo;
	private String tipo;
	private String estado;

	/*
	 * public Pizza() { estado="pedida"; TotalPedidas++; }
	 */
//
	public Pizza(String tamanyo, String tipo) {

		this.tamanyo = tamanyo;
		this.tipo = tipo;
		this.estado = "pedida";
		TotalPedidas++;
	}

//
	public static int getTotalPedidas() {
		return TotalPedidas;
	}

	public static int getTotalServidas() {
		return TotalServidas;
	}

	public String getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(String tamanyo) {
		this.tamanyo = tamanyo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void sirve() {
		if (estado == "pedida") {
			estado = "servida";
			TotalServidas++;
		} else
			System.out.println("esa pizza ya se ha servido");
	}

	@Override
	public String toString() {
		return "pizza  " + tipo + ", " + tamanyo + ", " + estado;
	}

}
