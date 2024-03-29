package Objetos1;
public class Main {
	public static void main(String[] args) {
		
		Banco b = new Banco();
		//
		b.crearCuenta(new Cuenta(40, "Raquel Carrera", 19275.50));
		b.crearCuenta(new Cuenta(20, "Carmen Bailin", 22000));
		b.crearCuenta(new Cuenta(30, "To�o M�riz", 100));
		b.crearCuenta(new Cuenta(10, "Javier Escart�n", 750));
		
		
		b.mostrarCuentas();
		/* Muestra:
		Cuenta [numero=20, nombre=Carmen Bailin, saldo=22000.0]
		Cuenta [numero=40, nombre=Raquel Carrera, saldo=19275.5]
		Cuenta [numero=10, nombre=Javier Escart�n, saldo=750.0]
		Cuenta [numero=30, nombre=To�o M�riz, saldo=100.0]
		*/
		
		Cuenta c1= new Cuenta(50, "Alberto Carrera", -1300);
		System.out.println(b.annadirCuenta(c1)); // true, la a�ade
		
		// No la a�ade por n�mero de cuenta repetido
		System.out.println(b.annadirCuenta(new Cuenta(20, "Lorenzo Blasco", 2000))); // false
		
		
		//No la borra pues no existe
		System.out.println(b.borrarCuenta(new Cuenta(55, "Bel�n Carrera", 75000)));// false
		//
	System.out.println(b.borrarCuenta(new Cuenta(10, " ", 0))); //true, borra la cuenta 10
		//
		System.out.println(b.egreso(60, 10));// false, no existe la cuenta
		System.out.println(b.egreso(30, 101)); // false, no hay saldo suficiente
		System.out.println(b.egreso(30, 100)); // true, se queda ya con saldo 0
		
		System.out.println("\nAhora ordenando por numero");
		b.ordenarPorNumero();
		/*
		Ahora ordenando por numero
		Cuenta [numero=20, nombre=Carmen Bailin, saldo=22000.0]
		Cuenta [numero=30, nombre=To�o M�riz, saldo=0.0]
		Cuenta [numero=40, nombre=Raquel Carrera, saldo=19275.5]
		Cuenta [numero=50, nombre=Alberto Carrera, saldo=-1300.0]
		 */
		
	} // del m�todo main
}// de la clase Main


