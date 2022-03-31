package repaso_vectores;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		int numero = 10;
		int vector[] = new int[numero];
		System.out.println("Introduce una serie de " + numero + " numeros seguidos de un intro");
		rellenar(vector);
		medias(vector);

	}

	public static void rellenar(int v[]) {

		Scanner s = new Scanner(System.in);
		for (int i = 0; i < v.length; i++) {
			System.out.print("Introduce el siguiente número =>");
			v[i] = s.nextInt();
		}
	}

	public static void medias(int v[]) {
		int positivos = 0, negativos = 0,sumaPos=0,sumaNeg=0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] >= 0) {
				sumaPos=sumaPos+v[i];
				positivos++;}
			if (v[i] < 0) {
				sumaNeg=sumaNeg+v[i];
				negativos++;}
		}
		System.out.println("media Positivos: " + (sumaPos/positivos));
		System.out.println("media Negativos: " + (sumaNeg/negativos));
		

	}
}