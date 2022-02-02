package Repaso_4_5_6;

public abstract class B {
	private static int cuenta=0;
	private String s;
	private final int r=2;
	
		
	public B(String s) {
		cuenta++;
		this.s = s;
	}
	public static int getCuenta() {
		
		return cuenta;
	}
	
	
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public int getR() {
		return r;
	}
	
	public final void metodoX() {
		System.out.println(r);
	}
	@Override
	public String toString() {
		return "s=" + s + ", r=" + r ;
	}
	
	
	

}
