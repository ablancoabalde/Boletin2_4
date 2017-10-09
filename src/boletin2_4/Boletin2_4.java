
package boletin2_4;

import java.util.Scanner;

public class Boletin2_4 {

    public static void main(String[] args) {
       
        float n1, n2;
        
        Scanner entradaentero = new Scanner (System.in);
        
        System.out.println("Introduzca Nº1");
        
        n1 = entradaentero.nextFloat();
        
        System.out.println("Introduzca Nº2");
        
        n2 = entradaentero.nextFloat();
        
        System.out.println("Suma = " + (n1+n2) + " Resta = " + (n1-n2) + " Producto = " + (n1*n2) + " Cociente = " + (n1/n2));
                
        
                
    }
    
}
