package repaso_vectores;

public class ejercicio06 {

	public static void main(String[] args) {
		int numero = 20;
		String a = "aleatorios", p = "primos";
		int vector[] = new int[numero];
		int primos[] = new int[numero];
		boolean esPrimo = false;
		rellenarAleatorio(vector);
		for (int i = 0; i < vector.length; i++) {
			int x = vector[i];
			for (int j = 2; j < x / 2; j++) {
				if (x % j == 0) {
					esPrimo = false;
					break;
				} else
					esPrimo = true;
			}

			if (esPrimo) {
				primos[i] = x;
			}
		}
		imprime(vector, a);
		System.out.println("");
		imprime(primos, p);
	}

	public static void rellenarAleatorio(int v[]) {
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) (Math.random() * 100);
		}
	}

	public static void imprime(int v[], String n) {
		System.out.print("Los numeros " + n + " son: ");
		for (int i = 0; i < v.length; i++) {
			if (v[i] != 0)
				System.out.print(v[i] + " ");
		}
	}

}