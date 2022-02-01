package ejerciciosOrdenacion;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio01 {

	static int contador = 0;
	static int n = 20;

	public static void main(String[] args) {

		int[] num = new int[n];
		int resultado;
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca un numero por teclado");
		int valorbuscado = s.nextInt();
		rellenarAleatorio(num);
		Arrays.sort(num);
		imprime(num);
		System.out.println(" ");
		resultado = busquedaBinaria(num, valorbuscado);
		if (resultado != -1)
			System.out.println("El numero " + valorbuscado + " apareció y ocupa la posicion " + resultado
					+ " (comenzando en la 0)");
		else
			System.out.println("El numero " + valorbuscado + " no salió premiado ");
		System.out.println("se han necesitado " + contador + " intentos para resolverlo");
	}
	public static void rellenarAleatorio(int[] num) {
		for (int i = 0; i < n; i++) {
			num[i] = ((int) (Math.random() * 100));
		}
	}
	public static void imprime(int[] num) {
		for (int i = 0; i < n; i++) {
			System.out.print(num[i] + " ");
		}
	}
	public static int busquedaBinaria(int[] num, int valorbuscado) {
		int izquierda = 0, derecha = num.length - 1, centro;
		while (izquierda <= derecha) {
			contador++;
			centro = (derecha - izquierda) / 2 + izquierda;
			if (num[centro] == valorbuscado)
				return centro;
			if (valorbuscado < num[centro])
				derecha = centro - 1;
			else
				izquierda = centro + 1;
		}
		return -1;
	}
}
