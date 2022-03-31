package ejerciciosArrays;

import java.util.Scanner;

public class ejercicio09 {

	static int numNotas = 0;
	static int tamanyo;

	public static void rellenar(double[] nota) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < nota.length; i++) {
			if (nota[i] >= 0) {
				System.out.print("Introduzca nota " + (i + 1) + " => ");
				nota[i] = s.nextDouble();
				numNotas++;
			}
			if (nota[i] < 0)
				break;
		}
	}// rellenar

	public static void imprimeNota(double[] nota) {
		for (int i = 0; i < tamanyo - 1; i++)
			System.out.println("Nota alumno " + (i + 1) + ": " + nota[i]);
	}// imprimeNota

	public static double media(double[] nota) {
		int contador = 0;
		double suma = 0;
		
		for (int i = 0; i < tamanyo - 1; i++) {
			suma = suma + nota[i];
			contador++;
		}
		if(tamanyo-1==0)
			return 0;
		else
		return suma / contador;
		
		
	}// media

	public static int suspensos(double[] nota) {
		int contador = 0;
		for (int i = 0; i < tamanyo - 1; i++) {
			if (nota[i] < 5)
				contador++;
		}
		return contador;
	}// Suspensos

	public static double maximo(double[] nota) {
		double maximo = nota[0];
		for (int i = 0; i < tamanyo - 1; i++) {
			if (nota[i] > maximo)
				maximo = nota[i];
		}
		if(tamanyo-1==0)
		return 0;
		else
		return maximo;
	}// maximo

	public static void tamanyoArray(int x) {
		if (numNotas < 30)
			tamanyo = numNotas;
		else
			tamanyo = 31;
	}

	public static void main(String[] args) {

		System.out.println("Introduzca las calificaciones");
		double nota[] = new double[30];
		rellenar(nota);
		System.out.println();
		tamanyoArray(tamanyo);
		imprimeNota(nota);
		System.out.println();
		System.out.printf("Media alumnos: %.2f \n", media(nota));
		System.out.println("Nota maxima: " + maximo(nota));
		System.out.println("Numero de suspensos: " + suspensos(nota));
		System.out.println("Numero de aprobados: " + ((tamanyo-1)-suspensos(nota)));
	}// main
}
