package ejemplos;

import java.util.Scanner;

public class Ej23ContinueBreak {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
	  int i = 0, cuenta = 0;
    do {
      int num = s.nextInt();
      if(num == 0) break;
      if(num < 0) continue;
      cuenta += 1;
      i++;
    } while(i < 5);
    System.out.println("Resultado: " + cuenta);
  }
}
