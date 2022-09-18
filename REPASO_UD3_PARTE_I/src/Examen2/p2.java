package Examen2;

public class p2 {

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

	private static void maxMinProfe(double[][] s, String[] e) {
		double max, min, media;
		for (int i = 0; i < s.length; i++) {
			max = s[0][0];
			min = s[0][0];
			media = 0;
			for (int j = 0; j < s[i].length; j++) {
				if (s[i][j] > max)
					max = s[i][j];
				if (s[i][j] < min)
					min = s[i][j];
				media += s[i][j];
			}
//			System.out.println(e[i]+"= max: " + max + "|min: " + min + "|media: " + media / s[0].length);
			System.out.printf("empleado %s = max %.0f |min %.0f |media %.2f\n",e[i],max,min,media/ s[0].length );
		}

	}

	private static void maxMinTrimestre(double[][] s) {
		double max, min, media;
		for (int j = 0; j < s[0].length; j++) {
			max = s[0][0];
			min = s[0][0];
			media = 0;
			for (int i = 0; i < s.length; i++) {
				if (s[i][j] > max)
					max = s[i][j];
				if (s[i][j] < min)
					min = s[i][j];
				media += s[i][j];
			}
//			System.out.println("trimestre "+(j+1)+"= max: " + max + "|min: " + min + "|media: " + media / s[0].length);
			System.out.printf("trimestre %d = max %.0f |min %.0f |media %.2f\n",j+1,max,min,media / s.length);
		}


	}

	private static void maxMinTotal(double[][] s) {
		double max = s[0][0], min = s[0][0], media = 0, cont = 0;
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				if (s[i][j] > max)
					max = s[i][j];
				if (s[i][j] < min)
					min = s[i][j];
				cont++;
				media += s[i][j];
			}
		}
//		System.out.println("max: " + max + "|min: " + min + "|media: " + media / cont);
		System.out.printf("max %.0f |min %.0f |media %.2f\n",max,min,media/cont);
	}

}
