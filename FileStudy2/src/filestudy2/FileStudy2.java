/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filestudy2;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class FileStudy2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileWriter f1 = new FileWriter("f1.txt");
            f1.write("porque las golondrinas que hay en el balcon");
            f1.close();
        } catch (Exception e) {
        }
        try {
            File f = new File("f1.txt");
            Scanner lector = new Scanner(f).useDelimiter("\n");
            String g = lector.next();
            System.out.println(g);
            System.out.println(f.getName());
            System.out.println(f.getAbsolutePath());
        } catch (Exception e) {
        }
    }

}
