package Ejercicios2;

public class E02 {

	public static void main(String[] args) {
		int []num=new int[20];
		for (int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*100);
		}
		for(int l:num) {
			if(l==num[num.length-1])
				System.out.println(l);
			else
			System.out.print(l+"-");
		}
	}

}
