package p129_Ejercicio6;

public class MainTiempo {

	public static void main(String[] args) {
		Tiempo t1 =new Tiempo(1,20,30);
		Tiempo t2= new Tiempo(0, 30, 40);
		Tiempo t3= new Tiempo(0, 35, 20);
		
		System.out.println(t1.resta(t2.suma(t3)));
		
	}

}
