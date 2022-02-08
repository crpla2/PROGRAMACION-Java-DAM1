package src.ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _06Swing06 extends JFrame {
  JButton boton;
  Container panel;
  public _06Swing06() {
    panel = this.getContentPane();
    boton = new JButton("Pulsa!");
    panel.add(boton);
    boton.addActionListener(new OyenteBoton());
    setSize(100, 100);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  public static void main(String args[]) {
    _06Swing06 ventana = new _06Swing06();
  }
}

class OyenteBoton implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    Toolkit.getDefaultToolkit().beep();
  }
}

