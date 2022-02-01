package ejemplos;

import java.util.Scanner;
// Leer datos mientras no introduzcamos un número negativo
public class Ej26Secuencias {
    
  public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
	System.out.println("Por favor, vaya introduciendo números y pulsando INTRO.");
    System.out.println("Para terminar, introduzca un 0.");
    
    int numeroIntroducido;
    numeroIntroducido= s.nextInt();
    while (numeroIntroducido != 0) {
      System.out.println("Bien, " + numeroIntroducido + " es distinto de 0, sigue:");
      numeroIntroducido= s.nextInt();
    }
    
    System.out.println("Terminaste!!!!");
  }
}
