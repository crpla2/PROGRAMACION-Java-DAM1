package _03colecciones2;
import java.util.ArrayList;

public class DemoEnvoltorio {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(new Integer(42));
		Integer n;
		n = lista.get(0);
		int miEntero = n;
		System.out.println(n);
	}

}
