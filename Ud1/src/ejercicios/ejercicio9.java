package ejercicios;
import java.util.Scanner;
public class ejercicio9 {

	public static void main(String[] args) {
		
		System.out.println("introduzca grados Farenheit:");
		Scanner n =new Scanner(System.in);

		double g1 = n.nextDouble();
		double g2= ((5.0/9)*(g1-32));
		
		System.out.println(g2+"Cº");
		
		
		
	}

}
