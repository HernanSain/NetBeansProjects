/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class ServiMenu {

    Scanner leer = new Scanner(System.in);

    public int nuevoMenu()throws Exception {
        int x = 0;
        while (x == 0) {
            System.out.println("1:sumar. 2:restar, 3:salir");
            x = leer.nextInt();
            switch (x) {
                case 1:
                    System.out.println("suma");
                    x = 0;
                    break;
                case 2:
                    System.out.println("resta");
                    x = 0;
                    break;
                case 3:
                    x = 1;
                    break;
            }
        }
        return x;
    }
}
