/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.dominio;

/**
 *
 * @author john
 */
public class Curso {
   private int id_curso;
   private String curso;
   private int id_profesor;
   private int id_cursos_estudiantes;

    public Curso() {
    }

    public Curso(int id_curso, String curso, int id_profesor, int id_cursos_estudiantes) {
        this.id_curso = id_curso;
        this.curso = curso;
        this.id_profesor = id_profesor;
        this.id_cursos_estudiantes = id_cursos_estudiantes;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public int getId_cursos_estudiantes() {
        return id_cursos_estudiantes;
    }

    public void setId_cursos_estudiantes(int id_cursos_estudiantes) {
        this.id_cursos_estudiantes = id_cursos_estudiantes;
    }
    
   
   
}
