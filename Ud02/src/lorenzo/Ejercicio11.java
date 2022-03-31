package lorenzo;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Por favor, vaya introduciendo distintos carácteres, de uno en uno, pulsando INTRO entre cada uno de ellos.");
		System.out.println("Para finalizar, ponga *");

		int x = s.nextLine().charAt(0);

		int digito = 0, letraMayuscula = 0, letraMinuscula = 0;

		while (x != 42) {

			if (x >= 48 && x <= 57) {
				digito++;
			}
			if (x >= 65 && x <= 90) {
				letraMayuscula++;
			}
			if (x >= 97 && x <= 122) {
				letraMinuscula++;
			}

			x = s.nextLine().charAt(0);

		}

		System.out.println("Has introducído " + digito + " dígitos, " + letraMayuscula + " letras mayúsculas y "
				+ letraMinuscula + " letras minúsculas.");

	}

}
