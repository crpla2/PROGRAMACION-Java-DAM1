package repaso;

import java.util.Scanner;

public class repaso05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un caracter:");
		char x;
		x = s.nextLine().charAt(0);

		if ((x >= 48 && x <= 57) || (x >= 65 && x <= 90) || (x >= 97 && x <= 122)) {
			System.out.println(x + " es un es un carcater alfanumérico");

			if (x >= 48 && x <= 57)
				
			System.out.println(x + " es un numero");
			if ((x >= 65 && x <= 90) || (x >= 65 && x <= 90) || (x >= 97 && x <= 122))
				
			System.out.println(x + " es una letra");
			if (x >= 97 && x <= 122)
				
			System.out.println(x + " es minuscula");
			if (x >= 65 && x <= 90)
				
			System.out.println(x + " es mayuscula");
		} 
		else
			System.out.println(x + "no es un es un carcater alfanumérico");
	}
}