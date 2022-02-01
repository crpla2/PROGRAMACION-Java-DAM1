package _8errores;
public class Test { 
  public static void main(String a[]) { 
    Cuenta c = new Cuenta(5000);
    try { 
      c.sacarDinero(60000); 
    }
    catch(NoHayDineroException e) { 
      System.out.println("Te has pasado en " + e.getDinero());
      System.out.println(e.getMessage());
    } 
  } 
} 