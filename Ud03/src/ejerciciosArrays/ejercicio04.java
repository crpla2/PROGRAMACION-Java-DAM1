package ejerciciosArrays;

public class ejercicio04 {

	public static void main(String[] args) {
		
		
		char car[]= new char[10]; 
		car[0]= 'a';
		car[1]= 'x';
		car[4]= '@';
		car[6]= ' ';
		car[7]= '+';
		car[8]= 'Q';
		for(int i=0;i<10;i++)
			System.out.println("casilla "+i+ "=> "+ car[i]);
	}
//Los valores que no son asignados el array los deja vacios
}
