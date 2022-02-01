package ejemplos;

import java.util.Scanner;

public class Ej11SentenciaIf {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduce un entero: ");
    int x = s.nextInt();

    if (x < 0) {
      System.out.printf("El número %d es negativo.",x);
    } else {
      System.out.printf("El número %d es positivo.",x);
    }
  }
}
