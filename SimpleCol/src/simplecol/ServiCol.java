/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecol;

import entities.Curso;
import entities.Estudiante;
import entities.Profesor;
import java.util.Scanner;

public class ServiCol {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void nuevo() {
        DAOInt di = new DAOInt();
        int menu = 0;
        while (menu == 0) {
            try {
                System.out.println("1: curso  2:profesor  3:alumno  4:volver");
                menu = leer.nextInt();
                switch (menu) {
                    case 1:
                        Curso c = new Curso();
                        System.out.println("Curso: ");
                        c.setCurso(leer.next());
                        String cur = c.getCurso();
                        String sql = "insert into cursos (curso) values('" + cur + "');";
                        di.nuevo(sql);
                        menu = 0;
                        break;
                    case 2:
                        Profesor p = new Profesor();
                        System.out.println("Profesor: ");
                        p.setProfesor(leer.next());
                        String pro = p.getProfesor();
                        sql = "insert into profesores (profesor) values('" + pro + "');";
                        di.nuevo(sql);
                        menu = 0;
                        break;
                    case 3:
                        Estudiante e = new Estudiante();
                        System.out.println("Estudiante: ");
                        e.setEstudiante(leer.next());
                        String est = e.getEstudiante();
                        sql = "insert into estudiantes (estudiante) values('" + est + "');";
                        di.nuevo(sql);
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

    public void select() {
        DAOInt di = new DAOInt();
        int menu = 0;
        while (menu == 0) {
            try {
                System.out.println("1: cursos  2:profesores  3:alumnos  4:volver");
                menu = leer.nextInt();
                switch (menu) {
                    case 1:
                        String sql = "select * from cursos ";
                        di.lista(sql);
                        System.out.println("");
                        menu = 0;
                        break;
                    case 2:
                        menu = 0;
                        break;
                    case 3:
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
