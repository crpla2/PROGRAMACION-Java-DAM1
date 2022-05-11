package Examen1;

public class adrianMarcano2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double divisor = 1;
		double subdivisor = 1;
		double total=0;
		double subnumero = 6;
		while(divisor < 5000) {
			subdivisor=1;
			total=0;
			while(subdivisor < subnumero) 
				{
				if (subnumero%subdivisor==0) {total=total+subdivisor;}
				
				subdivisor++;
				}
			if(total == subnumero) {System.out.println(subnumero+" es perfecto");}
			subnumero++;
			divisor++;
			
		}
		
		
	}

}
