package pag153_ejercicio07;

public class Valor {
	private int numero;
	private String moneda;
	public Valor() {
		
	}
	public Valor(int numero,String moneda) {
		this.numero=numero;
		this.moneda=moneda;
	}

	@Override
	public String toString() {
		return  numero + " " + moneda ;
	}
	

}
