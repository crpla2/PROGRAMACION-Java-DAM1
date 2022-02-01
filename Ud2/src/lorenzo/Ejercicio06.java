package lorenzo;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Indíca los metros cúbicos consumidos: ");
		double x =s.nextDouble();
		
		final double m0 = 0.15;
		final double m100 = 0.20;
		final double m500 = 0.35;
		final double m1000 = 0.80;
			
		if (x > 100) {
			x = x - 100;
				if (x > 400) {
					x = x - 400;
						if (x > 500) {
							x = x - 500;
							System.out.println("Coste total: " + (x * m1000 + 500 * m500 + 400 * m100 + 100 * m0) + " €");
							}
						else {
							System.out.println("Coste total: " + (x * m500 + 400 * m100 + 100 * m0) + " €");
							}
					}
				else {
					System.out.println("Coste total: " + (x * m100 + 100 * m0) + " €");	
					}
			}
		else {
			System.out.println("Coste total: " + (x * m0) + " €");
			}
	
	}
}

/*
if (x <= 100) {
	System.out.println("Coste total: " + x * m0 + " €");
	}		
else {	
	if (x <= 500) {
	System.out.println("Coste total: " + (100 * m0 + ((x - 100) * m100)) + " €");
	}
		
	else {
			
		if (x <= 1000) {
			System.out.println("Coste total: " + (100 * m0 + 400 * m100 + ((x - 500) * m500)) + " €");
			}

		else {
			System.out.println("Coste total: " + (100 * m0 + 400 * m100 + 500 * m500 + ((x - 1000) * m1000)) + " €");
			}
		}
	}
}
*/

