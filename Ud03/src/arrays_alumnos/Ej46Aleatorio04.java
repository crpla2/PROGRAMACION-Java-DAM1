package arrays_alumnos;

public class Ej46Aleatorio04 {
    
  public static void main(String[] args) {

    System.out.println("5 ENTEROS aleatorios entre 1 y 10: ");
    
    for (int i = 1; i <= 5; i++) 
    	System.out.print( ((int)(Math.random()*10) + 1) + "  ");

  }
}
