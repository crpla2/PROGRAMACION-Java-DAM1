package arrays_alumnos;

import java.util.Scanner;

public class Ej41RecorridoArrayVer4 {
  public static void main(String[] args) {
        
    int[] num = new int[5];
    Scanner s = new Scanner(System.in);          
    System.out.println("Introducción de elementos en el array");
    for (int i=0; i<5; i++) {
    	System.out.print("Introduce el " + i +": " );
    	//System.out.print("Introduce el " + (i+1) +": " );
    	num[i]=s.nextInt();
    }
    
    System.out.println("El array num contiene los siguientes elementos:");
    
    for (int n : num) 
    	System.out.println("Elemento " + " --> "+ n);
  
  }
}
