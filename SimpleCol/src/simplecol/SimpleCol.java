/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecol;

import java.util.Scanner;

public class SimpleCol {

    static Scanner leer = new Scanner(System.in);

    static ServiCol sc = new ServiCol();

    public static void main(String[] args) {

        int menu = 0;
        while (menu == 0) {
            try {
                System.out.println("1:new  2:alter  3:select  4:exit");
                menu = leer.nextInt();
                switch (menu) {
                    case 1:
                        sc.nuevo();
                        menu = 0;
                        break;
                    case 2:
                        menu = 0;
                        break;
                    case 3:
                        sc.select();
                        menu = 0;
                        break;
                    case 4:
                        menu = 99;
                        break;
                }
            } catch (Exception e) {

                leer.nextLine();
                menu = 0;
            }
        }
    }

}
