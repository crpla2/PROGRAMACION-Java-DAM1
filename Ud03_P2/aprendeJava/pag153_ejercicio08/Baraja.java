package pag153_ejercicio08;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
	private ArrayList<Carta> baraja;

	public Baraja() {
		baraja=new ArrayList<Carta>();
		llenar();
	}

	public void llenar() {
		int numero = 0;
		String palo = "";
		for (int i = 1; i < 5; i++) {
			if (i == 1)
				palo = "Oros";
			if (i == 2)
				palo = "Copas";
			if (i == 3)
				palo = "Espadas";
			if (i == 4)
				palo = "Bastos";
			while (numero < 12) {
				numero++;
				if(numero<8||numero>9)
					baraja.add(new Carta( numero, palo));
			}
			numero = 0;
		}
	}
	public void azar() {
		ArrayList<Carta> azar = new ArrayList<Carta>();

		for (int i = 0; i < 10; i++) {
			int az = (int) ((Math.random() * 40) + 1);
			int cont = 0;
			for (Carta c : baraja) {
				cont++;
				if (cont == az) {
					if (azar.contains(c))
						;
					else {
						azar.add(c);
					}
				}
			}
		}
	azar.sort(new CArtasComparator());
		for (Carta v : azar)
			System.out.println(v);

	}
	public void imprime() {
		for(Carta c:baraja)
			System.out.println(c);
	}
	
		
	
}