package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Introduce un entero");
		try {
		int n= s.nextInt();
		System.out.println(n);
		}catch(InputMismatchException ime){
			System.out.println("Has introducido un formato erroneo, no es un entero.");
		}
		s.close();
	}

}
