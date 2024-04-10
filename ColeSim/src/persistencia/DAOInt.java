/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import colesim.Literal;
import java.util.Scanner;

/**
 *
 * @author john
 */
public class DAOInt extends DAO {

    static Literal lt = new Literal();
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void nuevo(int tabla) {
        try {
            conectDB();
            System.out.println("Nuevo registro en " + lt.literalTabla(tabla));
            String campo = "";
            String nombre = "";
            switch (tabla) {
                case 1:
                    campo = "curso";
                    break;
                case 2:
                    campo = "profesor";
                    break;
                case 3:
                    campo = "estudiante";
                    break;
            }

            System.out.println("nombre del nuevo " + campo);
            nombre = leer.next();
            String sql = "insert into " + lt.literalTabla(tabla) + "(" + campo + ") values ('" + nombre + "');";
            stm = con.createStatement();
            stm.execute(sql);

            desconectDB();
        } catch (Exception e) {
        }
    }

    public void lista(int tabla) {
        System.out.println("lista " + lt.literalTabla(tabla));
    }

    public void modifica(int tabla) {
        System.out.println("modifica " + lt.literalTabla(tabla));
    }
}
