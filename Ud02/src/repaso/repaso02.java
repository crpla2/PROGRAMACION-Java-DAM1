package repaso;

import java.util.Scanner;

public class repaso02 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System. out.println("introduce tres enteros");
		int x,y,z;
		x= s.nextInt();
		y= s.nextInt();
		z= s.nextInt();
		if (x>y&&x>z)
			System. out.println(x+" Es el mayor");
		if (y>x&&y>z)
			System. out.println(y+" Es el mayor");
		if (z>x&&z>y)
			System. out.println(z+" Es el mayor");
	}

}
