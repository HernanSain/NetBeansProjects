/*
simplificando ColeSim
 */
package colesim3;

import static colesim3.Menu1.di;
import java.util.Scanner;
import persistencia.DAOInt;

public class ColeSim3 {

    static Scanner leer = new Scanner(System.in);
    static Menu1 m1 = new Menu1();
    static DAOInt di = new DAOInt();

    public static void main(String[] args) {

        int menu = 0;
        while (menu == 0) {
            try {
                System.out.println("1:Nuevo  2:Listado 3:Modificacion  4:"
                        + "Curso elije Profesor 5:Estudiante elije Curso "
                        + "6:Salir ");
                menu = leer.nextInt();
                switch (menu) {
                    case 1:
                        String sql = m1.menuTabla();
//                        System.out.println(sql);
                        di.nuevoRegistro(sql);
                        menu = 0;
                        break;

                    case 2:
                        sql = m1.soloTabla();
                        di.listaRegistros(sql);
                        menu = 0;
                        break;

                }
            } catch (Exception e) {
                menu = 0;
                leer.nextLine();
            }
        }
    }

}
