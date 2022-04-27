package ejercicio1y2;

public class CD {
	private final static int MAX = 15;
	private Cancion [] canciones;
	private int contador;
//
	public CD() {
		canciones = new Cancion[MAX];
		contador=0;
	}
	
	public int numeroCanciones() {
		return contador;
	}
	
	public boolean agregarCancion (Cancion c) {
		if (contador==MAX)
			return false;
		canciones[contador]=c;
		contador++;
		return true;
	}
	
	public Cancion dameCancion(int posicion) {
		if (posicion < 1 || posicion > contador)
			return null;
			
		return canciones[posicion-1];
	}
	
	public boolean grabaCancion (int pos, Cancion c) {
		if (pos < 1 || pos > contador)
			return false;
		canciones[pos-1]=c;
		return true;
	}
	
	public boolean eliminaCancion(int pos) {
		if (pos < 1 || pos > contador)
			return false;
		for(int i=pos;i<contador;i++)
			canciones[i-1]=canciones[i];
			contador--;
		return true;
	}


/*	@Override
	public String toString() {
		String cadena="";
		for(Cancion c:canciones)
			cadena=cadena+c+"\n";
		return cadena;
	}
*/	
	public String toString() {
		String cadena="";
		for(int i=0;i<contador;i++)
			cadena=cadena+canciones[i]+"\n";
		return cadena;
	}

}// de la clase CD
