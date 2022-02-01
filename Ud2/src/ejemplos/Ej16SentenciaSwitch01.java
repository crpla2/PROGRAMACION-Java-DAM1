package ejemplos;

import java.util.Scanner;

public class Ej16SentenciaSwitch01 {
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
	  System.out.println(" CÁLCULO DE ÁREAS");
    System.out.println(" ----------------");
    System.out.println(" 1. Cuadrado");
    System.out.println(" 2. Rectánngulo");
    System.out.println(" 3. Triángulo");
    System.out.print("\n Elija una opción (1-3): ");
  
    int opcion = s.nextInt();

    double lado;
    double base;
    double altura;
    
    switch (opcion) {
      case 1:
        System.out.print("\nIntroduzca el lado del cuadrado en cm: ");
        lado = s.nextDouble();
        System.out.println("\nEl Área del cuadrado es " + (lado * lado) + " cm2");
        break;
    
      case 2:
        System.out.print("\nIntroduzca la base del rectángulo en cm: ");
        base = s.nextDouble();
        System.out.print("Introduzca la altura del rectángulo en cm: ");
        altura = s.nextDouble();
        System.out.println("El Área del rectángulo es " + (base * altura) + " cm2");
        break;
    
      case 3:
        System.out.print("\nIntroduzca la base del triángulo en cm: ");
        base = s.nextDouble();
        System.out.print("Introduzca la altura del triángulo en cm: ");
        altura = s.nextDouble();
        System.out.println("El Área del triángulo es " + ((base * altura) / 2) + " cm2");
        break;
        
      default:
        System.out.print("\nLo siento, la opción elegida no es correcta.");
    }
  }
}
