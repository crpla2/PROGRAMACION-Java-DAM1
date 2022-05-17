package _EXAMENES;

import java.util.Scanner;

public class ValidarContrasenya {

	public static void main(String[] args) {

		char[] contrasenya;
		Scanner s = new Scanner(System.in);
		System.out.print(
				"Introduzca la contraseña. Requisitos: \n" + "- La contraseña debe tener como mínimo 8 caracteres.\n"
						+ "- Como mínimo deben aparecer 2 dígitos \n" + "- Debe comenzar por una letra mayúscula \n");

		contrasenya = s.nextLine().toCharArray();
		comprueba(contrasenya);

	}

	private static void comprueba(char[] cont) {
		int  num = 0;
		for (int i = 0; i < cont.length; i++) {
			if ((cont[i] > 47) && (cont[i] < 58))
				num++;
		}
		if((cont.length>7)&&(num>1)&&(cont[0]>64)&&(cont[0]<91))
			System.out.println("Contraseña válida");
		else System.out.println("Contraseña NO válida");
	}
}