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
public class Profesor {
   private int id_profesor;
   private String profesor;
   private int id_curso;

    public Profesor() {
    }

    public Profesor(int id_profesor, String profesor, int id_curso) {
        this.id_profesor = id_profesor;
        this.profesor = profesor;
        this.id_curso = id_curso;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }
   
}
