package ejercicios;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("Cantidad prestada: ");
		double x= s.nextDouble();
		System.out.println("Interés anual: ");
		double y= s.nextDouble();
		System.out.println("Duracion del prestamo en años: ");
		int z= s.nextInt();
		double intMes=y/100/12;
		double pagoMes=((x*intMes)/(1-(1/(double)(Math.pow((1+intMes),(z*12))))));
		System.out.println("RESULTADO DE LA OPERACION:  ");
		System.out.println("Cantidad prestada:  " + x+"Euros");
		System.out.println("Interés anual: "+ y +"%");
		System.out.println("Duración en años del préstamo " + z);
		System.out.println("Número de pagos: " + (z*12) );
		System.out.printf("Pago mensual: %.2f \n", pagoMes );
		System.out.printf("Cantidad total a pagar: %.2f Euros  ", (pagoMes*(z*12)));
	
		
	}

}
