package _06treeset1;


import java.util.TreeSet;

public class TreeSetEjemplo {
    
    public static void main(String[] args) {
        
        TreeSet<String>  conjunto = new TreeSet<String>();
        
        conjunto.add("Sierra Guara");
        conjunto.add("Ciclo");
        conjunto.add("DAM");
        
        System.out.println(conjunto);
    }
}