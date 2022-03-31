package lorenzo;

public class Ejercicio15 {

	public static void main(String[] args) {

		int n = 1;
		int registro = 1;
		
		for (int contadorPrimos = 1; contadorPrimos <= 100; contadorPrimos++) {

			int contador = 0;

			for (int i = 1; i <= n; i++) {

				if (n % i == 0) {

					contador = contador + 1;
				}
			}
			if (contador == 2) {

				System.out.println(registro + "º número primo: " + n);
				n++;
				registro++;
			} 
			else {
				
				contadorPrimos = contadorPrimos - 1;
				n++;
			}
		}

	}

}
