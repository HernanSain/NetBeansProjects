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

    public int nuevoMenu(int d) {
        int x = 0;
        while (x == 0) {
            try {
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
                        x = 1;
                        break;
                }
            } catch (Exception e) {
                System.out.println("debe ser un entero");
                d = 0;
                x=1;
            }
        }
        return x;
    }
}
