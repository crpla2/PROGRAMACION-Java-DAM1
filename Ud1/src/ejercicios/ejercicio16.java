package ejercicios;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("introduce una cantidad: ");
		int euro= s.nextInt();
		System.out.println("billetes de 500: " + (euro/500));
		System.out.println("billetes de 200: " + ((euro%500)/200));
		System.out.println("billetes de 100: " +(((euro%500)%200)/100));
		System.out.println("billetes de 50: " + (((euro%500)%200)%100)/50);
		System.out.println("billetes de 20: " +(((((euro%500)%200)%100)%50)/20));
		System.out.println("billetes de 10: " + ((((((euro%500)%200)%100)%50)%20)/10));
		System.out.println("billetes de 5: " + (((((((euro%500)%200)%100)%50)%20)%10)/5));
	}

}
