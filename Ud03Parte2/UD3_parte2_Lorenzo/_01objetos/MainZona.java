package _01objetos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainZona {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Zona principal = new Zona(1000);
		Zona compraVenta = new Zona(200);
		Zona vip = new Zona (25);
		int opcion;
		int opcion2;
		
		
		do {
		
		opcion=Integer.parseInt(JOptionPane.showInputDialog("EXPOCOCHES DAM. Elige una opción: \n\n1.Mostrar número de entradas libres\n\n2.Vender entradas\n\n3.Salir"));
		
		if(opcion ==1 ) {
			JOptionPane.showMessageDialog(null, "En la Zona principal quedan " + principal.getEntradasPorVender() + " entradas.\n\n" +
			"En la zona de compra-venta quedan " + compraVenta.getEntradasPorVender() + " entradas. \n\nEn la zona vip quedan " +
			vip.getEntradasPorVender()+" entradas.");
		}
		
		if(opcion ==2) {
			int cantidadEntradas=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas entradas quieres?"));
			opcion2=Integer.parseInt(JOptionPane.showInputDialog("Elige una zona: \n1.Principal\n2.Compra-venta\n3.Vip"));
			if(opcion2==1) {
				principal.vender(cantidadEntradas);
			}
			if(opcion2==2) {
				compraVenta.vender(cantidadEntradas);
			}
			if(opcion2==3) {
				vip.vender(cantidadEntradas);
			}
		}
		
		} while (opcion !=3);
		JOptionPane.showMessageDialog(null, "Gracias!");
		
	}

}
