package ejemplos;

import java.util.Scanner;

public class Ej21Media10NumerosFor {
    
  public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    int numeroLeido, suma=0;
    for (int i=1; i<11; i++) {
    	System.out.println("Introduce número: " + i + "--> ");
    	numeroLeido=s.nextInt();
    	suma=suma+numeroLeido;
    	
    }
    
    System.out.println("La media  de ellos es " + ((double) suma/10));
  }
}
