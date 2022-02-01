package ejercicios;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {

		int n, contador;
		boolean primo;
		n = 1;
		contador = 0;
	
		while (contador < 100) {
			primo = true;
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					primo = false;
					break;
					
				}//if
			} // for
			if (primo) {
				System.out.print(n + "-");
				contador++;
			}//if
			n++;
		} // while
		
	}

}
