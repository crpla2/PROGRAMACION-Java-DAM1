package repaso;

import java.util.Scanner;

public class repaso10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("introduce una serie de numeros, para terminar introduce un negativo");
		int x, minimo, maximo, suma, contador;
		suma = 0;
		contador = 0;
		x = s.nextInt();
		maximo = x;
		minimo = x;
		if (x < 0) {
			System.out.print("sin datos");
			System.exit(0);
		}
		while (x >= 0) {
			{

				contador++;
				suma = suma + x;
				if (x > maximo)
					maximo = x;
				if (x < minimo)
					minimo = x;
				System.out.println("introduce un numero");
				x = s.nextInt();
			}
		}

		System.out.print((double) suma / contador + "media  /");
		System.out.print(minimo + "minimo  /");
		System.out.print(maximo + "maximo  /");
	}

}
