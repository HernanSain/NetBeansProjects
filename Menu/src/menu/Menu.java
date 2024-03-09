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
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiMenu sm = new ServiMenu();
        int x = 0;
        int y = 0;
        try {
             x = 0;
             y = 0;
            while (x == 0) {
                x = sm.nuevoMenu(y);
                System.out.println("x " + x);
                System.out.println("y " + y);
            }
        } catch (Exception e) {
            System.out.println("must be an integer");
            x = 0;
            y = 0;
        } finally {
            y = 0;
        }
    }
}
