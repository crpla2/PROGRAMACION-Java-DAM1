package p131_ejercicios1y2;

import java.util.Arrays;

public class MainGato2 {

	public static void main(String[] args) {
		Gato[] listaGatos = new Gato[4];
		listaGatos[1]=new Gato();
		listaGatos [1].setEdad(2);
		listaGatos [1].setNombre("Garfield");
		listaGatos [1].setRaza("rayado");
		listaGatos [1].setSexo("macho");
		listaGatos [0]=new Gato("Mizifuz","siames","macho",4);
		listaGatos [2]=new Gato("Simona","siames","hembra",2);
		listaGatos [3]=new Gato("Gateta","siames","hembra",3);
		
		System.out.println("hay "+listaGatos.length+" gatos en la lista");
//		Arrays.sort(listaGatos,new NombreComparator());
		Arrays.sort(listaGatos,new edadComparator());
		for (int i = 0; i < 4; i++) {
			System.out.println(listaGatos[i]);

		}


	}

}
