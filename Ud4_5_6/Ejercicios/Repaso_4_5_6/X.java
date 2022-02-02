package Repaso_4_5_6;

public abstract class X extends B{
	
	private String v;
	
	public X(String s, String v) {
		super(s);
		this.v=v;
		
	}
	
	public abstract int ganancias();

	@Override
	public String toString() {
		return super.toString()+", v=" + v ;
	}

	
}
