/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import colesim.Literal;

/**
 *
 * @author john
 */
public class DAOInt extends DAO {

    static Literal lt = new Literal();

    public void nuevo(int tabla) {
        try {
            conectDB();
            System.out.println("Nuevo registro en " + lt.literalTabla(tabla));
            desconectDB();
        } catch (Exception e) {
        }
    }

    public void lista(int tabla) {
        System.out.println("lista " + lt.literalTabla(tabla));
    }
public void modifica(int tabla){
    System.out.println("modifica "+lt.literalTabla(tabla));
}
}

