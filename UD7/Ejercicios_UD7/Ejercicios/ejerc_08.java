package Ejercicios;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class ejerc_08 {

	public static void main(String[] args) {
		double max = 0, min = 500, media = 0.0;
		int cont = 0;
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("Ficheros/temperaturas.dat"));
			String s = dis.readUTF();
			System.out.println(s+"\n");
			int i;
			Double d;
			while (true) {
				i = dis.readInt();
				d = dis.readDouble();
				System.out.printf("Hora: %dh, Temperatura: %.2f ºC\n",i,d);
				if (max < d)
					max = d;
				if (min > d)
					min = d;
				media += d;
				cont++;
			}

		} catch (EOFException eo) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		media = media / cont;
		System.out.printf("\nTemperatura máxima: %.2f ºC\nTemperatura mínima: %.2f ºC\nTemperatura media: %.2f ºC",max,min,media);
	}

}
