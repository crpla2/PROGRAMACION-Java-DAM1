package _EXAMENES;


public class Estaturas {

	public static void main(String[] args) {
		double[] altura = { 1.75, 1.68, 1.9, 2.04, 1.85, 1.66, 1.55, 1.88, 1.45, 1.82, 2.01, 1.79, 1.8, 1.56, 1.69,
				1.79, 1.83, 1.75, };

		media(altura);

	}

	private static void media(double[] altura) {
		double suma = 0;
		int nval = 0;
		for (int i = 0; i < altura.length; i++) {
			if (altura[i] > 2 || altura[i] < 1.5) {
				nval++;
			} else
				suma += altura[i];
		}
		System.out.println("De las " + altura.length + " medidas hay " + nval
				+ " no válidas (pues son inferiores a 1,5m. o superiores a 2m)\n"
				+ "La media de las estaturas validas es: " + suma / (altura.length - nval) + " m.");
	}

}
