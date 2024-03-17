/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menureducido;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class MenuReducido {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int elije = 0;
        while (elije == 0) {
            try {
                System.out.println("1:opcion 1; 2:opcion 2; 3:salir");
                elije = leer.nextInt();
                switch (elije) {
                    case 1:
                        System.out.println("you choose option one");
                        elije = 0;
                        break;
                    case 2:
                        System.out.println("you choose option two");
                        elije = 0;
                        break;
                    case 3:
                        elije = 1;
                        break;
                }
            } catch (Exception e) {
                System.out.println("must enter an integer idiot!");
                elije = 0;
                leer.nextLine();
            }
        }
    }
}
