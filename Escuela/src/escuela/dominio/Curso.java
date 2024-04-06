/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela.dominio;

/**
 *
 * @author sainh
 */
public class Curso {
   private int id_curso;
   private String curso;

    public Curso() {
    }

    public Curso(int id_curso, String curso) {
        this.id_curso = id_curso;
        this.curso = curso;
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
   
}
