package repasoVectores;

public class Ejercicio03 {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8,9,0,-2,-3,-5,-8};
		double sumap = 0;
		double suman = 0;
		int pos = 0;
		int neg = 0;
		for(int i=0; i<a.length;i++) {
			if(a[i]>=0) {
				pos++;
				sumap+=a[i];}
			if(a[i]<0) {
				neg++;
				suman-=a[i];
			}
		}
		System.out.println("media positivos: "+sumap/pos);
		System.out.println("media negativos: "+suman/neg);

	}

}
