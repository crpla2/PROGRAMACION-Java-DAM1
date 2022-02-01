package EjerciciosIniciales;

public class MainPizza {

	public static void main(String[] args) {
		Pizza p1= new Pizza("margarita","mediana");
		Pizza p2= new Pizza("funghi","familiar");
		p2.servir();
		Pizza p3= new Pizza("cuatro quesos","mediana");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		p2.servir();
		System.out.println("pedidas: "+ Pizza.getPedidas());
		System.out.println("servidas: "+ Pizza.getServidas());
	}

}
