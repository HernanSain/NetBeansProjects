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

    public int nuevoMenu(int d)  {
        int x = 0;
        int r = 0;
        while (r == 0) {
            System.out.println("1:sumar. 2:restar, 3:salir");
            d = leer.nextInt();
            switch (d) {
                case 1:
                    System.out.println("suma");
                    break;
                case 2:
                    System.out.println("resta");
                    break;
                case 3:
                    r = 1;
                    x = 1;
                    break;
            }
        }
        return x;
    }
}
