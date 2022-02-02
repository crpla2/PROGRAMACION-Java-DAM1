package repaso01;

import java.util.ArrayList;

public class Lista {
	ArrayList<B> lista;

	public Lista() {
		lista = new ArrayList<B>();
	}

	public boolean insertar(B b) {
		return lista.add(b);
	}

	public void recorrer() {
		for (B b : lista)
			System.out.println(b);
	}

	public int cuentaZ() {
		int c = 0;
		for (B b : lista)
			if (b instanceof Z)
				c++;
		return c;
	}
}
