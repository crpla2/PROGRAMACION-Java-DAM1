package arrays_alumnos;


public class Ej44ArrayBidimensional {
  public static void main(String[] args) {
        
	 //int n [][] = { {34, 47}, {22, -98}, {89,-22}};
	// Vale también int [][] n  = { {34, 47}, {22, -98}, {89,-22}};
    
	int n[][] = new int [3][2];
	n[0][0]= 34;
	n[0][1]= 47;
	n[1][0]= 22;
	n[1][1]= -98;
	n[2][0]= 89;
	n[2][1]= -22;
    System.out.println("Los dos elementos de la primera fila son " + n[0][0] + " y " + n[0][1] );
    System.out.println("Los dos elementos de la segunda fila son " + n[1][0] + " y " + n[1][1] );
    System.out.println("Los dos elementos de la tercera fila son " + n[2][0] + " y " + n[2][1] );

  }
}
