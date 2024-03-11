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

    public void ingreseNumero() {
        int n = 0;
        boolean primo = false;
        while (n==0){
        try {
            System.out.println("ingrese un entero mayor que cero para saber si es primo o no ");
            n = leer.nextInt();
            siEsPrimo sep = new siEsPrimo();
            primo = sep.verSiEsPrimo(n);
            System.out.println("el numero ingresado es primo " + primo);
        } catch (Exception e) {
            leer.nextLine();
            n = 0;
            System.out.println("must be an integer");
        }    
        }
        

    }

}
