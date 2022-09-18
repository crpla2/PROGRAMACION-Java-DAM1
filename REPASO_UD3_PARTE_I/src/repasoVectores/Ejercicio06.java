package repasoVectores;

public class Ejercicio06 {

	public static void main(String[] args) {
		int[] n = new int[20];
		for (int i = 0; i < n.length; i++)
			n[i] = (int) (Math.random() * 100);
		int[] primos = new int[n.length];
		boolean p = false;
		for (int i = 0; i < n.length; i++) {
			for (int j = 2; j < n[i] / 2; j++) {
				if (n[i] % j == 0) {
					p = false;
					break;
				}
				else
					p = true;
			}
			if (p)
				primos[i] = n[i];
		}
		for (int i = 0; i < n.length; i++)
			System.out.print(n[i] + " ");
		System.out.println();
		for (int i = 0; i < primos.length; i++)
			if (primos[i] != 0)
				System.out.print(primos[i] + " ");
	}
}
