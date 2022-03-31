package src.ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _08Swing07 extends JFrame {
  Container panel;
  JButton botonCopiar;
  JTextField campoValor, resultado;

  public _08Swing07() {
    panel = getContentPane();
    panel.setLayout(new FlowLayout());
	  panel.add(new JLabel("Valor "));
    campoValor = new JTextField(5);
	  panel.add(campoValor);
	  botonCopiar = new JButton("Copiar");
	  panel.add(botonCopiar);
	  botonCopiar.addActionListener(new OyenteBoton());
	  panel.add (new JLabel("          Copia "));
	  resultado = new JTextField(6);
	  panel.add(resultado);
    setSize(400, 100);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String args[]) {
    _08Swing07 ventana = new _08Swing07();
  }

  class OyenteBoton implements ActionListener {
    public void actionPerformed(ActionEvent e){
      String valor = campoValor.getText();
      resultado.setText(valor);
    }
  }
}



