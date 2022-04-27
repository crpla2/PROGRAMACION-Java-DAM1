package _8errores;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirFichero2 {
  public static void main(String[] args) throws IOException {
   
     FileOutputStream fos = new FileOutputStream("t:\\salida.txt");
     PrintWriter pw = new PrintWriter(fos);
      pw.println("Alberto Carrera Martín " + 2019);
      pw.flush();
      pw.close();
      fos.close();
    
  }
}
