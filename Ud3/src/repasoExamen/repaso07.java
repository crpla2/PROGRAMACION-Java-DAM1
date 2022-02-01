package repasoExamen;

import java.util.Scanner;

public class repaso07 {

	public static void main(String[] args) {
		boolean capicua=true;
		Scanner s= new Scanner(System.in);
		System.out.println("introduce una palabra");
		String palabra=s.nextLine();
		
		int v[]= new int[palabra.length()];
		int v2[]= new int[palabra.length()/2];
	
		for (int i=0;i<palabra.length();i++) {
			v[i]=palabra.charAt(i);
		}
		for (int i=0;i<palabra.length()/2;i++) {
			v2[i]=v[i];
		}	
		
		for (int i=0;i<palabra.length()/2;i++) {
			int x=(palabra.length()-1)-i;
			if(v[x]!=v2[i]) {
			capicua=false;
			break;}
			else
				capicua=true;
		}
		System.out.println(capicua);
	}
}