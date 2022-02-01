package repasoExamen;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		int nAl = 3, nAs = 4;

		double notas[][] = {{5.6,9.4,6.8,7},{6.9,5.2,5.7,6.3},{9.8,8,7.6,8.5}};

		mMmAlumnos(notas);
		mMmAsignaturas(notas);
		mMmCurso(notas);
		buscaNota(notas);
	}


	public static void mMmAlumnos(double[][] r) {
		for (int i = 0; i < r.length; i++) {
			int contador=0;
			double max=r[0][0],min=r[0][0],sumaNotas=0;
			for (int j = 0; j < r[i].length; j++) {
				if(r[i][j]>max)
					max=r[i][j];
				if(r[i][j]<min)
					min=r[i][j];
				contador++;
				sumaNotas=sumaNotas+r[i][j];
			}
			System.out.println("La nota máxima del alumno "+(i+1)+" es: "+max);
			System.out.println("La nota mínima del alumno "+(i+1)+" es: "+min);
			System.out.printf("La nota media del alumno %d es: %.2f \n ",(i+1),sumaNotas/contador);
			System.out.println();
		}
	}
	public static void mMmAsignaturas(double[][] r) {
		for (int j = 0; j < r[0].length; j++) {
			int contador=0;
			double max=r[0][0],min=r[0][0],sumaNotas=0;
			for (int i = 0; i < r.length; i++) {
				if(r[i][j]>max)
					max=r[i][j];
				if(r[i][j]<min)
					min=r[i][j];
				contador++;
				sumaNotas=sumaNotas+r[i][j];
			}
			System.out.println("La nota máxima de la asignatura "+(j+1)+" es: "+max);
			System.out.println("La nota mínima de la asignatura "+(j+1)+" es: "+min);
			System.out.printf("La nota media de la asignatura %d es: %.2f \n ",(j+1),sumaNotas/contador);
			System.out.println();
		}
	}
	public static void mMmCurso(double[][]r) {
		int contador=0;
		double max=r[0][0],min=r[0][0],sumaNotas=0;
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < r[i].length; j++) {
				if(r[i][j]>max)
					max=r[i][j];
				if(r[i][j]<min)
					min=r[i][j];
				contador++;
				sumaNotas=sumaNotas+r[i][j];
			}
			
		}
		System.out.println("La nota máxima del curso es: "+max);
		System.out.println("La nota mínima del curso es: "+min);
		System.out.printf("La nota media del curso es: %.2f \n ",sumaNotas/contador);
		System.out.println();
	}
	public static void buscaNota(double[][]r) {
		Scanner s=new Scanner (System.in);
		System.out.println("Introduza una nota: ");
		double n=s.nextDouble();
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < r[i].length; j++) {
				if(n==r[i][j])
					System.out.printf("La nota %.2f la ha obtenido el alumno %d en la asignatura %d \n", r[i][j], (i+1), (j+1));
			}
	}
}
	
}