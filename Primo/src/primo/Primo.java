/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primo;

import java.util.Scanner;
import servicios.ServiPrimo;

/**
 *
 * @author John
 */
public class Primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiPrimo sp = new ServiPrimo();
        int q = 0;
        while (q == 0) {
            try {
                System.out.println("1:ingresar numero, 2:salir");
                q = leer.nextInt();
                switch (q) {
                    case 1:
                        sp.ingreseNumero();
                        q = 0;
                        break;
                    case 2:
                        q = 2;
                        break;
                }
            } catch (Exception e) {
                leer.nextLine();
            }
        }

    }

}
