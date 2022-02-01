package ejerciciosArrays;

import java.util.Scanner;

public class ejercicio08 {
	static Scanner s = new Scanner(System.in);

	public static void rellenar(double[] nota) {

		for (int i = 0; i < nota.length; i++) {
			System.out.print("Introduzca nota " + (i + 1)+" => ");
			nota[i] = s.nextDouble();
		}
	}// rellenar
	public static void imprimeNota(double[] nota) {
			
			for (int i = 0; i < nota.length; i++) {
			System.out.println("Nota alumno " + (i + 1)+": "+  nota[i]);
			
		}
	}//imprimeNota
	public static double media(double[] nota) {
		int contador = 0;
		double suma = 0;
		
		for (int i = 0; i < nota.length; i++) {
			suma = suma + nota[i];
			contador++;
		}
		return suma / contador;
	}// media

	public static int suspensos (double[] nota) {
		int contador = 0;
		for (int i = 0; i < nota.length; i++) {
			if (nota[i] < 5) {
				contador++;
			}
		}
		return contador;
	}//Suspensos
	
	public static void main(String[] args) {
		int tamanyo =10;
		double nota []= new double[tamanyo];
		System.out.println("Introduzca las calificaciones");
	
		rellenar(nota);
		imprimeNota(nota);
		System.out.printf("Media alumnos: %.2f \n", media(nota));
		System.out.println("Numero de suspensos: "+ suspensos(nota));
		System.out.println("Numero de aprobados:" +(tamanyo-suspensos(nota)));
	}// main
}
