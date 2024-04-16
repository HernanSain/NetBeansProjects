/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import ServiCole.Literal;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author john
 */
public class DAOInt extends DAO {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    static Literal lt = new Literal();

    public void nuevo(int tabla) throws Exception {

        System.out.println("Nombre del nuevo " + lt.literalTabla(tabla));
        String nombre = leer.next();
        String campo = lt.literalTabla(tabla).substring(0, (lt.literalTabla(tabla).length() - 1));
        try {
            conectDB();
            stm = con.createStatement();
            String sql = "insert into " + lt.literalTabla(tabla) + " (" + campo + ") values ('" + nombre + "');";
            stm.execute(sql);
            desconectDB();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<String> lista(int tabla) {
        ArrayList<String> lst = new ArrayList<String>();
        String sql = "select * from " + lt.literalTabla(tabla) + ";";
        try {
            conectDB();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute(sql);
            int c = pstm.getMetaData().getColumnCount();
            rst = pstm.getResultSet();
            while (rst.next()) {
                for (int i = 1; i < (c); i++) {
                    String[] s = new String[c];
                    s[i] = rst.getString(i);
                    lst.add(s[i]);
                }
                lst.add(rst.getString(c));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public void modifica(int tabla) throws Exception {

        try {
            lista(tabla);
            System.out.println("id a modificar:");
            int mod = leer.nextInt();
            System.out.println("nuevo nombre");
            String nombre = leer.next();
            String campo = lt.literalTabla(tabla).substring(0, (lt.literalTabla(tabla).length() - 1));
            //update cursos set curso = nombre where id_curso = 4

            String sql = "update " + lt.literalTabla(tabla) + " set " + campo + " = '"
                    + nombre + "' where id_" + campo + " = " + mod;
            System.out.println(sql);
            conectDB();
            stm = con.createStatement();
            stm.execute(sql);
        } catch (SQLException | InputMismatchException e) {
            System.out.println(e.getMessage());
            System.out.println("debe ser un entero");
            leer.nextLine();
        }

    }

    public void cursoProfesor() {
        int tabla = 1;
        lista(tabla);
        try {

            System.out.println("Elija curso");
            int curso=leer.nextInt();
            tabla = 2;
            lista(tabla);
            
            System.out.println("Elija Profesor");
            int profesor=leer.nextInt();
            
            
        } catch (Exception e) {
        }

    }
}
