package objetos_ejercicios_1_2_3;

public class PruebaPizza {

	public static void main(String[] args) {
		Pizza p1 = new Pizza("mediana","margarita");
		Pizza p2 = new Pizza("familiar","funghi");
		p2.sirve();
		Pizza p3 = new Pizza("cuatro quesos", "mediana");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		p2.sirve();
		System.out.println("pedida: "+ Pizza.getTotalPedidas());
		System.out.println("pedida: "+ Pizza.getTotalServidas());

	}

}
