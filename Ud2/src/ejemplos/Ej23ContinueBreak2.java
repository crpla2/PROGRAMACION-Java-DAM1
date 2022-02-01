package ejemplos;

import java.util.Scanner;

public class Ej23ContinueBreak2 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
	  int i = 0, cuenta = 0;
    while (i<5 ) {
      int num = s.nextInt();
      if(num == 0) break;
      if(num < 0) continue;
      cuenta += 1;
      i++;
    } 
    System.out.println("Cuenta vale: " + cuenta + " e i--> " + i);
  }
}
