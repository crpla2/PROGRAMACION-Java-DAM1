package FileToStringJava8_ejemplos_07_01b_;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * © Alberto Carrera Martín - 10 Agosto 2020 ¡ Viva San Lorenzo!
 */
public class Lectura00 {
	public static void main(String[] args) {

		try {
			// Codificación del fichero autor --> UTF-8
			String sFichero = new String(Files.readAllBytes(Paths.get("Ficheros/Quijote.txt")), StandardCharsets.UTF_8);
			// Puede leerse también a un array de bytes pero luego hay problemas con la
			// codificación.
			System.out.println(sFichero);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}