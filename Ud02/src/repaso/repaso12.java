package repaso;

import java.util.Scanner;

public class repaso12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("introduce 2 numeros");
		int a, b, potencia;
		a = s.nextInt();
		b = s.nextInt();
		potencia = 1;
		while (b < 0) {
			System.out.print("El numero es negativo, por favo introduce un numero positivo");
			b = s.nextInt();
		}

		
		for (int i = 1; i <= b; i++)
			potencia = potencia * a;

		System.out.print(potencia);
	}
}