package ejerciciosOrdenacion;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio02 {

	static int contador = 0;
	static int n = 20;
	public static void main(String[] args) {
		
		
		int[] num = new int[n];
		
		
		rellenarAleatorio(num);
		System.out.println(" ");
		burbuja(num);
		imprime(num);
		System.out.println(" ");
		
	}
	public static void rellenarAleatorio(int[] num) {
		for (int i = 0; i < n; i++) {
			num[i] = ((int) (Math.random() * 100));
			System.out.print(num[i] + " ");
		}
	}
	public static void imprime(int[] num) {
		for (int i = 0; i < n; i++) {
			System.out.print(num[i] + " ");
		}
	}
		public static void burbuja(int[]matrix){
	        int temp;
	        for(int i=1;i < matrix.length;i++){
	            for (int j=matrix.length-1 ; j >0; j--){
	                if (matrix[j] > matrix[j-1]){
	                    temp = matrix[j];
	                    matrix[j] = matrix[j-1];
	                    matrix[j-1] = temp;
	                }
	            }
	        }
	    }

	}


