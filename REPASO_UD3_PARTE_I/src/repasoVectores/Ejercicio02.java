package repasoVectores;

public class Ejercicio02 {

	public static void main(String[] args) {
		int []a= {1,2,-3,-4,6,5,-5,5,54,3,0,0,0};
		int pos=0,neg=0,cero=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0)neg++;
			if(a[i]>0)pos++;
			if(a[i]==0)cero++;
			}
		System.out.println("Positivos: "+pos);
		System.out.println("Negativos: "+neg);
		System.out.println("Ceros: "+cero);
	}

}
