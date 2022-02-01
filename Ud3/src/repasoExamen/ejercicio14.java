package repasoExamen;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		int n=2;
		int matriz[][]=new int [n][n];
		rellena(matriz);
		pinta(matriz);
		if(esSimetrica(matriz))
			System.out.println("Es simetrica");
		else
			System.out.println("no es simetirca");
	}
	public static void rellena(int m[][]){
		Scanner s= new Scanner(System.in);
		System.out.println("introduce los numeros de la matriz");
		for(int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				System.out.print("introduzca el siguiente numero=> ");
				m[i][j]=s.nextInt();		
			}
		}	
	}
	public static void pinta(int m[][]){
		for(int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				System.out.print(m[i][j]+" ");	
			}
			System.out.println();
		}	
	}
	public static boolean esSimetrica(int m[][]) {
		for(int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				if(m[j][i]!=m[i][j])
					return false;
			}
		}
		return true;
	}
}
