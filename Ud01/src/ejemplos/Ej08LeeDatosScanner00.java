package ejemplos;



import java.util.Scanner;

public class Ej08LeeDatosScanner00 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String nombre;
    int edad;
    double salario;
    
    System.out.print("Introduce tu nombre: ");
    nombre = s.nextLine();
    
    System.out.print("Introduce tu edad: ");
    edad = s.nextInt();
    
    System.out.print("Introduce tu salario: ");
    salario = s.nextDouble();
    
    System.out.println("Tu nombre es " + nombre + ", tu edad es " + edad +
    		" y tu salario " + salario);
  }
}
