/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class ServiPrimo {
    Scanner leer = new Scanner(System.in);
    public int ingreseNumero(){
        int control = 0;

        System.out.println("ingrese un entero");
        int n =leer.nextInt();
        return n;
            
        
    }
    
}
