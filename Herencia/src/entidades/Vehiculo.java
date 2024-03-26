/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author John
 */
public class Vehiculo {
    protected String tipo;
    protected int peso;
    public void bocina(){
        System.out.println("tu tu tu ");
    }

    public Vehiculo() {
    }

    public Vehiculo(String tipo, int peso) {
        this.tipo = tipo;
        this.peso = peso;
    }
    
    
}
