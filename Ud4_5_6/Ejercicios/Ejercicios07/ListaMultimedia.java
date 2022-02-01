package Ejercicios07;

import java.util.ArrayList;

public class ListaMultimedia {
	private ArrayList<Multimedia> lista;

	public ListaMultimedia() {

		lista = new ArrayList<Multimedia>();
	}

	public boolean agrega(Multimedia m) {
		return lista.add(m);
	}

	public void imprimeLista() {
		for (Multimedia m : lista)
			System.out.println(m + "\n");
	}

	public double duracionTotal() {
		double total = 0;
		for (Multimedia m : lista)
			total += m.getDuracion();
		return total;
	}

	public int genero(String genero) {
		int total = 0;
		for (Multimedia m : lista)
			if (m instanceof Disco)
				if (((Disco) m).getGenero().toLowerCase().contains(genero))
					total++;

		return total;

	}

	public int actrizActor(String a) {
		int total = 0, fallo = 0;
		try {
			if ((a.equalsIgnoreCase("actor")) || (a.equalsIgnoreCase("actriz"))) {
				if (a.equalsIgnoreCase("actor"))
					for (Multimedia m : lista)
						if (m instanceof Pelicula)
							if (((Pelicula) m).getActorPrincipal() != null)
								total++;
				if (a.equalsIgnoreCase("actriz"))
					for (Multimedia m : lista)
						if (m instanceof Pelicula)
							if (((Pelicula) m).getActrizPrincipal() != null)
								total++;
			} else
				throw new IllegalArgumentException();

		} catch (IllegalArgumentException e) {
			System.out.print("Debe de elegir entre actor o actriz para que la busqueda sea válida  ");
			fallo++;
		}
		if (fallo == 0)
			return total;
		return -1;
	}

	public int actrizNull() {
		int total = 0;
		for (Multimedia m : lista)
			if (m instanceof Pelicula)
				if (((Pelicula) m).getActrizPrincipal() == null)
					total++;
		return total;
	}

}
