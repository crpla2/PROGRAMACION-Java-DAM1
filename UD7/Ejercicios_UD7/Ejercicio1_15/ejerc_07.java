package Ejercicio1_15;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ejerc_07 {

	public static void main(String[] args) {
			DataOutputStream dos;
			try {
				dos = new DataOutputStream(new FileOutputStream(
										"Ficheros/temperaturas.dat"));
				
				dos.writeUTF("10 Agosto 2021:");
				for(int i=0;i<=23;i++) {
					dos.writeInt(i);
					dos.writeDouble(Math.random()*30);
				}
				dos.close();
			} catch (IOException ioe) {
				// TODO Auto-generated catch block
				ioe.printStackTrace();
			}
			
			
			
		

	}

}
