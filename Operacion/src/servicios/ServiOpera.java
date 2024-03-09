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
public class ServiOpera {

    Scanner leer = new Scanner(System.in);

    public int leeNumeroA() throws Exception {
        int a;
        System.out.println("ingrese el numero A");
        a = leer.nextInt();
        return a;
    }

    public int leeNumeroB() throws Exception {
        int b;
        System.out.println("ingrese el numero B");
        b = leer.nextInt();
        return b;
    }

    public void calcula(int A, int B) throws Exception {
        System.out.println("operacion 1 = suma , 2 = resta, 3 "
                + "= multiplica, 4 divide ");
        int menu = leer.nextInt();
        switch (menu) {
            case 1:
                System.out.println(A + " + " + B + " = " + (A + B));
                break;
            case 2:
                System.out.println(A + " - " + B + " = " + (A - B));
                break;
            case 3:
                System.out.println(A + " x " + B + " = " + (A * B));
                break;
            case 4:
                
                try {
                System.out.println(A + " / " + B + " = " + (A / B));    
                } catch (ArithmeticException ae) {
                    throw ae;
                }
                
                break;
        }
    }
}
