package colecciones_I;

public class CD {
	private final static int MAX = 100;
	private int contador;
	private Cancion canciones[];

	public CD() {
		canciones = new Cancion[MAX];
		contador = 0;
	}

	public int numeroCanciones() {
		return contador;
	}

	public boolean agregaCancion(Cancion c) {
		if (contador == MAX)
			return false;
		canciones[contador] = c;
		contador++;
		return true;
	}

	public Cancion dameCancion(int posicion) {
		if (posicion < 1 || posicion > contador)
			return null;
		return canciones[posicion - 1];
	}

	public boolean grabaCancion(int posicion, Cancion c) {
		if (posicion < 1 || posicion > contador) {
			return false;
		}
		canciones[posicion - 1] = c;
		return true;
	}

	public boolean eliminaCancion(int posicion) {
		if (posicion < 1 || posicion > contador) {
			return false;
		}
		for (int i = posicion; i < contador; i++)
			canciones[i - 1] = canciones[i];
		contador--;
		return true;
	}

	@Override
	public String toString() {
		String cadena = "";
		for (int i = 0; i < contador; i++)
			cadena = cadena + canciones[i] + "\n";
		return cadena;
	}
	/* ****Utilzando el FOREACH****

	@Override
	public String toString() {
		String cadena = "";
		for (Cancion c : canciones)
			cadena = cadena + c + "\n";
		return cadena;
	} */

}
