package _02colecciones1;

public class Biblioteca {

	private static final int MAX=15;
	
	private Libro [] lista;
	private int contador;
	
	//Constructor...
	
	public Biblioteca() {
		lista = new Libro [MAX];
		contador = 0;
	}
	
	//Mis Métodos...
	
	public int numeroLibros() {
		return contador;
	}
	
	public boolean insertarLibro(Libro libroNuevo) {
		if (contador==MAX) 
			return false;
		int posicion=0;
		for(int i=0;i<contador;i++) {
			if(libroNuevo.getTitulo().toUpperCase().compareTo(lista[i].getTitulo().toUpperCase())<0) {
				posicion=i;
				break;
			}
			posicion=i+1;
		}
		for(int j=contador-1;j>=posicion;j--) {
			lista[j+1]=lista[j];
		}
		lista[posicion]=libroNuevo;
		contador++;
		return true;
	}
	
	public boolean eliminarLibro(int posicion) {
		if(posicion<1||posicion>contador)
			return false;
		for(int i=posicion;i<contador;i++) {
			lista[posicion-1]=lista[posicion];
		}
		contador--;
		return true;
	}
	
	public Libro obtenerLibro(int posicion) {
		if(posicion<1||posicion>contador)
			return null;
		return lista[posicion-1];
	}
	
	public int buscarLibroporTitulo(String clave) {
		for(int i=0;i<contador;i++) {
			
			if (lista[i].getTitulo().toLowerCase().contains(clave.toLowerCase())) {
				return i+1;
			}
		}
		return -1;
	}

	public String toString() {
		String cadena = "Lista de libros :\n\n";
		for (int i = 0; i < contador; i++)
			cadena = cadena + lista[i].getISBN() + "--" + lista[i].getTitulo() + "--"
					+ lista[i].getAutor().nombreCompleto() + "--" + lista[i].getPaginas() + "\n";
		return cadena;
	}
	
	
}
