package buscaminas;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class buscaminas {
	private TreeMap<Integer, Integer> tableroMinado;
	private ArrayList<Integer> destapadas;
	private TreeMap<Integer, Integer>destapadasKey;
	int casillas;
	int numMinas;
	int posicion;
	int filasTablero;

	public buscaminas(int casillas, int numMinas, int posicion, int filasTablero) {
		super();
		this.casillas = casillas;
		this.numMinas = numMinas;
		this.posicion = posicion;
		this.filasTablero = filasTablero;
		tableroMinado = new TreeMap<>();
		destapadas = new ArrayList<>();
		destapadasKey= new TreeMap<>();
	}

	public  TreeMap<Integer, Integer> descubreCasillas(int posicion, int filasTablero) {
		
		int contador = 0;
		if (!tieneMina(posicion)) {
			destapadas.add(posicion);
			for (int casilla : casillasAdyacentes(posicion, filasTablero)) {
				
				if (tieneMina(casilla))
					contador++;
				if (destapadas.contains(casilla))break;
				else {
					descubreCasillas(casilla, filasTablero);
				}
			}
			System.out.println(posicion+"-"+contador);
			destapadasKey.put(posicion, contador);
		}
		return destapadasKey;
	}

	public  boolean tieneMina(int posicion) {
		boolean resultado = false;
		if (tableroMinado.get(posicion) == 1)
			return true;
		return resultado;
	}

	/**
	 * Función que calcula la posicion de las casillas adyacentes a una posición
	 * dada
	 * 
	 * @param posicion (int) la posición de la que buscamos las casillas que le
	 *                 rodean.
	 * @param filas    (int) número de filas que tiene la cuadricula (debe de ser
	 *                 cuadrada; filas=columnas)
	 * @return (int[]) devuelve un array de enteros que son la posición de las
	 *         casillas que rodean a la posición pasada por parametro.
	 */
	public int[] casillasAdyacentes(int posicion, int filas) {
		// si la posicion se encuentra en la columna de la izquierda(excepto el primer y
		// el ultimo registro)=>filaIzquierda=true;
		boolean filaIzquierda = false;
		for (int i = 1; i <= filas - 2; i++)
			if (posicion == i * filas + 1)
				filaIzquierda = true;
		// primera fila exceptuando la primra y la ultima posición
		if (posicion < filas && posicion > 1) {
			int adyacentes[] = { posicion - 1, posicion + 1, posicion + (filas - 1), posicion + filas,
					posicion + (filas + 1) };
			return adyacentes;
			// primera posición de la cuadricula
		} else if (posicion == 1) {
			int adyacentes[] = { posicion + 1, posicion + filas, posicion + (filas + 1) };
			return adyacentes;
			// última posición de la primera fila
		} else if (posicion == filas) {
			int adyacentes[] = { posicion - 1, posicion + (filas - 1), posicion + filas };
			return adyacentes;
			// última columna exceptuando la primera y la última posición
		} else if (posicion % filas == 0 && posicion != filas && posicion != (filas * filas)) {
			int adyacentes[] = { posicion - (filas + 1), posicion - filas, posicion - 1, posicion + (filas - 1),
					posicion + filas };
			return adyacentes;
			// última posición de la cuadricula
		} else if (posicion == (filas * filas)) {
			int adyacentes[] = { posicion - (filas + 1), posicion - filas, posicion - 1 };
			return adyacentes;
			// última fila exceptuando la primera y la última posición.
		} else if (posicion > ((filas * filas) - (filas - 1)) && posicion < (filas * filas)) {
			int adyacentes[] = { posicion - (filas + 1), posicion - filas, posicion - (filas - 1), posicion - 1,
					posicion + 1 };
			return adyacentes;
			// última posición de la primera columna
		} else if (posicion == ((filas * filas) - (filas - 1))) {
			int adyacentes[] = { posicion - filas, posicion - (filas - 1), posicion + 1 };
			return adyacentes;
			// primera columna
		} else if (filaIzquierda) {
			int adyacentes[] = { posicion - filas, posicion - (filas - 1), posicion + 1, posicion + filas,
					posicion + (filas + 1) };
			return adyacentes;
		}
		// cualquier posición exceptuando las del perimetro.
		int adyacentes[] = { posicion - (filas + 1), posicion - filas, posicion - (filas - 1), posicion - 1,
				posicion + 1, posicion + (filas - 1), posicion + filas, posicion + (filas + 1) };
		return adyacentes;

	}

	/**
	 * Función que genera un mapa cuyas claves serán las posiciónes en el tablero y
	 * los valores, serán 0 si no tienen una mina asociada o 1 si sí que la tienen.
	 * 
	 * @param casillas (int) número total de casilla que tiene el tablero
	 * @param numMinas (int) número total de minas que habra escondidas en el
	 *                 tablero
	 * @return (TreeMap) mapa con las posiciones y las minas asociadas.
	 */
	public TreeMap generaTablero(int casillas, int numMinas) {
		int minado = 0;
		int tablero[] = new int[casillas];
		TreeSet<Integer> minas = new TreeSet<>();
		tableroMinado = new TreeMap<>();
		// Se llena el array tablero con numeros del 1 a n (numero total de casillas).
		for (int i = 0; i < tablero.length; i++) {
			tablero[i] = i + 1;
		}
		// Se generan n(numMinas) minas.
		while (minas.size() < numMinas)
			minas.add((int) (Math.random() * casillas + 1));
		// Se rellena el TreeMap
		for (int i = 0; i < tablero.length; i++) {
			for (int m : minas) {
				if (m == tablero[i])
					minado = 1;
			}
			tableroMinado.put(tablero[i], minado);
			minado = 0;
		}
		return tableroMinado;
	}
}
