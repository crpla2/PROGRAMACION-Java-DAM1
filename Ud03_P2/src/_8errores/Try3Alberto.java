package _8errores;
public class Try3Alberto{
	public static void main(String arg[]){
		int [] array = new int[20];
		 try
		 	{
         	//array[56] = 24;	
			//int b = 0;
			//int a = 23/b;
			 int c=Integer.parseInt("ALBERTO");
			 System.out.println("Última instrucción del try");
			}
			catch(ArrayIndexOutOfBoundsException excepcion)
		    {
		    System.out.println(" Error de índice en un array");
		    }
		    catch(ArithmeticException excepcion)
		    {
			System.out.println(" No se puede dividir entre 0");
		    }
		    
		    catch(Exception e)
		 	{
		    	System.out.println(" Ocurrió un error");
		    	System.out.println(e.getMessage());
		    	e.printStackTrace(); 
		    	//Podríamos tratar también el NumberFormatException...
		 	}
		   finally{
			   System.out.println("Esto se ejecuta seguro");
		   }
		 System.out.println("Siguiente instrucción al Try Catch...");
	}     
}