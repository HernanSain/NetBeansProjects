/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import colegio.dominio.Curso;
import colegio.dominio.Estudiante;
import colegio.dominio.Profesor;
import colegio.persistencia.DAOCurso;
import colegio.persistencia.DAOEstudiante;
import colegio.persistencia.DAOProfesor;
import java.util.Scanner;

/**
 *
 * @author john
 */
public class ServiCole {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void nuevo() {
        int m = 0;
        while (m == 0) {
            try {
                System.out.println("1:curso, 2:profesor , 3: estudiante , 4: volver");
                m = leer.nextInt();
                switch (m) {
                    case 1:
                        Curso c = new Curso();
                        System.out.println("Curso:");
                        c.setCurso(leer.next());
                        String cur = c.getCurso();
                        String sql = "insert into cursos (curso) values ('" + cur + "');";
                        DAOCurso dc = new DAOCurso();
                        dc.nuevoCurso(sql);
                        m = 0;
                        break;

                    case 2:
                        Profesor p = new Profesor();
                        System.out.println("Profesor: ");
                        p.setProfesor(leer.next());
                        String prf = p.getProfesor();
                        sql = "insert into profesores (profesor) values('" + prf + "');";
                        DAOProfesor dp = new DAOProfesor();
                        dp.nuevoProfesor(sql);
                        m = 0;
                        break;

                    case 3:
                        Estudiante e = new Estudiante();
                        System.out.println("Estudiante:");
                        e.setEstudiante(leer.next());
                        String est = e.getEstudiante();
                        sql = "insert into estudiantes (estudiante) values('" + est + "');";
                        DAOEstudiante de = new DAOEstudiante();
                        de.nuevoEstudiante(sql);
                        m = 0;
                        break;
                    case 4:
                        m = 99;

                }
            } catch (Exception e) {
                leer.nextLine();
                m = 0;
            }
        }
    }

}
