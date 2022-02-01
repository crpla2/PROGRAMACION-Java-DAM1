package colecciones_I_ejercicios1y2;

public class CD {
	private final static int MAX=100;
	private Cancion canciones[];
	private int contador;
	
	public CD() {
		canciones = new Cancion[MAX];
		contador=0;
	}
	
	public int numeroCanciones() {
		return contador;
	}

	public Cancion dameCancion(int posicion) {
		if (posicion>contador||posicion<1||contador<1)
			return null;
		return canciones[posicion-1];
	}
	
	public boolean grabaCancion(int posicion, Cancion cancion) {
		if (posicion>contador||posicion<1)
			return false;
		else {
			canciones[posicion-1]=cancion;
			return true;
		}
	}
	
	public boolean agregaCancion(Cancion cancion) {
		if (contador<MAX) {
			canciones[contador]=cancion;
			contador++;
			return true;
		}
		return false;
	}
	
	public boolean eliminaCancion(int posicion) {
		if (posicion>contador||posicion<1)
			return false;
		else {
			for(int i=posicion;i<contador;i++) 
				canciones[i-1]=canciones[i];
				contador--;
				return true;
			}
		}

	@Override
	public String toString() {
		String cadena="";
		for(int i=0;i<contador;i++)
			cadena=cadena+canciones[i]+"\n";
		return cadena;
	}
		
	
}
