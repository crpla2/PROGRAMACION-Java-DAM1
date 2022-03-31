package ejemplos;


public class Ej25Whilesanidados {
  public static void main(String args[]) {
	  int i=1, j=1;
	  while (i<=5) {
		  while (j <=5) {
			  System.out.print("i=" + i + " j=" + j + "\t\t");
			  j++;
		  }
		  j=1;
		  System.out.println();
		  i++;
	  }
  } // del main
}