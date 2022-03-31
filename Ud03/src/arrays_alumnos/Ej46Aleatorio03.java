package arrays_alumnos;

public class Ej46Aleatorio03 {
  public static void main(String[] args) {

    System.out.println("5 números aleatorios ENTEROS entre 0 y 9:");
    
    for (int i = 1; i <= 5; i++) 
      System.out.print((int)(Math.random()*10) + "  ");
  }
}
