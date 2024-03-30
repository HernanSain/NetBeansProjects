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
public class Alumno {
    private int id_alumno;
    private String alumno;
    private int id_curso;

    public Alumno() {
    }

    public Alumno(int id_alumno, String alumno, int id_curso) {
        this.id_alumno = id_alumno;
        this.alumno = alumno;
        this.id_curso = id_curso;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }
    
}
