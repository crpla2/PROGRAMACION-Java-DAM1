package arrays_alumnos;

import java.util.Scanner;

public class Ej45RecorridoArrayBidimensional4 {
  public static void main(String[] args) {
        
      int filas =3, columnas=2;
	  int[][] matriz = new int[filas][columnas];
      escribirMatriz(matriz);
      leerMatriz(matriz);  
  } // del main
  //
  public static void escribirMatriz(int [][]m)  {
	  Scanner s = new Scanner(System.in);          
	    System.out.println("Introducción de elementos en la matriz 3 x 2");
	    
	    for (int i=0; i<m.length; i++) {
	    	for (int j=0; j<m[i].length ; j++) {
	    		System.out.print("Introduce Fila " + i +" Columna " + j + ": ");
	    		m[i][j]=s.nextInt();
	    	}
	    }
	  
  } // de escribirMatriz
  
  public static void leerMatriz (int [][]m) {
	  System.out.println("La matriz contiene los siguientes elementos:");
	    
	    for (int i=0; i<m.length; i++) {
	    	for (int j=0; j<m[i].length; j++) {
	    		System.out.print(m[i][j] + "  ");
	    	}
	    	System.out.println("");
	    
	  }
	  
  } // de leerMatriz
}
