package Ejercicios2;

import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] nums= new int[10];
		for (int i=0;i<nums.length;i++)
		{System.out.println("Introduzca un numero");
		nums[i]=s.nextInt();
		}
		
		inverso(nums);
		
		
	}

	private static void inverso(int[] nums) {
		for (int i= nums.length;i>=0;i--)
			System.out.print(nums[i]+"-");
		
	}

}
