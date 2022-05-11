package Objetos2;
public class Main {
	public static void main(String[] args) {
		Banco$$ b = new Banco$$();
		
		System.out.println(b.saldoMedio()); // 0.0
		
		System.out.println(b.tamanyo()); // 0
		b.crearCuenta(new Cuenta(40, "Raquel Carrera", 19275.50));
		b.crearCuenta(new Cuenta(20, "Carmen Bailin", 22000));
		b.crearCuenta(new Cuenta(30, "Toño Mériz", 29000));
		b.crearCuenta(new Cuenta(10, "Javier Escartín", 75000));
		
		System.out.println(b.tamanyo()); //4
		
		b.mostrarCuentas();
		/* Muestra:
		Cuenta [numero=40, nombre=Raquel Carrera, saldo=19275.5]
		Cuenta [numero=20, nombre=Carmen Bailin, saldo=22000.0]
		Cuenta [numero=30, nombre=Toño Mériz, saldo=29000.0]
		Cuenta [numero=10, nombre=Javier Escartín, saldo=75000.0]
		*/
		if (b.buscarCuentaPorNumero(30))
			System.out.println("Existe la cuenta de numero 30"); //<---
		else
			System.out.println("No existe la cuenta de numero 30");
		
		if (b.buscarCuentaPorNumero(120))
			System.out.println("Existe la cuenta de numero 120");
		else
			System.out.println("No existe la cuenta de numero 120"); //<---
		
		Cuenta c1= new Cuenta(35, "Alberto Carrera", -1300);
		System.out.println(b.annadirCuenta(c1)); // true
		
		// No la añade por número de cuenta repetido
		System.out.println(b.annadirCuenta(new Cuenta(20, "Lorenzo Blasco", 2000))); // false
		
		System.out.println(b.saldoMedio()); // 28795.1
		//
		System.out.println(b.existeCuenta(new Cuenta(40, "Raquel Carrera", 19275.50))); // true
		//
		//No la borra pues no existe
		System.out.println(b.borrarCuenta(new Cuenta(50, "Belén Carrera", 75000)));// false
		//
		System.out.println(b.borrarCuenta(new Cuenta(10, "Javier Escartín", 75000))); //true
		//
		System.out.println (b.buscarPorNombre("carrera"));
		// Cuenta [numero=40, nombre=Raquel Carrera, saldo=19275.5]
		// Cuenta [numero=35, nombre=Alberto Carrera, saldo=-1300.0]
		
		System.out.println (b.buscarPorNombre("est"));
		// No imprime nada
		
		// No hace el ingreso pues no existe la cuenta
		System.out.println(b.ingreso(33, 1500)); // false
		
		//Hace un ingreso de 1500, como el saldo anterior era -1300 ahora pasará a 200
		System.out.println(b.ingreso(35, 1500)); //true
				
		System.out.println("\nAhora ordenando por nombre");
		b.ordenarPorNombre();
		b.mostrarCuentas();
		/* Muestra
		Cuenta [numero=35, nombre=Alberto Carrera, saldo=200.0]
		Cuenta [numero=20, nombre=Carmen Bailin, saldo=22000.0]
		Cuenta [numero=40, nombre=Raquel Carrera, saldo=19275.5]
		Cuenta [numero=30, nombre=Toño Mériz, saldo=29000.0]
		 */
	} // del método main
}// de la clase Main


