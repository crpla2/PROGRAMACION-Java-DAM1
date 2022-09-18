package examen;

public class Pregunta2 {

	public static void main(String[] args) {
		String[] empleados = { "Alberto Carrera", "Luis Aldea", "Leticia García", "Ana Ereza", "Belén Carrera" };
		double[][] salarios = { 
				{ 540, 540, 760 }, 
				{ 200, 220, 250 }, 
				{ 760, 760, 760 }, 
				{ 605, 799, 810 },
				{ 800, 800, 680 } };
		maxMinProfe(salarios, empleados);
		System.out.println();
		maxMinTrimestre(salarios);
		System.out.println();
		maxMinTotal(salarios);
	}

	private static void maxMinTotal(double[][] salarios) {
		double max = salarios[0][0], min = salarios[0][0], media = 0, cont = 0;
		for (int i = 0; i < salarios.length; i++) {
			for (int j = 0; j < salarios[i].length; j++) {
				if (salarios[i][j] < min)
					min = salarios[i][j];
				if (salarios[i][j] > max)
					max = salarios[i][j];
				cont++;
				media += salarios[i][j];
			}
		
		}
		System.out.print("Salario máximo= " + max);
		System.out.print("Salario mínimo= " + min);
		System.out.print("Salario medio= " + media / cont);
	}

	private static void maxMinTrimestre(double[][] salarios) {
		double max = 0, min = 0, media = 0;
		for (int j = 0; j < salarios[0].length; j++) {
			max = salarios[0][j];
			min = salarios[0][j];
			media = 0;
			for (int i = 0; i < salarios.length; i++) {
				if (salarios[i][j] < min)
					min = salarios[i][j];
				if (salarios[i][j] > max)
					max = salarios[i][j];

				media += salarios[i][j];
			}
			System.out.print("asignatura"+(j+1));
			System.out.print("Trimestre máximo= " + max);
			System.out.print("T mínimo= " + min);
			System.out.print("T medio= " + media / salarios.length + "\n");
		}

	}

	private static void maxMinProfe(double[][] salarios, String[] empleados) {
		double max = 0, min = 0, media = 0;
		for (int i = 0; i < salarios.length; i++) {
			max = salarios[i][0];
			min = salarios[i][0];
			media = 0;
			for (int j = 0; j < salarios[i].length; j++) {
				if (salarios[i][j] < min)
					min = salarios[i][j];
				if (salarios[i][j] > max)
					max = salarios[i][j];

				media += salarios[i][j];
			}
			System.out.print(empleados[i]);
			System.out.print("Salario máximo= " + max);
			System.out.print("Salario mínimo= " + min);
			System.out.print("Salario medio= " + media / salarios[0].length + "\n");
		}

	}

}
