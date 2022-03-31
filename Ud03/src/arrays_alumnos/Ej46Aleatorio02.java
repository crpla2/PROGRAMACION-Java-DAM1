package arrays_alumnos;

public class Ej46Aleatorio02 {
  public static void main(String[] args) {

    System.out.println("5 números aleatorios entre 0 y 10");
   
    
    for (int i = 1; i <= 5; i++)
    	System.out.println( Math.random()*10);
  }
}
