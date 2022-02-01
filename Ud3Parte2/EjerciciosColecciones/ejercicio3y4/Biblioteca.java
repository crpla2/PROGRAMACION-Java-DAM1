package ejercicio3y4;
import java.util.Scanner;

public class Biblioteca {
	private static int MAX = 15;
	private int cont = 0; // primera posicion libre
	private Libro _array[];

	public Biblioteca() {
		_array = new Libro[MAX];
	}

	public boolean insertarOrden(Libro p) {
		if (cont == MAX)
			return false;
		int i = 0;
		boolean encontrado = false;
		while ((i < cont) && (!encontrado)) {
			encontrado = (_array[i].dameTitulo().compareToIgnoreCase(p.dameTitulo())) > 0;
			if (!encontrado)
				i++;
		}
		for (int j = cont - 1; j >= i; j--)
			_array[j + 1] = _array[j];
		_array[i] = p;
		cont++;
		return true;
	}

	public boolean Eliminar(int n) {

		if ((n < 1) || (n > cont) || (cont == 0))
			return false;
		for (int i = n; i < cont; i++)
			_array[i - 1] = _array[i];
		cont--;
		return true;

	}

	public boolean Llena() {
		return cont == MAX;
	}

	public int tamanyo() {
		return cont;
	}

	public boolean Vacia() {
		return cont == 0;
	}

	public Libro getLibro(int i) {
		if (i < 1 || i > cont)
			return null;
		return _array[i - 1];
	}

	public int buscar(String busqueda) {
	//	Scanner s = new Scanner(System.in);
	//	System.out.print("Introducir el titulo del libro:\n");
	//	String busqueda = s.nextLine();
		for (int i = 0; i < cont; i++) {
			if (_array[i].dameTitulo().toUpperCase().contains(busqueda.toUpperCase())) {
				return i + 1;
			}
		}
		return -1;

	}

	public String buscarTodos(String busqueda) {
	//	Scanner s = new Scanner(System.in);
	//	System.out.print("Introducir el titulo del libro:\n");
	//	String busqueda = s.nextLine();
		String cadena = "";
		for (int i = 0; i < cont; i++) {
			if (_array[i].dameTitulo().toUpperCase().contains(busqueda.toUpperCase())) {
				cadena = cadena + _array[i].dameTitulo() + "--" + _array[i].dameAutor().nombreCompleto() + "\n";
			} // del if
		} // del for
		return cadena;

	}

	@Override
	public String toString() {
		String cad = "Lista de libros :\n\n";
		for (int i = 0; i < cont; i++)
			cad = cad + _array[i].dameIsbn() + "--" + _array[i].dameTitulo() + "--"
					+ _array[i].dameAutor().nombreCompleto() + "--" + _array[i].damePaginas() + "\n";
		return cad;
	}

}
