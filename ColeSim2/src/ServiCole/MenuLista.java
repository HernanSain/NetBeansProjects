/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiCole;

import java.util.Scanner;
import persistencia.DAOInt;

/**
 *
 * @author john
 */
public class MenuLista {

    static Scanner leer = new Scanner(System.in);
    static DAOInt di = new DAOInt();
    static Menu2 m2 = new Menu2();

    public void menuLista() {
        int menu = 0;
        while (menu == 0) {
            try {
                System.out.println("1:Cursos_Profesor 2:Estudiante_Cursos 3: "
                        + "Lista 4:volver");
                menu = leer.nextInt();
                switch (menu) {
                    case 1:
                        di.listaCursosProfesor();
                        menu = 0;
                        break;
                    case 2:
                        menu = 0;
                        break;
                    case 3:
                        int tabla = m2.opcionMenu2();
                        di.lista(tabla);
                }
            } catch (Exception e) {
            }
        }
    }

}
