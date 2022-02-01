package _02colecciones1;

public class CD {

	private static final int MAX=20;
	private Cancion [] canciones;
	private int contador;
	
	public CD(){
		this.canciones=new Cancion [MAX];
		contador=0;
	}
	
	public int numeroCanciones() {
		return contador;
	}
	
	public boolean agregaCancion(Cancion cancion) {
		if(contador==MAX) {
			return false;
		}
		canciones[contador]=cancion;
		contador++;
		return true;
	}
	
	public Cancion dameCancion(int posicion) {
		if(posicion<1 || posicion > contador) {
			//System.out.print("El resultado de la búsqueda es : ");
			return null;
		}
		return canciones[posicion-1];
	}
	
	public boolean grabaCancion(int posicion, Cancion cancion) {
		if(posicion<1 || posicion > contador) {
			//System.out.print("El resultado de grabar la canción ha sido : ");
			return false;
		}
		canciones[posicion-1]=cancion;
		return true;
	}
	
	public boolean eliminaCancion(int posicion) {
		
		if(posicion<1 || posicion > contador) {
			//System.out.print("El resultado de eliminar la canción ha sido : ");
			return false;
		}
		
		for(int i=posicion;i<contador;i++) {
			canciones[i-1]=canciones[i];
		}
		contador--;
		return true;
	}
	
	public String toString() {
		String cadena="";
		for(int i=0;i<contador;i++) {
			cadena=cadena + "CANCION " + (i+1) + "ª: "+ canciones[i] + "\n";
		}
		return cadena;
	}
}
