/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colesim;

import java.util.Scanner;
import persistencia.DAOInt;

/**
 *
 * @author john
 */
public class ColeSim {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
//elije acction
        int menu = 0;
        Menu2 m2 = new Menu2();
        int accion = 0;
        int tabla = 0;
        Literal lt = new Literal();
        DAOInt di = new DAOInt();

        while (menu == 0) {
            try {
                System.out.println("1:Nuevo  2:Listado 3:Modificacion  4:Salir ");
//                System.out.println(lt.literal(accion, tabla));
                menu = leer.nextInt();
                switch (menu) {
                    case 1:
                        accion = 1;
                        tabla = m2.opcionMenu2();
                        di.nuevo(tabla);
                        menu = 0;
                        break;
                    case 2:
                        accion = 2;
                        tabla = m2.opcionMenu2();
                        di.lista(tabla);
                        menu = 0;
                        break;
                    case 3:
                        accion = 3;
                        tabla = m2.opcionMenu2();
                        di.modifica(tabla);
                        menu = 0;
                        break;
                    case 4:
                        menu = 9;
                        break;
                }
            } catch (Exception e) {
                menu = 0;
                leer.nextLine();
            }
        }

//        DAOInt di = new DAOInt();
//        switch (accion) {
//            case 1:
//                di.nuevo(tabla);
//                break;
//            case 2:
//                di.lista(tabla);
//                break;
//            case 3:
//                di.modifica(tabla);
//                break;
//        }
    }

}
