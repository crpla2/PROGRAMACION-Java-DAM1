package colecciones_I_ejercicios3y4;

public class ListaLibros {
	private  final static int MAX=100;
	private Libro lista[];
	private int contador;
	
	public ListaLibros() {
		lista= new Libro[MAX];
		contador=0;
	}

	public int tamanyo() {
		return contador;
	}
	
	public boolean listaLlena() {
		return contador==MAX;
	}
	
	public boolean listaVacia() {
		return contador==0;
	}
	
	public int buscaLibro(String cadena) {
		for(int i=0; i<contador;i++) {
			if(lista[i].getTitulo().toLowerCase().contains(cadena.toLowerCase())) 
				return i+1;}
			return -1;	
	}
	
	public boolean buscaLibro2(Libro libro) {
		for(int i=0; i<contador;i++) {
			if(lista[i].getTitulo().toLowerCase().contains(libro.getTitulo().toLowerCase())) 
				return true;}
			return false;}
	
	public boolean insertarLibro(Libro libro) {
		if (contador==MAX||buscaLibro2(libro)==true)
			return false;
		else {
			int posicion=0;
			for(int i=0; i<contador;i++) {
				if(lista[i].getTitulo().compareToIgnoreCase(libro.getTitulo())>0) {
					posicion=i;
					break;}
				else
				posicion=i+1;
			}
			for(int j=contador-1;j>=posicion;j--)
				lista[j+1]=lista[j];
		lista[posicion]=libro;
		contador++;
		return true;
		}
	}
	
	public boolean eliminarPorPosicion(int posicion) {
		if (posicion>contador||posicion<1)
			return false;
		for (int i=posicion;i<contador;i++)
			lista[i-1]=lista[i];
		contador--;
		return true;
	}
	
	public Libro obtenerPorPosicion(int posicion) {
		if(posicion<0||posicion>MAX)
			return null;
		return lista[posicion-1];
		
	}

	@Override
	public String toString() {
		String cadena="";
		for(int i =0;i<contador;i++)
			cadena+="***********\n"+lista[i]+"\n\n";
		return cadena;
	}



			
		
	
	
	
}


