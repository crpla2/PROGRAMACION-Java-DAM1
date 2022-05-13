package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
			
		visualizar(leer());
	}

	private static int[] leer() {
		Scanner s=new Scanner(System.in);
		int[]numeros=new int[5];
		for(int i=0;i<numeros.length;i++) {
		System.out.println("numero: ");
			numeros[i]=s.nextInt();
		}
		return numeros;
	}

	private static void visualizar(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			if (nums[i]==maximo(nums))
				System.out.print(nums[i]+" max, ");
			if (nums[i]==minimo(nums))
				System.out.print(nums[i]+" min, ");
			else
				System.out.print(nums[i]+", ");
		}
		
	}

	private static int minimo(int[] num) {
		int minimo=maximo(num);
		for(int i=0;i<num.length;i++) {
			if(num[i]<minimo)
				minimo=num[i];
		}
		return minimo;
		// TODO Auto-generated method stub
		
	}

	private static int maximo(int[] num) {
		int maximo=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>maximo)
				maximo=num[i];
		}
		return maximo;
		// TODO Auto-generated method stub
		
	}

}
