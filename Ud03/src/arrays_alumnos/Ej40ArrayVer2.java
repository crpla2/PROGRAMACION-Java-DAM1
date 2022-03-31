package arrays_alumnos;


public class Ej40ArrayVer2 {
  public static void main(String[] args) {
        
      int [] n = new int[4]; // 
      n[0] = 34;   
      n[1] = 47;
      n[2] = 22;
      n[3] = -98;
    System.out.print("Los valores del array n son los siguientes: ");
    System.out.print(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]);
    
    int suma = n[0] + n[3];
    System.out.println("\nEl primer elemento del array más el último suman " + suma);
  }
}
