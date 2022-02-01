package ejemplos;



public class Ej05Operadores3 {
  public static void main(String[] args) {
    int x =50, y;
//
    y=x+20;
    System.out.println(y);
    y= x -20;
    System.out.println(y);
    y=x*20;
    System.out.println(y);
    y= x/ 20;
    System.out.println(y);
    y = x%20;
    System.out.println(y); // Aquí y vale 10
    y++;
    System.out.println(y);
    ++y;
    System.out.println(y); // Aquí y vale 12
    x= ++y;
    System.out.printf("x vale %d e y vale %d \n", x,y); //x vale 13 e y vale 13
    x=y++;
    System.out.printf("x vale %d e y vale %d", x,y);  // ??
    // Lo mismo para el decremento
   }
}
