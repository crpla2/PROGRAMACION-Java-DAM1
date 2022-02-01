package arrays_alumnos;

public class Ej46Aleatorio05 {
  public static void main(String[] args) {

    System.out.println("5 ENTEROS aleatorios entre 50 y 60:");
    
    for (int i = 1; i <= 5; i++) 
    	System.out.print(((int)(Math.random()*11) + 50 ) + "  ");
    
  }
}
