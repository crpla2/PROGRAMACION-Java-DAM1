package examen3;
import java.util.ArrayList;
import java.util.Collections;

public class Banco {

	private ArrayList<Cuenta> listaCuentas;

	public Banco() {
		listaCuentas= new ArrayList<Cuenta>();
	}
	
	public void crearCuenta(Cuenta c) {
		listaCuentas.add(c);
	}
	
	public int tamanyo() {
		return listaCuentas.size();
	}

	public void mostrarCuentas() {
		for (int i =0;i<listaCuentas.size();i++) {
			System.out.println(listaCuentas.get(i));
		}
	}
	
	public boolean buscarCuentaPorNumero (long n) {
		boolean encontrado= false;
		for (int i =0;i<listaCuentas.size();i++) {
			if(listaCuentas.get(i).getNumero()==n) {
				encontrado=true;
			}
		}
		return encontrado;
	}
	
	public boolean annadirCuenta(Cuenta c) {
		if(buscarCuentaPorNumero(c.getNumero())==false) {
			return listaCuentas.add(c);
		}
		return false;
	}
	
	public double saldoMedio() {
		double total=0;
		int contador=0;
		for (int i =0;i<listaCuentas.size();i++) {
			total = total + listaCuentas.get(i).getSaldo();
			contador++;
		}
		if(contador>0)
			total=total/contador;
		return total;
	}
	
	public boolean existeCuenta(Cuenta c) {
		boolean encontrado=false;
		for(int i =0;i<listaCuentas.size();i++) {
			if (listaCuentas.get(i).equals(c))
				encontrado=true;
		}
		return encontrado;
	}
	
	public boolean borrarCuenta(Cuenta c) {
		return listaCuentas.remove(c);
	}
	
	public String buscarPorNombre (String n) {
		String cadena="";
		for(int i =0;i<listaCuentas.size();i++) {
			if(listaCuentas.get(i).getNombre().toLowerCase().contains(n.toLowerCase())) {
				cadena = cadena + listaCuentas.get(i) + "\n";
			}
		}
		return cadena;
	}
	
	public boolean ingreso (long numero, double cantidad) {
		for (int i =0;i<listaCuentas.size();i++) {
			if(listaCuentas.get(i).getNumero()==numero) {
				listaCuentas.get(i).setSaldo(listaCuentas.get(i).getSaldo()+cantidad);
				return true;
			}
		}
		return false;
	}
	
	public void ordenarPorNombre() {
		Collections.sort(listaCuentas);
	}
	
}
