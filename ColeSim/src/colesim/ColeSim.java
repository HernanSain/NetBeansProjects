/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colesim;

import java.util.Scanner;

/**
 *
 * @author john
 */
public class ColeSim {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
//elije acction
        int menu = 0;
        int accion = 0;
        while (menu == 0) {
            try {
                System.out.println("1:Nuevo  2:Listado 3:Modificacion  4:Salir ");
                menu = leer.nextInt();
                switch (menu) {
                    case 1:
                        accion = 1;
                        menu = 0;
                        break;
                    case 2:
                        accion = 2;
                        menu = 0;
                        break;
                    case 3:
                        accion = 3;
                        menu = 0;
                        break;
                    case 4:
                        menu = 9;
                        break;
                }
            } catch (Exception e) {
            }
        }

//elije tabla
        int opcion = 0;
        int tabla = 0;
        while (opcion == 0) {
            try {
                System.out.println("1:Cursos  2:Profesores 3:Estudiantes  4:Salir ");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        tabla = 1;
                        opcion = 0;
                        break;
                    case 2:
                        tabla = 2;
                        opcion = 0;
                        break;
                    case 3:
                        tabla = 3;
                        opcion = 0;
                        break;
                    case 4:
                        opcion = 9;
                        break;
                }
            } catch (Exception e) {
            }
        }
        System.out.println("Tabla " + tabla + " accion " + accion);

    }

}
