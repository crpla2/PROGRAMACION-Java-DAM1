package ExamenHerencias;

import java.util.ArrayList;

public class Main2 {
	

	static ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

	private static double salariosTotales() {
		double total=0;
		for(Empleado e:listaEmpleados)
			total+= e.salarioTotal();
		return total;
	}
	private static int numeroComerciales() {
		int cuenta=0;
		for(Empleado e: listaEmpleados)
			if(e instanceof Comercial)
				cuenta++;
		return cuenta;
	}
	public static void main(String[] args) {

		Comercial c1 = new Comercial("Belén Carrera", 38, 1200, 20000);
		Comercial c2 = new Comercial("Luis Aldea", 35, 950, 30000);
		Comercial c3 = new Comercial("Clara Cirac", 28, 1000, 30000);
		Administrativo a1 = new Administrativo("Alberto Carrera", 45, 750, 5);
		Administrativo a2 = new Administrativo("Charo", 40, 600, 10);

		listaEmpleados.add(c1);
		listaEmpleados.add(c2);
		listaEmpleados.add(c3);
		listaEmpleados.add(a1);
		listaEmpleados.add(a2);

		System.out.println("Total de empleados " + listaEmpleados.size());
		System.out.println("Total de comerciales " + numeroComerciales());
		System.out.println("Total de administrativos "
					+ (listaEmpleados.size() -numeroComerciales() ));
		
		System.out.println("Suma Total de Salarios --> " + salariosTotales());
		
	}

}

/*
Total de empleados 5
Total de comerciales 3
Total de administrativos 2
Suma Total de Salarios --> 6050.0
*/