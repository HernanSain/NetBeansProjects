/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadates2;

//import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author John
 */
public class JavaDates2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date f = new Date();
        long t = f.getTime();
        System.out.println(t);
        f.setTime(t);
        System.out.println(f);
        t += 100000000;
        System.out.println(t);
        f.setTime(t);
        System.out.println(f);
    }

}
