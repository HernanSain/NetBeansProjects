/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import java.util.Scanner;

public class Colegio {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        ServiCole sc = new ServiCole();

        int menu = 0;
        while (menu == 0)
        {
            try {
                System.out.println("1:nuevo ; 2:altera ; 3:consulta");

                menu = leer.nextInt();
                switch (menu) {

                    case 1:
                        menu=0;
                        sc.nuevo();
                        break;
                    case 2:
                        menu=0;
                        break;
                    case 3:
                        
                        menu=0;
                        break;
                    case 4:
                        menu = 99;
                        break;
                    default:
                        menu=0;
                        break;
                                
                }
            } catch (Exception e) {
                leer.nextLine();
                menu=0;
            }
        }
    }

}
