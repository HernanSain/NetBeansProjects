/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiCole;

/**
 *
 * @author john
 */
public class Literal {

    public String literalTabla(int tabla) {
        String litTabla = "";
        switch (tabla) {
            case 1:
                litTabla = "cursos";
                break;
            case 2:
                litTabla = "profesores";
                break;
            case 3:
                litTabla = "estudiantes";
                break;
        }
        return litTabla;
    }

    public String literalAccion(int accion) {
        String litAccion = "";
        switch (accion) {
            case 1:
                litAccion = "nuevo";
                break;
            case 2:
                litAccion = "lista";
                break;
            case 3:
                litAccion = "modifica";
                break;
        }
        return litAccion;
    }
}
