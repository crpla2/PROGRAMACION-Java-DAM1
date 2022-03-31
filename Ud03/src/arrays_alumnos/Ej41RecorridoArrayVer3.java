package arrays_alumnos;

import java.util.Scanner;

public class Ej41RecorridoArrayVer3 {
  static Scanner s = new Scanner(System.in);   
  public static void main(String[] args) {        
	System.out.println("De cuántos elementos quieres el array");
	int m= s.nextInt();
    int[] num = new int[m];
    escribirArray(num);
    leerArray(num);
    
  } // del main
    
 //
 public static void escribirArray(int [] x) {
    	System.out.println("Introducción de elementos en el array");
    	for (int i=0; i<x.length; i++) {
    		System.out.print("Introduce el " + i +": " );
    		x[i]=s.nextInt();
    	}
    } // de escribirArray
 //
 public static void leerArray (int [] x) {
	 System.out.println("El array x contiene los siguientes elementos:");
     for (int i = 0; i < x.length; i++) 
    	System.out.println("Elemento nº " + i + " --> "+x[i]);
  } // de leerArray
 
}