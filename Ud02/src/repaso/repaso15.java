package repaso;

import java.util.Scanner;

public class repaso15 {

	public static void main(String[] args) {


		System.out.println("los 100 primeros primos son:");
		int a, contador;
	boolean primo;
		contador=0;
		
		a=1;
		while (contador<100) {
		primo=true;
		for (int i = 2; i <= a/2; i++) { 
			
			if(a%i==0) {
				primo = false;
				break;
			}//if
		}//for
			
		if (primo) {
			System.out.print(a + "-");
			contador++;
		}//if
		a++;
	}//while
}}