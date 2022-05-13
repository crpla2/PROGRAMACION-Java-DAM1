package Ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= new int [20];
		for(int i=0;i<20;i++) {
			array[i]=(int) (Math.random()*100);
		}
		String cadena="";
		for(int i=0; i<20;i++) {
			if (i==19)
				cadena+=array[i]+".";
			else
				cadena+=array[i]+",";
		}
	System.out.println(cadena);
	}

}
