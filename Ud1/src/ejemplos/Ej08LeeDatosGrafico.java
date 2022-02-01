package ejemplos;



import javax.swing.JOptionPane;

public class Ej08LeeDatosGrafico {
  public static void main(String[] args) {
   
	String cadenaNombre = JOptionPane.showInputDialog(null, "Introduce tu nombre");
    String cadenaEdad = JOptionPane.showInputDialog(null, "Introduce tu edad");
    int edad = Integer.parseInt(cadenaEdad);   
    // Si edad fuera real entonces la conversión sería
    // double edad = Double.parseDouble(cadenaEdad);
    JOptionPane.showMessageDialog(null, "Tu nombre es " + cadenaNombre + " y tu edad es " + edad, "Resultado", JOptionPane.INFORMATION_MESSAGE) ;
  }
}