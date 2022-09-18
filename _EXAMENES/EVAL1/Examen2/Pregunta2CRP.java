package Examen2;



public class Pregunta2CRP {

	public static void main(String[] args) {
		String [] empleados = {"Alberto Carrera", "Luis Aldea", "Leticia García", "Ana Ereza", "Belén Carrera"};
		double [][] salarios = {{540, 540, 760},
				                {200, 220, 250},
				                {760, 760, 760},
				                {605, 799, 810},
				                {800, 800, 680}
							   };
		maxMinProfe(salarios,empleados);
		System.out.println();
		maxMinTrimesstre(salarios, empleados);
		System.out.println();
		maxMinTotal(salarios, empleados);
		
	} // del main

	private static void maxMinProfe( double[][]salario,String[]empleados) {
		double max,min,suma;int cont=0;
		for (int i=0; i< salario.length;i++) {
			max=0;min=salario[i][0];suma=0;
			
			for( int j=0;j<salario[i].length;j++) {
				cont++;
				suma+=salario[i][j];
				if(salario[i][j]<min)
					min=salario[i][j];
				if (salario[i][j]>max)
					max=salario[i][j];
			}	
			System.out.println(empleados[i]+"=[Maximo: "+max+" Minimo: "+min+" Media: "+(suma/salario[0].length));	
		}
		
	}
	private static void maxMinTrimesstre( double[][]salario,String[]empleados) {
		double max,min,suma;int cont=0;
		for (int j=0; j< salario[0].length;j++) {
			max=0;min=salario[0][j];suma=0;
			
			for( int i=0;i<salario[j].length;i++) {
				cont++;
				suma+=salario[i][j];
				if(salario[i][j]<min)
					min=salario[i][j];
				if (salario[i][j]>max)
					max=salario[i][j];
			}	
			System.out.println((j+1)+"ER trimestre=[Maximo: "+max+" Minimo: "+min+" Media: "+(suma/salario[0].length));	
		}
		
	}
	private static void maxMinTotal( double[][]salario,String[]empleados) {
		double max=0,min=salario[0][0],suma=0;int cont=0;
		for (int i=0; i< salario.length;i++) {
				
			for( int j=0;j<salario[i].length;j++) {
				cont++;
				suma+=salario[i][j];
				if(salario[i][j]<min)
					min=salario[i][j];
				if (salario[i][j]>max)
					max=salario[i][j];
			}	
			
		}
		System.out.println("Total =[Maximo: "+max+" Minimo: "+min+" Media: "+(suma/cont)+"]");
	}	
	
	
	

	}//  de la clase Pregunta2

