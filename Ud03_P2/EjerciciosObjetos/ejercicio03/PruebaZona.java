package ejercicio03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PruebaZona {
	static Scanner s=new Scanner(System.in);
	static Zona p = new Zona(1000);
	static Zona cv = new Zona(200);
	static Zona vip = new Zona(25);
	public static void main(String[] args) {
		int elige;
		int elige2;
		do {
		System.out.println("1. Mostrar número de entradas libres");
		System.out.println();
		System.out.println("2. Vender entradas.");
		System.out.println();
		System.out.println("3. Salir.");
		elige= s.nextInt();
		if(elige==1) {
			System.out.println("Hay "+ p.getentradasPorVender()+ " en la sala principal");
			System.out.println("Hay "+ cv.getentradasPorVender()+ " en la zona de compraventa");
			System.out.println("Hay "+ vip.getentradasPorVender()+ " en la sala vip");
		}
		if(elige==2) {
			System.out.println("¿Cuántas entradas quieres?");
			int cantidadEntradas=s.nextInt();
			System.out.println("Elige la zona donde desee las entradas");
			System.out.println("1. Zona pública");
			System.out.println();
			System.out.println("2. Zona compra venta.");
			System.out.println();
			System.out.println("3. Zona VIP.");
			elige2=s.nextInt();
			if(elige2==1) {
				p.vender(cantidadEntradas);
			}
			if(elige2==2) {
				cv.vender(cantidadEntradas);
			}
			if(elige2==3) {
				vip.vender(cantidadEntradas);
			}
		}
		
		}while((elige<1) && (elige>3));
		if (elige==3)
		System.out.println("Adios");
		}
}
