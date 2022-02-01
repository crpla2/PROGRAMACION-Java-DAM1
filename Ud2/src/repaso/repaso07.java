package repaso;

import java.util.Scanner;

public class repaso07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("introduce un número entero");
		int x, suma;
		suma = 0;
		x = s.nextInt();
		while (x <= 0)

		{

			System.out.println("introduce un numero mayor que 0");
			x = s.nextInt();
		if(x>0){
			for (int i = 0; i <= x; i++)
				suma = suma + i;
			System.out.println(suma);
		}
	}}}

