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
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.getTimeInMillis());
        Date fecha = c.getTime();

        
    }

}
