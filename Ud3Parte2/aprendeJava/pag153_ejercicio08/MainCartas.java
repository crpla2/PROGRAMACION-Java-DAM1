package pag153_ejercicio08;

public class MainCartas {

	public static void main(String[] args) {

		Baraja esp = new Baraja();
		esp.llenar();
		esp.imprime();
		System.out.println(".........................");
		esp.azar();

	}
}
