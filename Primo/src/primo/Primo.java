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
        ServiPrimo sp = new ServiPrimo();
        int primo;
        try {
            primo = sp.ingreseNumero();
        } catch (Exception e) {
            System.out.println("mast be an integer");
        }
    }

}