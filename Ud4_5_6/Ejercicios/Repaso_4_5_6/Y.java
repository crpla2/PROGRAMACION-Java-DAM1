package Repaso_4_5_6;

public class Y extends B {
	private String t;

	public Y(String s, String t) {
		super(s);
		this.t=t;
		
	}

	public String getI() {
		return t;
	}

	public void setI(String t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return super.toString()+", t= " + t ;
	}

}
