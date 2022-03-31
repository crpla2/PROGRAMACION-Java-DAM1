package Colecciones_I_ejercicios;

public class ListaLibro {
	
	private final static int MAX=100;
	private Libro [] array;
	private int cont;
	
	public ListaLibro() {
		array= new Libro[MAX];
		cont = 0;
	}
	public boolean Llena() {
		return cont==MAX;
	}
	public boolean Vacia() {
		return cont==0;
	}
	public int numeroLibros() {
		return cont;
	}
	public Libro dameLibro(int pos) {
		if(pos<1||pos>cont)
			return null;
		return array[pos-1];
	}
	public boolean eliminaLibro(int pos) {
		if(pos<1||pos>cont)
			return false;
		for (int i=pos-1; i<cont; i++) 
			array[i]=array[i+1];
		cont--;
		return true;
	}
	public Libro[] FiltroLibro(String titulo) {
		int contador=0;
		for (int i=0;i<cont;i++) {
			if(array[i].getTitulo().contains(titulo))
				contador++;
		}
		Libro[] encontrados= new Libro[contador];
		int j=0;
		for (int i=0;i<cont;i++) {
			if(array[i].getTitulo().contains(titulo)) {
				encontrados[j]=array[i];
				j++;
			}	
		}
		return encontrados;
	}
	public int PosiconLibro(String titulo) {
		for (int i = 0; i < cont; i++) {
			if(array[i].getTitulo().equals(titulo))
				return i+1;
		}
		return -1;
	}
	
	public boolean añadirLibro(Libro l) {
		if(cont<MAX) {
		int pos=0;
		boolean encontrado=false;
		while(pos<cont&& !encontrado) {
			encontrado=(array[pos].getTitulo().compareToIgnoreCase(l.getTitulo())>0);
			if(!encontrado)
				pos++;
		}
		for(int i= cont-1;i>=pos;i--) {
			array[i+1]=array[i];
		}
		array[pos]=l;
		cont++;
		return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String cadena="";
		for (int i=0;i<cont;i++) {
			cadena+= array[i];
		}
		return cadena;
	}
	
}
