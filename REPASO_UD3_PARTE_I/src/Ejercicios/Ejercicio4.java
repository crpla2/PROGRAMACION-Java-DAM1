package Ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {
		char[]array=new char[12];
		array[0]='a';
		array[1]='x';
		array[4]='@';
		array[6]=' ';
		array[8]='+';
		array[9]='Q';
		for (int i=0;i<array.length-1;i++)
			System.out.print(array[i]+";");
	}
// Los deja vacios
}
