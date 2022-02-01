package ejemplos;

public class Ej01SalidaFormateada00 {
  public static void main(String[] args) {
    System.out.printf("El número %d no tiene decimales.\n", 21);
    System.out.printf("El númmero %f sale con decimales.\n",  21.0);
    System.out.printf("El %.3f sale exactamente con 3 decimales.\n", 21.0);
    System.out.printf("El %9.3f sale exactamente con 3 decimales.\n", 21.0);
    System.out.printf("Nombre: %s, Apellidos: %s %n", "Alberto", "Martín");
    System.out.printf("uno, dos tres %n");
    System.out.printf("cuatro, \t cinco, \t seis %n");
    System.out.printf("%-10s %-10s %-10s%n", "siete", "ocho", "nueve");
    System.out.printf("%-10s %10s %10s", "diez", "once", "doce");
  }
}