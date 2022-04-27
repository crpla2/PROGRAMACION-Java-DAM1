package pag153_ejercicio08;

import java.util.Objects;

public class Carta implements Comparable<Carta> {
	private int valor;
	private String palo;

	public Carta(int valor, String palo) {
		this.valor = valor;
		this.palo = palo;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(palo, valor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return Objects.equals(palo, other.palo) && valor == other.valor;
	}
	@Override
	public String toString() {
		if(valor==1||valor==11||valor==10||valor==12)
			if(valor==1)
			return "As de "+palo;
			if(valor==10)
				return "Sota de "+palo;
			if(valor==11)
				return "Caballo de "+palo;
			if(valor==12)
				return "Rey de "+palo;
		else
			
		return  valor + " de " + palo ;
	}
	@Override
	public int compareTo(Carta o) {
		return this.palo.compareToIgnoreCase(o.palo);
	}
	
	

}
