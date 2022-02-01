package ejerciciosArrays;

public class ejercicio05 {

	public static void main(String[] args) {
	int numero[] =new int[20];
	int cuadrado[] =new int[20];
	int cubo[] =new int[20];
	
	for(int i=0;i<20;i++){
		numero [i]= ((int)(Math.random()*100)+1);
	}
	for(int i=0;i<20;i++){
		cuadrado [i]= ((int)(Math.pow(numero[i],2)));
	}
	for(int i=0;i<20;i++){
		cubo [i]= ((int)(Math.pow(numero[i],3)));
	}
	for(int i=0;i<20;i++){
		System.out.printf("numero: %d \tcuadrado: %d\t cubo: %d\t \n",numero[i],cuadrado[i],cubo[i]);
	}
	}
}
