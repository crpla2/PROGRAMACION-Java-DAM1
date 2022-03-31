package repaso_vectores;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		int numero = 10;
		int vector[] = new int[numero];
		System.out.println("Introduce una serie de " + numero + " numeros seguidos de un intro");
		rellenar(vector);
		contador(vector);

	}

	public static void rellenar(int v[]) {

		Scanner s = new Scanner(System.in);
		for (int i = 0; i < v.length; i++) {
			System.out.print("Introduce el siguiente número =>");
			v[i] = s.nextInt();
		}
	}

	public static void contador(int v[]) {
		int positivos = 0, negativos = 0, ceros = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] == 0)
				ceros++;
			if (v[i] > 0)
				positivos++;
			if (v[i] < 0)
				negativos++;
		}
		System.out.println("nº Positivos: " + positivos);
		System.out.println("nº Negativos: " + negativos);
		System.out.println("nº Ceros: " + ceros);

	}
}