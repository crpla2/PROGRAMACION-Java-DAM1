package Ejercicios08;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Biblioteca> prestados= new ArrayList<Biblioteca>();
		Biblioteca l1=new Libro("1234", "La Biblia", 0, false);
		Biblioteca l2= new Libro("2345","El Quijote", 1700, false);
		Biblioteca r1= new Revista("3456", "Muy interesante", 2010, 45);
		Biblioteca r2= new Revista("4567","Cañamo",	2020,12);
		prestados.add(l1);
		prestados.add(l2);
		prestados.add(r1);
		prestados.add(r2);
		((Libro) l1).prestar();//Crándolo como Libro no haría falta castearlo
		System.out.println(prestados);
		System.out.println(cuentaPrestados(prestados));
		System.out.println(publicacionesAnteriores(prestados, 1980));
		
		
	}

	public static int cuentaPrestados(ArrayList<Biblioteca> p) {
		int prestados=0;
		for (Biblioteca b: p)
			if (b instanceof Libro)
				if(((Libro) b).prestado())
					prestados++;
		return prestados;
	}
	
	public static int publicacionesAnteriores(ArrayList<Biblioteca> p, int año) {
		int cuenta=0;
		for(Biblioteca b: p)
			if(b.getAño()<año)
				cuenta++;
		return cuenta;
	}
}
