package repaso01;

public class Main {

	public static void main(String[] args) {
		Lista l = new Lista();

//		B b = new B();
//		X x = new X();
		System.out.println(B.getCuenta());//0
		Z z1=new Z("Soy z1",10);
		Z z2=new Z("Soy z1",20);
		Z z3=new Z("Soy z1",30);
		Y y1=new Y("Soy z1"," de la clase Y");
		Y y2=new Y("Soy z2"," de la clase Y");
		System.out.println(B.getCuenta());//5
		System.out.println(z1.compareTo(z2));//-10
		y1.metodoX();//2
		z2.metodoX();//2
		z3.saludo();
		//
		l.insertar(z1);l.insertar(z2);l.insertar(z3);
		l.insertar(y1);l.insertar(y2);
		l.recorrer();
		System.out.println(l.cuentaZ());
		
	
}
}
	