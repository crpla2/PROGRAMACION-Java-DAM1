package ejercicios;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		System.out.println("segundos transcurridos:");
		Scanner n = new Scanner(System.in);
		int ds=n.nextInt();
		int h=(ds/3600);
		int resto=(ds%3600);
		int m=(resto/60);
		int s=(resto%60);
		System.out.println(h+" horas  "+m+" minutos   "+s+" segundos");
	}

}
