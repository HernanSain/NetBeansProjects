/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author john
 */
public class Profesor {
    private int id_profesor;
    private String profesor;

    public Profesor() {
    }

    public Profesor(int id_profesor, String profesor) {
        this.id_profesor = id_profesor;
        this.profesor = profesor;
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
    

}
