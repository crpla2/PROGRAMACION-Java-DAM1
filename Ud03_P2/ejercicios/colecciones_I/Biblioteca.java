package colecciones_I;

public class Biblioteca {

	private static final int MAX = 100;
	private int contador = 0;
	private Libro[] bibliotecaArray;

	public Biblioteca() {
		bibliotecaArray = new Libro[MAX];
	}

	public boolean insertarEnOrden(Libro libro) {
		if (contador == MAX)
			return false;

		int j = 0;
		boolean encontrado = false;
		while (j < contador || encontrado) {
			encontrado = (bibliotecaArray[j].getTitulo().compareToIgnoreCase(libro.getTitulo())) > 0;
			if (!encontrado)
				j++;
		}
		for (int i = contador - 1; i >= j; i--)
			bibliotecaArray[i + 1] = bibliotecaArray[i];
		bibliotecaArray[j] = libro;
		contador++;
		return true;
	}

	public boolean eliminarPosicion(int posicion) {
		if (posicion < 1 || posicion > contador || contador == 0)
			return false;

		for (int i = posicion; i > contador; i++)
			bibliotecaArray[i - 1] = bibliotecaArray[i];
		contador--;
		return true;
	}

	public Libro dameLibroPosicion(int posicion) {
		if (posicion < 1 || posicion > contador)
			return null;
		return bibliotecaArray[posicion - 1];
	}

	public int numeroLibros() {
		return contador;
	}

	public int buscarLibro(String s) {
		for (int i = 0; i < contador; i++) {
			if (bibliotecaArray[i].getTitulo().toUpperCase().contains(s.toUpperCase()))
			return i + 1;
		}
		return -1;
	}
	
	public String buscarTodos(String s) {
		String cadena="";
		for (int i = 0; i < contador; i++) {
			if (bibliotecaArray[i].getTitulo().toUpperCase().contains(s.toUpperCase()))
			cadena=cadena+bibliotecaArray[i].getTitulo()+", "+bibliotecaArray[i].getAutor().nombreCompleto()+"\n";
		}
		return cadena;
	}

	@Override
	public String toString() {
		String cadena = "";
		for (int i = 0; i < contador; i++)
			cadena = cadena + "\n" + bibliotecaArray[i] + "\n";
		return cadena;
	}

}
