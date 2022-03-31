package ejemplos;
/*
 * Ampliación ejemplos Alberto octubre 2019
 * Ver detrás de Ej18For,Ej18For2, Ej18For3, Ej18For4
 */
public class Ej18For5 {
  public static void main(String[] args) {
      int contador = 0;  
	  for(int i = 0; i <= 100; i += 5) 
	      contador++;
	  System.out.println("Entre 0 y 100 hay " + contador 
			  				+ " múltiplos de 5");
    
  }
}
