package arrays_alumnos;


public class Ej40ArrayVer3 {
  public static void main(String[] args) {
        
    int [] n = new int[4]; // 
    n[0] = 34;    n[1] = 47;   n[2] = 22;   n[3] = -98;
    System.out.print("Los valores del array n son los siguientes: ");
    System.out.println(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]);
    cambiaPrimeroyTercero(n);
    System.out.print("Después de llamar al método, los valores del array n son los siguientes: ");
    System.out.println(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]);
  } // del main
  
  public static void cambiaPrimeroyTercero (int []x) {
	  x[0] = 2222;     x[2] = 4444;   
  }
}
