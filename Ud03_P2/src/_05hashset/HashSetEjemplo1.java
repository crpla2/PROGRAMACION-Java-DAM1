package _05hashset;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEjemplo1 {
    
    public static void main(String[] args) {
        
        HashSet<String>  conjunto = new HashSet<String>();
        
        conjunto.add("Sierra Guara");
        conjunto.add("Ciclo");
        conjunto.add("DAM");
        
        System.out.println(conjunto);
        System.out.println("");
        
        System.out.println("Utilizamos un Iterator para imprimir los elementos");
        Iterator<String> itr = conjunto.iterator();
        while (itr.hasNext())
        	System.out.println(itr.next());
       
        System.out.println("Utilizamos un bucle for each para imprimir los elementos");
        for (String s: conjunto) 
        	System.out.println (s);
     
    }
}