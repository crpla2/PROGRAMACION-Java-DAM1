package ejemplos;

import java.util.Scanner;

public class Ej12SentenciaIf {
  public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 System.out.print("¿Qué has sacado en programación? ");
     double nota = s.nextDouble();

    if (nota >= 5) {
      System.out.println("¡Aprobado!");
    } else {
      System.out.println("Lo siento, has suspendido.");
    }
  }
}