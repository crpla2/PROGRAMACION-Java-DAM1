package arrays_alumnos;

import java.util.Scanner;

public class Ej41RecorridoArrayVer2 {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);          
	System.out.println("De cuántos elementos quieres el array");
	int m= s.nextInt();
    int[] num = new int[m];
    
    System.out.println("Introducción de elementos en el array");
    for (int i=0; i<m; i++) {
    	System.out.print("Introduce el " + i +": " );
    	//System.out.print("Introduce el " + (i+1) +": " );
    	num[i]=s.nextInt();
    }
    
    System.out.println("El array num contiene los siguientes elementos:");
    
    for (int i = 0; i < m; i++) {
    	System.out.println("Elemento nº " + i + " --> "+num[i]);
    	//System.out.println("Elemento nº " + (i+1) + " --> "+num[i]);
    }
  }
}
