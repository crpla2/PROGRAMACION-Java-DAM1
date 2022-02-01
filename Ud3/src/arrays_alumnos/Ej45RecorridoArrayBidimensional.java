package arrays_alumnos;

import java.util.Scanner;

public class Ej45RecorridoArrayBidimensional {
  public static void main(String[] args) {
        
    int[][] matriz = new int[3][2];
    Scanner s = new Scanner(System.in);          
    System.out.println("Introducción de elementos en la matriz 3 x 2");
    for (int i=0; i<3; i++) {
    	for (int j=0; j<2; j++) {
    		System.out.print("Introduce Fila " + i +" Columna " + j + ": ");
    		matriz[i][j]=s.nextInt();
    	}
    }
    
    System.out.println("La matriz contiene los siguientes elementos:");
    
    for (int i=0; i<3; i++) {
    	for (int j=0; j<2; j++) {
    		System.out.print(matriz[i][j] + "  ");
    	}
    	System.out.println("");
  }
    	
  }
  }
