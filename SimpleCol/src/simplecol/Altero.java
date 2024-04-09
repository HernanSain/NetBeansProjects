/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecol;

import java.util.Scanner;

/**
 *
 * @author john
 */
public class Altero {

    static Scanner leer = new Scanner(System.in);

    public void queAltero() {
        int menu = 0;
        while (menu == 0) {
            try {
                System.out.println("1:delete  2:change  3:exit");
                menu = leer.nextInt();
                switch (menu) {
                    case 1:
                        ServiCol sc = new ServiCol();
                        sc.borra();
                        menu=0;
                        break;
                    case 3:
                        menu=11;
                        break;
                }

            } catch (Exception e) {
            }

        }
    }
}
