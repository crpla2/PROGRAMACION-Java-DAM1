package ejemplos;

import java.util.Scanner;

public class Ej22CuentaPositivosWhile {
    
  public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
	System.out.println("Por favor, vaya introduciendo números y pulsando INTRO.");
    System.out.println("Para terminar, introduzca un número negativo.");
    
    int numeroIntroducido, cuentaNumeros = 0, suma = 0;
    numeroIntroducido= s.nextInt();
    while (numeroIntroducido >= 0) {
      cuentaNumeros++; // 
      suma += numeroIntroducido; 
      numeroIntroducido= s.nextInt();
    }
    
    System.out.println("Has introducido " + (cuentaNumeros) + " números positivos.");
    System.out.println("La suma total de ellos es " + (suma));
  }
}
