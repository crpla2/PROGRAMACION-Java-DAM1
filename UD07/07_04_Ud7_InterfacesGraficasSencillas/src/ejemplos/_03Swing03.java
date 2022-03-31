package src.ejemplos;

import javax.swing.*;
import java.awt.*;

public class _03Swing03 extends JFrame {
  Container panel;

  public _03Swing03() {
    super("Ejemplo de Layout");
    // Configurar componentes:
    panel = this.getContentPane();
    // BorderLayout
    panel.setLayout(new BorderLayout(5, 10));
    panel.add(new JButton("1"), BorderLayout.EAST);
    panel.add(new JButton("2"), BorderLayout.SOUTH);
    panel.add(new JButton("3"), BorderLayout.WEST);
    panel.add(new JButton("4"), BorderLayout.NORTH);
    panel.add(new JButton("5"), BorderLayout.CENTER);
    setSize(200,200);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String args[]) {
    _03Swing03 ventana = new _03Swing03();
  }
}

