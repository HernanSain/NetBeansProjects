/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import entidades.Auto;


public class Herencia {
    public static void main(String[] args) {
        Auto a1 = new Auto();
        a1.setTipo("sedan");
        a1.setMarca("GM");
        a1.setPeso(1850);
        System.out.println("Vehiculo "+a1.getTipo()+" Marca: "+a1.getMarca()+
                " Peso: "+a1.getPeso());
    }
}
