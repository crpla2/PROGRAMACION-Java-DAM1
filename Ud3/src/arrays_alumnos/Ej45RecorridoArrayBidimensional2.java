package arrays_alumnos;

import java.util.Scanner;

public class Ej45RecorridoArrayBidimensional2 {
  public static void main(String[] args) {
        
      int filas =3, columnas=2;
	  int[][] matriz = new int[filas][columnas];
    Scanner s = new Scanner(System.in);          
    System.out.println("Introducción de elementos en la matriz 3 x 2");
    
    for (int i=0; i<filas; i++) {
    	for (int j=0; j<columnas ; j++) {
    		System.out.print("Introduce Fila " + i +" Columna " + j + ": ");
    		matriz[i][j]=s.nextInt();
    	}
    }
    
    System.out.println("La matriz contiene los siguientes elementos:");
    
    for (int i=0; i<filas; i++) {
    	for (int j=0; j<columnas; j++) {
    		System.out.print(matriz[i][j] + "  ");
    	}
    	System.out.println("");
    
  }
   
  }
  }
