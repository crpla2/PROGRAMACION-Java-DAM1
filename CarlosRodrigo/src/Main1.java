

public class Main1 {

	public static void main(String[] args) {
		Comercial c1 = new Comercial("Belén Carrera", 38, 1200, 20000);
		Comercial c2 = new Comercial("Luis Aldea", 35, 950, 30000);
		Comercial c3 = new Comercial("Clara Cirac", 28, 1000, 30000);
		Administrativo a1 = new Administrativo("Alberto Carrera", 45, 750, 5);
		Administrativo a2 = new Administrativo("Charo", 40, 600, 10);

		System.out.println("El salario de " + c1.getNombre() + " es " + c1.salarioTotal());
		System.out.println("El salario de " + c2.getNombre() + " es " + c2.salarioTotal());
		System.out.println("El salario de " + c3.getNombre() + " es " + c3.salarioTotal());
		System.out.println("El salario de " + a1.getNombre() + " es " + a1.salarioTotal());
		System.out.println("El salario de " + a2.getNombre() + " es " + a2.salarioTotal());
		//
		System.out.println(a1);
		System.out.println(c2);
		
	}

}

/*
El salario de Belén Carrera es 1400.0
El salario de Luis Aldea es 1250.0
El salario de Clara Cirac es 1300.0
El salario de Alberto Carrera es 1000.0
El salario de Charo es 1100.0

Administrativo [nombre=Alberto Carrera, edad=45, salarioBase=750.0, antiguedad=5]
Comercial [nombre=Luis Aldea, edad=35, salarioBase=950.0, ventasMensuales=30000.0]
 */