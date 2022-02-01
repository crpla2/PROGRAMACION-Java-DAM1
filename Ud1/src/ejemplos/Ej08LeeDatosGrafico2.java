package ejemplos;



import javax.swing.JOptionPane;

public class Ej08LeeDatosGrafico2 {
  public static void main(String[] args) {
     JOptionPane.showMessageDialog(null, "Tu nombre es " + 
     JOptionPane.showInputDialog(null, "Introduce tu nombre") +
    		" y tu edad es " + 
    		Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tu edad")),
    		"Resultado", JOptionPane.INFORMATION_MESSAGE) ;
  }
}