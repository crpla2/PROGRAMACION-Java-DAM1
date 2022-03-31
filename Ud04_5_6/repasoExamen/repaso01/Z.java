package repaso01;

import java.util.Date;

public final class Z extends B implements Comparable<Z>, Saludar {

	private int i;

	public Z(String s, int i) {
		super(s);
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "i=" + i + ", " + super.toString();
	}

	@Override
	public int compareTo(Z o) {

		return (i - o.getI());
	}

	@Override
	public void saludo() {
		Date d= new Date();
		if (d.getHours()<14&&d.getHours()>7)
		System.out.println("Buenos Dias");
		if (d.getHours()<20&&d.getHours()>14)
			System.out.println("Buenas Tardes");
		if (d.getHours()>20)
			System.out.println("Buenas Noches");
	}

}
