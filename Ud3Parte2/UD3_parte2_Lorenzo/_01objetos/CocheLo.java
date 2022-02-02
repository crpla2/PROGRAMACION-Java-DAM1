package _01objetos;
public class CocheLo {

  public static int kilometrajeTotal = 0;
  
  public static int getKilometrajeTotal() {
    return Coche.getKilometrajeTotal();
  }
  
  private String marca;
  private String modelo;
  private int kilometraje;

  public CocheLo(String ma, String mo) {
    marca = ma;
    modelo = mo;
    kilometraje = 0;
  }
  
  public int getKilometraje() {
    return this.kilometraje;
  }

  public void recorre(int km) {
    kilometraje =kilometraje+  km;
    kilometrajeTotal += km;
  }
}















