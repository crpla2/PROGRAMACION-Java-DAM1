package repasoExamen;

public class ejercicio10libro {
	static int aux[]=new int [20];
	public static void main(String[] args) {

		int numeros[] = new int[20];
		rellena(numeros);
		ordena(numeros);
		System.out.println();
		pinta(aux);
	}
	public static void rellena(int v[]) {
		for(int i=0;i<v.length;i++) {
			v[i]=(int)(Math.random()*100)+1;
			System.out.print(v[i]+" ");
		}
	}
	public static void ordena(int v[]) {
		int x=0,y=19;
		for(int i=0;i<v.length;i++) {
			if(v[i]%2==0) 
				aux[x]=v[i];
			
			if(v[i]%2!=0) 
				aux[y]=v[i];
			y=y-1;
			x++;
		}
		}
	public static void pinta(int v[]) {
		for(int i=0;i<v.length;i++) {
			System.out.print(v[i]+" ");
		}
	}
	}

	