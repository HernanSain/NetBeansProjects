/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colesim3;

import java.util.Scanner;
import persistencia.DAOInt;

/**
 *
 * @author john
 */
public class Menu1 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    static DAOInt di = new DAOInt();

    public String menuTabla() {
        int menu = 0;
        String value = "";
        String sql = "";
        while (menu == 0) {
            try {
                System.out.println("1:nuevo Curso 2:nuevo Profesor 3:nuevo Estudiante 4:volver");
                menu = leer.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("Value:");
                        value = leer.next();
                        sql = "insert into cursos (curso) value ('" + value + "');";
                        break;
                    case 2:
                        System.out.println("Value:");
                        value = leer.next();
                        sql = "insert into profesores (profesor) value ('" + value + "');";
                        break;
                    case 3:
                        System.out.println("Value:");
                        value = leer.next();
                        sql = "insert into estudiantes (estudiante) value ('" + value + "');";
                        break;
                    case 4:
                        menu = 9;
                }
            } catch (Exception e) {
                leer.nextLine();
                menu = 0;
            }
        }
        return sql;
    }

    public String soloTabla() {
        int menu = 0;
        String sql = "";
        while (menu == 0) {
            try {
                System.out.println("1:lista Cursos 2:lista Profesores 3:lista Estudiantes 4:volver");
                menu = leer.nextInt();
                switch (menu) {
                    case 1:
                        sql = "select * from cursos;";

                        break;
                    case 2:
                        sql = "select * from profesores;";

                        break;
                    case 3:
                        sql = "select * from estudiantes;";
 
                        break;
                    case 4:
                        menu = 9;
                }
            } catch (Exception e) {
                leer.nextLine();
                menu = 0;
            }
        }
        return sql;
    }
}
