package _07mapas;
// Alberto Carrera diciembre 2019

// Crear el mapa consultar todos los valores y uno a uno

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;

public class HashMap03 {
  public static void main(String[] args) {

    HashMap<Integer, String> m = new HashMap<Integer, String>();

    m.put(156, "Belén Carrera");
    m.put(921, "Antonio Cepero");      
    m.put(700, "Pablo Martínez");
    m.put(219, "Alberto Carrera");
    m.put(700, "Antonino Lasierra");// Cambio del valor para la clave 700

    System.out.println("Los elementos de m son: \n" + m);
    System.out.println("Otra forma. Los elementos de m son: ");
    System.out.println(m.entrySet()); // forma de conjunto
    //
    System.out.println("RECORRIENDO EL MAPA FORMA 1");
    m.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v)); //expresiones lambda 
    //
    System.out.println("RECORRIENDO EL MAPA FORMA 2"); // MUY USADA, FOR EACH CLASICO
    for (Map.Entry <Integer, String> entrada: m.entrySet()) 
    	System.out.println("Clave = " + entrada.getKey() + ", Valor = " + entrada.getValue());
    //
    System.out.println("RECORRIENDO EL MAPA FORMA 3");
    // con iteradores, la forma más segura de borrar elementos a la vez que se recorren.
    
    Iterator it = m.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry e = (Map.Entry)it.next();
        System.out.println(e.getKey() + " " + e.getValue());
    }
    
    //
    System.out.println("RECORRIENDO LAS CLAVES DEL MAPA");
    for (Integer key : m.keySet()) 
        System.out.println("Clave = " + key);
    
    System.out.println("RECORRIENDO LOS VALORES DEL MAPA");
    for (String valor : m.values()) 
        System.out.println("Valor = " + valor);
    
    System.out.println("MEZCLANDO LOS DOS ANTERIORES- MAS INEFICIENTE/LENTA");
    for (Integer clave : m.keySet()) {
        String valor = m.get(clave);
        System.out.println("Clave = " + clave + ", Valor = " + valor);
    }
    
  } // del main
}
