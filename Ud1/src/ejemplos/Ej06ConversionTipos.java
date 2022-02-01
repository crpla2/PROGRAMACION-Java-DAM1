package ejemplos;



public class Ej06ConversionTipos {
  public static void main(String[] args) {

    int x = 2;
    int y = 9;
    double division;

    division = y / x;
    System.out.println("a) El resultado de la división es " + division);   
    /******/
    
    division = (double)y / (double)x;
    System.out.println("b) El resultado de la división es " + division);  
    
    /*****/
    division = (double)y / x;
    System.out.println("c) El resultado de la división es " + division);
    
    /*****/
    division = y / (double)x;
    System.out.println("d) El resultado de la división es " + division);
    
  }
}
