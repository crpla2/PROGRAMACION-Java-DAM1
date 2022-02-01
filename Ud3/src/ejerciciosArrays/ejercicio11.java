package ejerciciosArrays;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduce número binario: ");
		String binario = s.nextLine();

		double suma = 0;
		int exponente = 0;
		int[] bits = new int[binario.length()];
		for (int j = 0; j < binario.length(); j++)
			bits[j] = Character.getNumericValue(binario.charAt(j));

		for (int j = binario.length() - 1; j >= 0; j--) {

			if ((bits[j] == 1) || (bits[j] == 0)) {
				if (bits[j] == 1) {
					suma = suma + Math.pow(2, exponente);
					exponente++;
				}
				if (bits[j] == 0)

					exponente++;

			} else {
				System.out.println("el numero no es binario");
				System.exit(0);}
		}

		System.out.println(suma);
	}
}
