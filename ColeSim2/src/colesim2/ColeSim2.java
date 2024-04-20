/*
perfected version of ColeSim 
 */
package colesim2;

import ServiCole.Menu2;
import ServiCole.MenuLista;
import java.util.Scanner;
import persistencia.DAOInt;

public class ColeSim2 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
//elije acction
        int menu = 0;
        Menu2 m2 = new Menu2();
        int accion = 0;
        int tabla = 0;
        MenuLista ml = new MenuLista();
        DAOInt di = new DAOInt();

        while (menu == 0) {
            try {
                System.out.println("1:Nuevo  2:Listado 3:Modificacion  4:"
                        + "Curso elije Profesor 5:Estudiante elije Curso "
                        + "6:Salir ");

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
                        ml.menuLista();
//                        tabla = m2.opcionMenu2();
//                        di.lista(tabla);
                        menu = 0;
                        break;
                    case 3:
                        accion = 3;
                        tabla = m2.opcionMenu2();
                        di.modifica(tabla);
                        menu = 0;
                        break;
                    case 4: //Curso elije Profesor
                        di.cursoProfesor();
                        menu = 0;
                        break;
                    case 5://estudiante elije Curso
                        di.estudianteCurso();
                        menu = 0;
                        break;
                    case 6:
                        menu = 9;
                        break;
                }
            } catch (Exception e) {
                menu = 0;
                leer.nextLine();
            }
        }

    }

}
