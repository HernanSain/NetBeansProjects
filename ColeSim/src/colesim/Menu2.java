/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colesim;

import java.util.Scanner;

public class Menu2 {

    static Scanner leer = new Scanner(System.in);

    public int opcionMenu2() {
        int tabla = 0;
        int menu2 = 0;
        while (menu2 == 0) {
            try {
                System.out.println("1:Cursos  2:Profesores  3:Estudiantes ");
                menu2 = leer.nextInt();
                switch (menu2) {
                    case 1:
                        tabla = 1;
                  
                        break;
                    case 2:
                        tabla = 2;
                    
                        break;
                    case 3:
                        tabla = 3;
                   
                        break;

                }
            } catch (Exception e) {
                leer.nextLine();
                menu2=0;
            }
        }

        return tabla;
    }

}
