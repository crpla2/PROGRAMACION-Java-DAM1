package src.ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _11Swing10 extends JFrame {
  Container panel;
	TextField cantidad;
	JButton boton1, boton2;

  public _11Swing10(){
    super("Conversor Euros-Pesetas");
    boton1 = new JButton("A euros");
	  boton2 = new JButton("A pesetas");
	  cantidad = new TextField(10);
	  panel = this.getContentPane();
	  JLabel eti2 = new JLabel(new ImageIcon("logo.gif"));
    panel.add(eti2);
    panel.add(cantidad);
	  panel.add(boton1);
	  panel.add(boton2);
	  panel.setLayout(new FlowLayout());
	  boton1.addActionListener(new OyenteBoton());
	  boton2.addActionListener(new OyenteBoton());
    setSize(300, 250);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String args[]) {
    _11Swing10 ventana = new _11Swing10();
  }

  class OyenteBoton implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
	    Float f = new Float(cantidad.getText());
      float valor = f.floatValue();
	    String s = ae.getActionCommand();
	    if(s.equals("A euros"))    {
	      valor = (float) (valor / 166.321);
		    panel.setBackground(Color.green);
		  }
	    else if(s.equals("A pesetas")) {
	   	  valor = (float) (valor * 166.321);
		    panel.setBackground(Color.blue);
		  }
	    cantidad.setText(Float.toString(valor));
	  }
  }
}
