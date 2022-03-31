package Ejercicios09;

import java.util.ArrayList;

import Ejercicios07.Disco;
import Ejercicios08.Biblioteca;
import Ejercicios08.Libro;

public class Main {

	public static void main(String[] args) {
	ArrayList<Disco> discoteca= new ArrayList<Disco>();
	DiscoPrestable d1=new DiscoPrestable("Dookie", "Greenday", "mp3", 90, "rock", false);
	discoteca.add(d1);
	DiscoPrestable d2=new DiscoPrestable("Nevermind", "Nirvana", "mp3", 98, "rock", false);
	discoteca.add(d2);
	DiscoPrestable d3=new DiscoPrestable("Agila", "Extremoduro", "mp3", 80, "rock", false);
	discoteca.add(d3);
	
	d1.prestar();
	d2.prestar();
	System.out.println(cuentaPrestados(discoteca));
	
	}

	public static int cuentaPrestados(ArrayList<Disco> p) {
		int prestados=0;
		for (Disco b: p)
			if (b instanceof DiscoPrestable)
				if(((DiscoPrestable) b).prestado())
					prestados++;
		return prestados;
	}

}
