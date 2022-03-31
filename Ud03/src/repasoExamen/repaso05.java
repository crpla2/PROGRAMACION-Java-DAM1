package repasoExamen;

import java.util.Scanner;

public class repaso05 {

	public static void main(String[] args) {
		int x=3;
		String n[]= new String[x];
		int sueldo[]=new int[x];
		rellenar(n,sueldo);
//		rico(sueldo,maximo(sueldo));
		}
		public static void rellenar (String a[], int b[]) {
			Scanner s=new Scanner(System.in);
			for(int i=0;i<b.length;i++) {
				System.out.println("nombre: ");
				a[i]=s.next();
				System.out.println("sueldo: ");
				b[i]=s.nextInt();
				
			}
		}
		public static int maximo(int b[]) {
			int max=b[0];
			for (int i =0; i<b.length;i++) {
				if(b[i]>max)
				max=b[i];
			}return max;
		}
		public static void rico(String a[],int b[]) {
			for(int i=0;i<b.length;i++) {
				if (b[i]==maximo(b))
					System.out.println("+ rico: "+a[i]+"gana"+b[i]);
			}}

	
}


