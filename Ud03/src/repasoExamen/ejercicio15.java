package repasoExamen;

import java.util.Scanner;

public class ejercicio15 {
	static int n=3;
	static int tras[][]=new int [n][n];
	public static void main(String[] args) {
	
	int matriz[][]=new int [n][n];
	
	rellena(matriz);
	pinta(matriz);
	System.out.println();
	traspon(matriz);
	pinta(tras);
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
	public static void traspon(int m[][]) {
		for(int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				tras[i][j]=m[j][i];
				} 
			}
	}
}
