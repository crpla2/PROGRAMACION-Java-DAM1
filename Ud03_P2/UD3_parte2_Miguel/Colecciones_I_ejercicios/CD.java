package Colecciones_I_ejercicios;

public class CD {
	private final static int MAX=100;
	private Cancion array[];
	private int cont;
	
	//constructores
	public CD(){
		array= new Cancion[MAX];
		cont=0;
	}
	
	public int numeroCanciones() { return cont; }
	
	public Cancion dameCancion(int pos) {
		if(pos<1||pos>cont||cont<1)
			return null;
		return array[pos-1];
	}
	public boolean grabaCancion(Cancion c,int pos) {
		if(pos<1||pos>cont)
			return false;
		else {
			array[pos-1]=c;
			return true;
		}
	}
	public boolean agregaCancion(Cancion c) {
		if(cont<MAX) {
			array[cont]=c;
			cont++;
			return true;
		}
		else
			return false;
	}
	public boolean eliminaCancion(int pos) {
		if(pos-1>=0&&pos-1<cont) {
			for (int i = pos-1; i < cont; i++) 
				array[pos-1]=array[pos];
			cont--;
			return true;
		}else
			return false;
	}

	@Override
	public String toString() {
		String cad= "ELEMENTOS DE LA LISTA:\n";
		for (int i = 0; i < cont; i++) {
			cad += array[i].toString()+"\n";
		}
		return cad;
	}
	
}
