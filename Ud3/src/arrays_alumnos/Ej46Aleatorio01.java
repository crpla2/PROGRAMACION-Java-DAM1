package arrays_alumnos;

public class Ej46Aleatorio01 {
  public static void main(String[] args) {

    System.out.println("Cinco números aleatorios entre 0 y 1 --> [0,1)");

    for (int i = 1; i <= 5; i++)
    	System.out.println(Math.random());
  }
}
