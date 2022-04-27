package pag153_ejercicio07;

import java.util.Objects;

public class Moneda {
	private Valor valor;
	private String posicion;







	@Override
	public int hashCode() {
		return Objects.hash(posicion, valor);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moneda other = (Moneda) obj;
		return Objects.equals(posicion, other.posicion) && Objects.equals(valor, other.valor);
	}


	public Moneda(Valor valor, String posicion) {
		this.valor = valor;
		this.posicion = posicion;
	}
	public Moneda() {
		valor=new Valor();
		posicion="";
	}


	public Valor getValor() {
		return valor;
	}

	public void setValor(Valor valor) {
		this.valor = valor;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return  valor + " - " + posicion ;
	}
	
	
	

}
