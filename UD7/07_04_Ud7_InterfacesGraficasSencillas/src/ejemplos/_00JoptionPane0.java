package src.ejemplos;


import javax.swing.JOptionPane;

public class _00JoptionPane0 {

	public static void main(String[] args) {
//		JOptionPane.showMessageDialog(null,"Hola Buenos días");
//		JOptionPane.showMessageDialog(null,"Hola Buenos días", "Saludo", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "El ordenador se reiniciará en dos segundos",
//		"Atención", JOptionPane.WARNING_MESSAGE);
		
//		JOptionPane.showMessageDialog(null,"Error en la línea 20", 
//				"Error de Compilación", JOptionPane.ERROR_MESSAGE);
		//
//		String numeroString= JOptionPane.showInputDialog("Introduzca una cantidad entera");
//		int numero = Integer.parseInt(numeroString); // o directamente
//		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduzca una cantidad entera"));
//		JOptionPane.showMessageDialog(null,"La raíz cuadrada de " + numero + " vale " + Math.sqrt(numero));
		Object equipo = JOptionPane.showInputDialog(null,"Elige ganador",
				   "Semifinales copa rey 2019", JOptionPane.QUESTION_MESSAGE, null,
				  new String[] { "Real Madrid", "Barcelona"}, null);
		JOptionPane.showMessageDialog(null,"Elegiste: " + equipo);
//		
	}

}
