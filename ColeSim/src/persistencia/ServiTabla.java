/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.SQLException;
import java.util.Scanner;
import static persistencia.DAOInt.lt;

public class ServiTabla extends DAO {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    static DAOInt daoi = new DAOInt();

    public void listaTabla(int tabla) throws Exception {

        daoi.lista(tabla);
        int num = 0;
        String nuevo_nombre = "";
        while (num == 0) {
            try {
                System.out.println("ingrese id ");
                num = leer.nextInt();
                System.out.println("ingrese nombre");
                nuevo_nombre = leer.next();
                int largo_tabla = lt.literalTabla(tabla).length();
                String column = lt.literalTabla(tabla).substring(0, (largo_tabla - 1));
                System.out.println(column);
                String sql = "update " + lt.literalTabla(tabla) + " set " + column + " = '"
                        + nuevo_nombre + "' where id_" + column + " = " + num + ";";
                System.out.println(sql);
                conectDB();
                stm = con.createStatement();
                stm.executeUpdate(sql);
                desconectDB();
                daoi.lista(tabla);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void borraTabla(int tabla) throws Exception {
        try {
            conectDB();
            daoi.lista(tabla);
            int largoTabla= lt.literalTabla(tabla).length();
            String column = lt.literalTabla(tabla).substring(0, (largoTabla-1));
            System.out.println("ingrese id a borrar");
            int num = leer.nextInt();
            String sql = "delete from "+lt.literalTabla(tabla)+" where id_"
                    +column+" = "+num+";";
            System.out.println(sql);
        } catch (SQLException e) {
        }

    }

}
