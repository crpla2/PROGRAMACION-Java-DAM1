package metodos_alumnos;

import java.util.Scanner;

public class Ej37FactorialConFunciones {

	public static long Factorial (int n) {
	    long factorial=1;
		for (int i=1;i<=n;i++) {
			factorial = factorial * i;
		}	
		return factorial;
		}// de Factorial
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.print("Introduce un número entero positivo: ");
	    int n = s.nextInt();
	    if (n>=0)
	    	System.out.println("El factorial de " + n + " vale " + Factorial(n));

	}

}
