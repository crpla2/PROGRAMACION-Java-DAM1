package repaso;

import java.util.Scanner;

public class repaso01 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System. out.println("introduce un número entero");
		int x;
		x= s.nextInt();
		if (x%2==0)
			System. out.println("par");
		else
			System. out.println("impar");
	}

}
