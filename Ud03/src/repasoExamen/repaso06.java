package repasoExamen;

public class repaso06 {
static boolean primo=true;
	public static void main(String[] args) {
		int v[]= new int[20];
		
		rellena(v);
		System.out.println();
		esPrimo(v);
	}
	public static void rellena(int v[]) {
		for(int i=0;i<v.length;i++) {
		v[i]=(int)(Math.random()*100);
		System.out.print(v[i]+" ");	
		}
	}
	public static void esPrimo(int v[]) {
		int vp[]= new int[20];
	for (int j = 0; j < v.length; j++) {
		int x=v[j];
		for(int i=2;i<x/2;i++) {
			if(x%i==0) {
				primo=false;
				break;
				}
			else primo=true;
		}
		if(primo) {
			vp[j]=x;
		}System.out.print(vp[j]+" ");	
	}
	}
	
}
