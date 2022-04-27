package pag153_ejercicio07;

public class MainEurocoin {

	public static ArratListMonedas generables = new ArratListMonedas();

	public static void main(String[] args) {

		generables.insertar(new Moneda(new Valor(1, "céntimo"), "cara"));
		generables.insertar(new Moneda(new Valor(1, "céntimo"), "cruz"));
		generables.insertar(new Moneda(new Valor(2, "céntimos"), "cara"));
		generables.insertar(new Moneda(new Valor(2, "céntimos"), "cruz"));
		generables.insertar(new Moneda(new Valor(5, "céntimos"), "cara"));
		generables.insertar(new Moneda(new Valor(5, "céntimos"), "cruz"));
		generables.insertar(new Moneda(new Valor(10, "céntimos"), "cara"));
		generables.insertar(new Moneda(new Valor(10, "céntimos"), "cruz"));
		generables.insertar(new Moneda(new Valor(50, "céntimos"), "cara"));
		generables.insertar(new Moneda(new Valor(50, "céntimos"), "cruz"));
		generables.insertar(new Moneda(new Valor(1, "euro"), "cara"));
		generables.insertar(new Moneda(new Valor(1, "euro"), "cruz"));
		generables.insertar(new Moneda(new Valor(2, "euros"), "cara"));
		generables.insertar(new Moneda(new Valor(2, "euros"), "cruz"));
//		System.out.println(generables.insertar(new Moneda("2 euro", "cruz")));
//		System.out.println(generables);
//		System.out.println(generables.tamanyo());

//		System.out.println(generarMoneda());

		ArratListMonedas generadas = new ArratListMonedas();
		int contador = 0;
		int insertada = 0;
		Moneda moneda = new Moneda(), monedaGenerada =new Moneda();

		do {
			if (insertada != 0)
				monedaGenerada = moneda;
			insertada = 0;
			moneda = generarMoneda();
			System.out.println(moneda);
			System.out.println("[" + monedaGenerada + "]");
			if (monedaGenerada.getValor().equals(moneda.getValor()))
				if (!(monedaGenerada.getPosicion().equals(moneda.getPosicion()))) {
					generadas.insertar(moneda);
					contador++;
					insertada++;

				} else if (monedaGenerada.getPosicion().equals(moneda.getPosicion())) {
					generadas.insertar(moneda);
					contador++;
					insertada++;

				}

		} while (contador < 6);
		System.out.println("..............................");
		System.out.println(generadas);
	}

	public static Moneda generarMoneda() {
		int numero = (int) (Math.random() * 14) + 1;
//		System.out.println(numero);
		int contador = 0;
		do {
			if (numero == contador)
				break;
			contador++;
		} while (contador <= 14);
		return generables.buscarPorPosicion(contador);
	}
}
