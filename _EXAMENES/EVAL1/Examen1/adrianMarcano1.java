package Examen1;
import java.util.Scanner;
public class adrianMarcano1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Escribe un número cualquiera: ");
		
		double numero = s.nextDouble();
		double divisor = 1;
		double total =0;
		while(divisor<numero)
		{
			
			if(numero%divisor==0) {total = total +divisor;}
			divisor++;
			
		}
		
		if (total == numero) {System.out.println("El número "+numero+" es perfecto");}
		else {System.out.println("El número "+numero+" no es perfecto");}
		
		
		
	}

}
