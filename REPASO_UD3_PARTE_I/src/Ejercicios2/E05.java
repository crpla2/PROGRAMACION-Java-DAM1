package Ejercicios2;

public class E05 {

	public static void main(String[] args) {
	
		int[]num=new int[20];
		llena(num);
		int[]cua=cuadrdado(num);
		int[]cub=cubo(num);
		
		for(int i=0;i<num.length;i++) {
			System.out.print("numero:"+num[i]);
			System.out.print("\tcuadrado:"+cua[i]);
			System.out.print("\tcubo:"+cub[i]+"\n");
		}
		
		
	}

	private static int[] llena(int[] num) {
		
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*101);
	}
		return num;
	}
	private static int[] cuadrdado(int[] num) {
		int[] nume=new int[num.length];
		for(int i=0;i<num.length;i++) {
			nume[i]=(int)( Math.pow(num[i], 2));
		}
		return nume;
		
	}

	private static int[] cubo(int[] num) {
		int[] nume=new int[num.length];
		for(int i=0;i<num.length;i++) {
			nume[i]=(int)( Math.pow(num[i],3));
		}
		return nume;
		
	}

}
