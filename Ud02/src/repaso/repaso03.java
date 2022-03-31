package repaso;

import java.util.Scanner;

public class repaso03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("introduce dos numeros");
		int x, y, z;
		x = s.nextInt();
		y = s.nextInt();

		if (x % y==0||y%x==0)
			System.out.println( "son multiplos");
		else
			System.out.println( "no son multiplos");	
	}

}
