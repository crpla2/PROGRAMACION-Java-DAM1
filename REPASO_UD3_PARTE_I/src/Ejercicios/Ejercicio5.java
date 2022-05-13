package Ejercicios;

public class Ejercicio5 {

	public static void main(String[] args) {
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];

		for (int i = 0; i < 20; i++) {
			numero[i] = (int) (Math.random() * 100);
			cuadrado[i] = (int)( Math.pow(numero[i],2));
			cubo[i]=(int) (Math.pow(numero[i],3));
			System.out.println("numero: "+numero[i]+
					" cuadrado: "+cuadrado[i]+" cubo: "+cubo[i]);
		}
	
		
	}

}
