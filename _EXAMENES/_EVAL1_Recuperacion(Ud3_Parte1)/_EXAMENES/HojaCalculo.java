package _EXAMENES;


import java.util.Scanner;

public class HojaCalculo {
	
	public static void main(String args[]) {
	    int filas, columnas;
	    int [][] matriz;
	    Scanner s = new Scanner (System.in);
	    System.out.println("Introduce número de filas (>=1)");
	    filas= s.nextInt();
	    System.out.println("Introduce número de columnas (>1)");
	    columnas=s.nextInt();
	    matriz = new int [filas] [columnas];
	    rellenar(matriz);
	    imprimir(matriz);
	}

	private static void imprimir(int[][] matriz) {
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]+"\t");
			}System.out.println();
			}
		
	}

	private static void rellenar(int[][] matriz) {
		int suma,cont=0;
		for(int i=0;i<matriz.length;i++) {
			suma=0;cont=0;
			for(int j=0;j<matriz[i].length-1;j++) {
				matriz[i][j]=(int)((Math.random()*10)+1);
				suma+=matriz[i][j];
				cont++;
				
			}matriz[i][cont]=suma;
		}
	}
	
}
