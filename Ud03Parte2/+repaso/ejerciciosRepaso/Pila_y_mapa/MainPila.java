package Pila_y_mapa;

public class MainPila {

	public static void main(String[] args) {
		
		PilaPalabras p=new PilaPalabras();
		int i=0;
		int num=(int)(Math.random()*20)+1;
//		System.out.println(num);
		while(i<num) {
			 i++;
			p.apilarPalabra("a"+i);	
		}
		System.out.println(p);
		
		i=0;
		int numero=(int) (Math.random()*num)+1;
//		System.out.println(numero);
		while(i<numero) {
			 i++;
			System.out.print(p.desapilarPalabra()+" ");	}
		
		System.out.println();
		System.out.println(p);
		
		if(p.pilaPalabrasVacia())
			System.out.println("La pila está vacía");
		else
			System.out.println("La pila tiene elementos");
		
	}

}
