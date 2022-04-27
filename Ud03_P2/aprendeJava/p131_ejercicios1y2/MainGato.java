package p131_ejercicios1y2;

import java.util.Scanner;

public class MainGato {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Gato[] listaGatos = new Gato[4];

		for (int i = 0; i < 4; i++) {
			listaGatos[i] = new Gato();
			System.out.print("Introduzca el nombre del gato "+(i+1)+": ");
			
			listaGatos[i].setNombre(s.next());
			System.out.print("Introduzca la edad: ");
			int e = s.nextInt();
			listaGatos[i].setEdad(e);
			System.out.print("Introduzca la raza: ");
			String r = s.next();
			listaGatos[i].setRaza(r);
			System.out.print("Introduzca el sexo: ");
			String z = s.next();
			listaGatos[i].setSexo(z);
		}

		for (int i = 0; i < 4; i++) {
			System.out.println(listaGatos[i]);

		}

	}

}
