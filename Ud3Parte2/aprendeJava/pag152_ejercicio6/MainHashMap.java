package pag152_ejercicio6;

import java.util.HashMap;
import java.util.Scanner;

public class MainHashMap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, String> login = new HashMap<String, String>();
		login.put("Carlos", "Papa");
		login.put("Lupe", "Mama");
		String contrasenya = "";
		int contador = 0;
		int correcta = 0;
		int incorrecta = 0;
		String usuario = "";
		do {
			System.out.print("Introduzca el nombre de usuario o teclee fin para salir\nUsuario:");
			usuario = s.next();

			if ((login.containsKey(usuario))) {
				do {
					System.out.println("introduzca la contraseña");
					contrasenya = s.next();
					contador++;
					if (login.containsValue(contrasenya)) {
						System.out.println("Has accedido al area restringida");
						correcta++;

					}

					else {
						incorrecta++;
						if (incorrecta > 2) {
							System.out.println("No le quedan mas intentos\n");
						} else
							System.out.println("la contraseña es incorrecta le quedan " + (3 - contador) + " intentos");

					}

				} while ((contador < 3) && (incorrecta != 3));

			} else if (usuario.contains("fin")) {
				System.out.println("Gracias, intentelo de nuevo en otro momento");
			} else
				System.out.println("El nombre de usuario no es correcto");

		} while (!(usuario.contains("fin")) && (incorrecta != 3) && (contador < 3));
		if (contador == 3)
			System.out.println("Los siento, no tiene acceso al area restringida");
	}

}
