package FileToStringJava8_ejemplos_07_01b_;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
/*
 * © Alberto Carrera Martín - 10 Agosto 2020 ¡ Viva San Lorenzo!
 */
public class Lectura01 {
  public static void main(String[] args) {
    
    try {
      // Codificación del fichero autor --> UTF-8
      List<String> listaLineas = Files.readAllLines(Paths.get("Ficheros/Quijote.txt"));
      
     // for(int i=0; i< listaLineas.size();i++)
     //	  	System.out.println(listaLineas.get(i));
      for (String linea : listaLineas)
    	  	System.out.println(linea);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}