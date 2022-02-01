package ejercicios;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.print("Por favor introduce un entero");
	int x= s.nextInt();
	
	if (x%2==0)
		System.out.println("El número es par");
	else
		System.out.println("El número es impar");
	}

}

