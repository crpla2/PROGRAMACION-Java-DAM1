package repasoVectores;

public class Ejercicio05 {

	public static void main(String[] args) {
		String[] nombres = { "Carlos", "Lorenzo", "Alejandro", "Ramiro", "Christian", "Daniel", "Teo", "Miguel", "Raul",
				"David"};
		double[] sueldos = { 2000, 1500, 2350, 600.50, 1235.47, 2800, 1200, 1650.70, 500, 750 };
		maxmin(nombres,sueldos);
	}
		private static void maxmin(String[] nombres,double[] sueldos ) {
			double maximo = sueldos[0], minimo = sueldos[0];
			for (int i = 0; i < nombres.length; i++) {
				if (sueldos[i] > maximo)
					maximo = sueldos[i];
				if (sueldos[i] < minimo)
					minimo = sueldos[i];
			}
			String cadena="";
			for (int i = 0; i < sueldos.length; i++) {
				if (sueldos[i] == maximo)
					cadena+="El empleado que mas gana es " + nombres[i]+"\n";
				if (sueldos[i] == minimo)
					cadena+="El empleado que menos gana es "+nombres[i]+"\n";
				System.out.println(nombres[i]+" gana "+sueldos[i]+ " euros.");
			}
	System.out.println("\n"+cadena);
		
	}
		
	

}
