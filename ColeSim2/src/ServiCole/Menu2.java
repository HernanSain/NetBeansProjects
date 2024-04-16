/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiCole;

import java.util.Scanner;

/**
 *
 * @author john
 */
public class Menu2 {

    static Scanner leer = new Scanner(System.in);

    public int opcionMenu2() {
        int m = 0;
        int tabla = 0;
        while (m == 0) {
            try {
                System.out.println("1:Cursos 2:Profesores 3:Estudiantes 4:Volver ");
                m = leer.nextInt();
                switch (m) {
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
                System.out.println("debe ser un numero entero");
            }
        }
        return tabla;
    }

}
