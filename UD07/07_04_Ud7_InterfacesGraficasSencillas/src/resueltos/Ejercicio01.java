package src.resueltos;
import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		String numeroString=JOptionPane.showInputDialog("Introduzca una cantidad entera");
		while (!isEntero(numeroString)) {
			numeroString = JOptionPane.showInputDialog(null,"Número entero no válido. Inténtelo otra vez");
		}
		
		Integer numero= Integer.parseInt(numeroString);
		JOptionPane.showMessageDialog(null,"La raíz cuadrada de " + numero + " vale " + Math.sqrt(numero),
				"Resultado", JOptionPane.INFORMATION_MESSAGE);
		
	}// del main

	private static boolean isEntero(String n) {
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
} // de la clase
