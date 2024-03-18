/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

class Vehiculo {

    protected String tipo;
    protected int peso;

    public Vehiculo(String tipo, int peso) {
        this.tipo = tipo;
        this.peso = peso;
    }

    public static void bocina() {
        System.out.println("tuu tuu");
    }

}

class Auto extends Vehiculo {

    private String marca;

    public Auto(String tipo, int peso) {
        super(tipo, peso);
    }
    

    public Auto(String marca, String tipo, int peso) {
        super(tipo, peso);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    

}

public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Auto a1 = new Auto();
        a1.setTipo("sedan");
        a1.setMarca("Volvo");
        a1.setPeso(1560);
        System.out.println("Tipo " + a1.getTipo() + " marca " + a1.getMarca() + " peso"
                + +a1.getPeso());

    }

}
