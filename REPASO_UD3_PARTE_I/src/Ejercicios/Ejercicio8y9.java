package Ejercicios;

import java.util.Scanner;

public class Ejercicio8y9 {
public static int tamanyo;
	public static void main(String[] args) {
		
		double[] notas = new double[30];

		rellena(notas);
		imprimenotas(notas);
		suspensosYaprobados(notas);
	}

	private static void imprimenotas(double[] notas) {
		for (int i = 0; i <tamanyo ; i++) {
			System.out.println("Alumo " + (i + 1) + " nota:" + notas[i]);
		}
		System.out.println("Media :"+notamedia(notas)+"\nNota máxima: "+notamax(notas));
	}

	private static void rellena(double[]notas) {
		tamanyo=0;
		Scanner s= new Scanner(System.in);
		for(int i=0;i<notas.length;i++) {
			System.out.println("Introduzca la nota del alumno "+(i+1));
			double nota=s.nextDouble();
			if(nota>0) {
					tamanyo++;
				if (tamanyo<=30)
				notas[i]=nota;
				else break;
			}
			else break;
			}
		}
		

		private static double notamedia (double[]notas) {
			double suma=0;int contador=0;
			for(int i=0;i<tamanyo;i++) {
				suma+=notas[i];
				contador++;
			}
			return suma/contador;
		}
		
		private static void suspensosYaprobados (double[]notas) {
		int aprobados=0,suspensos=0;
			for(int i=0;i<tamanyo;i++) {
				if(notas[i]<5)
					suspensos ++;
				else
					aprobados++;
		}System.out.println("Suspensos: "+suspensos+"\nAprobados: "+aprobados);
		}
		private static double notamax(double[]notas) {
			double max=notas[0];
			for (int i=0;i<tamanyo;i++)
				if(notas[i]>max)
					max=notas[i];
			return max;
			
		}
}
