package ejemplos;

import java.util.Scanner;

public class Ej14OperadoresLogicos01 {
  public static void main(String[] args) {
    System.out.println("Adivina el número que estoy pensando.");
    System.out.print("Introduce un número entre el 1 y el 5: ");
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();

    if ((n < 1) || (n > 5)) {
      System.out.println("El número introducido debe estar en el intervalo 1 - 5.");
      System.out.print("Tienes otra oportunidad, introduce un número: ");
      n = s.nextInt();
    }   
  
    if (n == 4) {
      System.out.println("¡Enhorabuena!, has acertado!");
    } else {
      System.out.println("Lo siento, ese no es el número que estoy pensando.");
    }
  }
}
