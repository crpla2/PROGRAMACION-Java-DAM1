package repaso01;

abstract class B {
	private static int cuenta = 0;
	private String s;
	private final int r = 2;

	public B(String s) {
		cuenta++;
		this.s = s;

	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public static int getCuenta() {
		return cuenta;
	}

	public int getR() {
		return r;
	}

	final void metodoX() {
		System.out.println(r);
	}

	@Override
	public String toString() {
		return "s=" + s + ", r=" + r;
	}

}
