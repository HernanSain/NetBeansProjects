/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studycalendar;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author John
 */
public class StudyCalendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//intance of objet calendar c with the present time default format
        System.out.println("objet calendar c "+c);//shows the object calendar c 
        System.out.println("milisegundos desde el orogen: "+c.getTimeInMillis());
        System.out.println("fecha calendar "+c.getTime());
//        c.set(2025, 2, 21, 19, 36, 30);
//        Date fecha = c.getTime();
//        System.out.println(fecha);

    }

}
