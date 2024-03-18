/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Recursion {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int n =0;
        System.out.println("ingrese un entero");
        n=leer.nextInt();
        ServRecur sr = new ServRecur();
        System.out.println(n+" recursion n "+sr.sum(n));
    }

}
