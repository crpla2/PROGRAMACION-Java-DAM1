package _8errores;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirFichero {
  public static void main(String[] args) {
    try{
      FileOutputStream fos = new FileOutputStream("d:\\salida.txt");
     PrintWriter pw = new PrintWriter(fos);
      pw.println("Alberto Carrera Martín " + 2019);
      pw.flush();
      pw.close();
      fos.close();
    }
     catch (IOException e2){
    	 System.out.println(e2.getMessage());
     }
  }
}
