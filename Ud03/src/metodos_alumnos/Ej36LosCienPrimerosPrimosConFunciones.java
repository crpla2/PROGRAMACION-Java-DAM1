package metodos_alumnos;


public class Ej36LosCienPrimerosPrimosConFunciones {

	public static boolean NumeroPrimo (int n) {
		boolean esPrimo = true;
	    for (int i = 2; i <= Math.sqrt(n); i++) 
	    	if ((n % i) == 0) {
	    		esPrimo = false;
	    		break;
	    	}
	    return esPrimo;
		} // de NumeroPrimo
	
	public static void main(String[] args) {
		int contadorPrimos =0;
		int numero = 1;
		while (contadorPrimos <= 100) {
			if (NumeroPrimo(numero)) {
				System.out.print(numero + "-");
				contadorPrimos++;
			}
			numero++;
		} // del while
	}

}
