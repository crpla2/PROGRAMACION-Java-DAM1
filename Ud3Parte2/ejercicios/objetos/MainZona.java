package objetos;

import java.util.Scanner;

public class MainZona {
		static Zona principal = new Zona(1000);
		static Zona compra_venta = new Zona(200);
		static Zona vip =new Zona(25);
		static Scanner n = new Scanner(System.in);
		
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		System.out.println("1. Mostrar número de entradas libres");
		System.out.println();
		System.out.println("2. Vender entradas");
		System.out.println();
		System.out.println("3. Salir");
		
		
		int sel = n.nextInt();
		while (sel<1||sel>3) {
			System.out.println("Por favor, introduzca una selección válida");
			sel = n.nextInt();
		}
		if(sel==1) {
			entradasLibres();
					}
		if(sel==2) {
			venderEntradas();
		}
		if(sel==3) {
			System.exit(0);
	
		}
		
	}
	
	public static void entradasLibres(){
		System.out.println("Zona principal: "+principal.getEntradasPorVender());
		System.out.println("Zona Compra-venta: "+compra_venta.getEntradasPorVender());
		System.out.println("Zona vip: "+vip.getEntradasPorVender());
		System.out.println();
		System.out.println("**************");
		menu();
	}

	public static void venderEntradas() {
		System.out.println("¿Para que zona quiere las entradas?");
		System.out.println("1. Sala Principal");
		System.out.println("2. Zona compra-venta");
		System.out.println("3. Zona vip");
		int sel2 = n.nextInt();
		while (sel2<1||sel2>3) {
			System.out.println("Por favor, introduzca una selección válida");
			sel2 = n.nextInt();
		}
		if(sel2==1) {
			System.out.println("Introduzca el numero de entradas deseadas: ");
			int numero=n.nextInt();
			principal.vender(numero);
			
		}
		if(sel2==2) {
			System.out.println("Introduzca el numero de entradas deseadas: ");
			int numero=n.nextInt();
			compra_venta.vender(numero);
		}
		if(sel2==3) {
			System.out.println("Introduzca el numero de entradas deseadas: ");
			int numero=n.nextInt();
			vip.vender(numero);
		}
		System.out.println();
		System.out.println("**************");
		menu();
	}
	
}
