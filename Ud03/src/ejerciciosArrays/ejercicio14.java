package ejerciciosArrays;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		
		int fila=2;
		int columna=2;
		int [][] simetrica= new int [fila][columna];
		rellenar (simetrica);
		comprobar(simetrica);
	}
	public static void rellenar (int [][] simetrica) {
		Scanner s= new Scanner(System.in);
		for(int i=0;i<simetrica.length;i++) {
			for(int j=0; j<simetrica.length;j++) {
				System.out.println("Introduza la casilla: "+ (i+1) +"."+(j+1));
				simetrica[i][j]= s.nextInt();
			}		
		}
	}
	
	public static void comprobar (int [][] simetrica) {
		int contador=0;
		for(int i=0;i<simetrica.length;i++) {
			for(int j=0; j<simetrica.length;j++) {
				if(simetrica[i][j]!=simetrica[j][i])
					contador++;
			}}
		if(contador==0)
			System.out.println("Es simetrica");
		else
			System.out.println("No es simetrica");
	}
	
	
	
}
