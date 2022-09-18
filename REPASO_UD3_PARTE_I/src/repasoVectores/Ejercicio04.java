package repasoVectores;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Cuantas persona va a medir?");
		int n = s.nextInt();
		double[] altura = new double[n];
		for (int i = 0; i < altura.length; i++) {
			System.out.println("Introduzca la altura: ");
			altura[i] = s.nextDouble();
		}
		double max=altura[0],min=altura[0],media=0;
		for(int i=0;i<altura.length;i++) {
			if(altura[i]<min)
				min=altura[i];
			if(altura[i]>max)
				max=altura[i];
			media+=altura[i];
		}
		media=media/altura.length;
		int mas=0,menos=0;
		for(int i=0;i<altura.length;i++)
			if(altura[i]<media)
				menos++;
			else mas++;
		System.out.println("Altura media "+media);
		System.out.println("de "+n+" personas "+mas+" miden mas de la media y "+menos+ " menos");
	}
}
