package arrays_alumnos;

import java.util.Scanner;
// Qué es lo que usaremos realmente, Strings

public class Ej43ArrayDeCaracteresVer2 {
  public static void main(String[] args) {
        
    String string = "Alberto";
    System.out.print("Imprimimos el string: " );
    for (int i=0; i<string.length(); i++) 
    	System.out.print(string.charAt(i));
  }
}
