package _8errores;
public class NoHayDineroException extends Exception {
  private int dinero;
  public NoHayDineroException(int n)  { 
    super("No hay perras!!!!"); 
    dinero = n; 
  }
  public int getDinero() { return dinero; } 
}