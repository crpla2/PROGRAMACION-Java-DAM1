package repaso_vectores;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		int x = 3;
		String nombre[] = new String[x];
		double sueldo[] = new double[x];
		rellenar(nombre, sueldo);
		masRico(nombre,sueldo,max(sueldo));
}
	public static void masRico (String l[], double v[], double max ) {	
		for (int i = 0; i < v.length; i++) {
			if (v[i] == max(v))
				System.out.println("El empleado mejor pagado es " + l[i] + " que cobra " + v[i] + " Euros");
		}
	}
	
	public static void rellenar(String l[], double v[]) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduzca la persona: " + (i + 1));
			l[i] = s.next();
			System.out.println("Introduzca el sueldo de: " + l[i]);
			v[i] = s.nextDouble();

		}
	}

	public static double max(double v[]) {
		double maximo = v[0];
		for (int i = 0; i < v.length; i++) {
			if (maximo < v[i])
				maximo = v[i];
		}
		return maximo;
	}

}
