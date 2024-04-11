/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import colesim.Literal;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
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
        System.out.println("lista  " + lt.literalTabla(tabla));
        ArrayList<String> lst = new ArrayList<String>();
        try {
            conectDB();
            String sql = "select * from " + lt.literalTabla(tabla) + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute(sql);
            rst = pstm.getResultSet();
            int c = pstm.getMetaData().getColumnCount();

            while (rst.next()) {
                for (int i = 1; i < c; i++) {
                    String[] s = new String[c];
                    s[i] = rst.getString(i);
                    lst.add(s[i]);
                }
                lst.add(rst.getString(c));
            }
            int contador = 1;
            Iterator it = lst.iterator();
            while (it.hasNext()) {
                System.out.print(it.next() + "-");
                contador++;
                if (contador > c) {
                    System.out.println("");
                    contador = 1;
                }
            }

            desconectDB();
        } catch (Exception e) {
        }
    }

    public void modifica(int tabla) throws Exception {
        System.out.println("modifica " + lt.literalTabla(tabla));
        lista(tabla);
        System.out.println("id a modificar");
        int id = leer.nextInt();
        try {
            conectDB();

            String sql = "select * from " + lt.literalTabla(tabla) + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute(sql);
            rst = pstm.getResultSet();
            int c = rst.getMetaData().getColumnCount();
            while (rst.next()) {
                for (int i = 1; i < c; i++) {
                    String[] s = new String[c];
                    s[i] = rst.getString(i);

                }
            }

            System.out.println("algo");
            desconectDB();
        } catch (SQLException e) {
            System.out.println("ta mal!");
            throw e;

        }

    }
}
