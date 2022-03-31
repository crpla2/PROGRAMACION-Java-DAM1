package ejemplos;
/*
 * Ampliación ejemplos Alberto octubre 2019
 * Ver detrás de Ej18For, Ej18For2, Ej18For3, Ej18For4, Ej18For5
 */
public class Ej18For6 {
  public static void main(String[] args) {
      int suma = 0;  //acumulador
	  for(int i = 0; i <= 10; i += 5) 
	   suma=suma + i;
	  System.out.println("La suma de los multiplos de 5 entre 0 y 100 vale:  " +
			  				+ suma);
    
  }
}
