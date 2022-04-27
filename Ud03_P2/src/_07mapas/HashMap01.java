package _07mapas;
// Alberto Carrera diciembre 2019

// Crear el mapa e insertar valores

import java.util.HashMap;

public class HashMap01 {
  public static void main(String[] args) {

    HashMap<Integer, String> m = new HashMap<Integer, String>();

    m.put(156, "Belén Carrera");
    m.put(921, "Antonio Cepero");      
    m.put(700, "Pablo Martínez");
    m.put(219, "Alberto Carrera");
    m.put(700, "Antonino Lasierra");// Cambio del valor para la clave 700
    System.out.println("Tamaño del mapa: " + m.size());
    System.out.println("Los elementos de m son: \n" + m);
  }
}
