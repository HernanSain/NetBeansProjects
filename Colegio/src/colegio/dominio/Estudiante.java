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
public class Estudiante {
    private int id_estudiante;
    private String estudiante;
    private int id_cursos_estudiantes;

    public Estudiante() {
    }

    public Estudiante(int id_estudiante, String estudiante, int id_cursos_estudiantes) {
        this.id_estudiante = id_estudiante;
        this.estudiante = estudiante;
        this.id_cursos_estudiantes = id_cursos_estudiantes;
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public int getId_cursos_estudiantes() {
        return id_cursos_estudiantes;
    }

    public void setId_cursos_estudiantes(int id_cursos_estudiantes) {
        this.id_cursos_estudiantes = id_cursos_estudiantes;
    }
    
    
}
