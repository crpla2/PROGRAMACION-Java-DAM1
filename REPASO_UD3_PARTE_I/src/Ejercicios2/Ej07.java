package Ejercicios2;

public class Ej07 {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] rotada = new int[num.length];
		for (int i = 1; i < num.length; i++) {
			rotada[i] = num[i -1];
		}
		rotada[0] = num[num.length-1];

		for (int i = 0; i < num.length ; i++) {
			System.out.print(rotada[i]);
		}
	}
}