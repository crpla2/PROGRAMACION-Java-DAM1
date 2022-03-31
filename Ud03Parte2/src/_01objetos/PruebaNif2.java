package _01objetos;



public class PruebaNif2 {

	public static void main(String[] args) {
		/* Nif nif1 = new Nif();
		System.out.println(nif1);*/
		Nif nif2 =new Nif(18022506);
		System.out.println(nif2.dameDni());
		System.out.println(nif2.dameLetra());
		System.out.println(nif2);
		nif2.ponDni(18012401);
		System.out.println(nif2);
		nif2.leer();
		System.out.println(nif2);
	}

}
