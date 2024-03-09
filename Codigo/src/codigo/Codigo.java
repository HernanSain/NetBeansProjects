/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.Scanner;
import servicios.ServiFrase;

/**
 *
 * @author John
 */
public class Codigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*ingresar frase por teclado y codificarla con un subprograma codificador*/
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese frase");
        String frase = leer.next();

        ServiFrase sf = new ServiFrase();
        sf.codifica(frase);
    }
    
}
