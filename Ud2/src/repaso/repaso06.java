package repaso;

import java.util.Scanner;

public class repaso06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un consumo:");
		int n = s.nextInt();
		
		final double X=100*0.15;
		final double Y=400*0.20;
		final double Z=500*0.35;
		;
		if (n<=100)
			System.out.println(n*0.15 + " EUROS " );
		if (n>100&&n<=500)
			System.out.println(X+(n-100)*0.20 + " EUROS " );
		if (n>500&&n<=1000)
			System.out.println(X+Y+(n-500)*0.35 + " EUROS " );
		if (n>1000)
			System.out.println(X+Y+Z+(n-1000)*0.8 + " EUROS " );
	}}
