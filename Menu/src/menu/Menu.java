/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.InputMismatchException;
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
        //version while / try  
        int x = 0;
<<<<<<< HEAD
        while (x == 0) {
            try {
                x = sm.nuevoMenu();
//                System.out.println("x " + x);
            } catch (Exception e) {
                System.out.println("debe ser un entero ");
                System.out.println("x " + x);
                x = 1;
            } 
=======
      
        while (x == 0) {
            x = sm.nuevoMenu();
>>>>>>> 3d970bf2de65d8621371ef6d4e6238a387f5c6da
        }
    }
}
