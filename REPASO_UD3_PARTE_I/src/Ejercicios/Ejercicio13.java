package Ejercicios;

public class Ejercicio13 {

	public static void main(String[] args) {
							// LM   BD   PROG ED
		double notas[][] = { { 5.6, 9.4, 6.8, 7 },  //Carlos
							 { 6.9, 5.2, 5.7, 6.3 }, //Miguel
							 { 9.8, 8, 7.6, 8.5 } }; //Lorenzo
		maxMinMediaAlumno(notas);
		maxMinMediaAsignatura();
		maxMinMediaCurso();
		notaAlumnoAsignatura();
		
	}

	private static void notaAlumnoAsignatura() {
		// TODO Auto-generated method stub
		
	}

	private static void maxMinMediaCurso() {
		// TODO Auto-generated method stub
		
	}

	private static void maxMinMediaAsignatura() {
		// TODO Auto-generated method stub
		
	}

	private static void maxMinMediaAlumno(double [][] notas) {
		double max,min,sum=0,cont=0;
		for (int i=0;i<3;i++) {
			max=notas[i][0];
			min=notas[i][0];
			for(int j=0;j<4;j++) {
				if(notas[i][j]>max)
					max=notas[i][j];
				if(notas[i][j]<min)
					min=notas[i][j];
				sum+=notas[i][j];
				cont++;
			}
			System.out.println("Alumno "+i+". Maxima nota:"+max+". Minima nota:"+min+". Media nota:"+sum/cont);
			
		}	
		
	}

}
