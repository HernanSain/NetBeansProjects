package javadates2;

import java.time.LocalDateTime;
import java.util.Date;
import java.time.format.DateTimeFormatter;
public class JavaDates2 {

    public static void main(String[] args) {
 
//        System.out.println(t1);
        Date f = new Date();
        System.out.println(f);
        System.out.println(f.getTime());
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
  
        DateTimeFormatter ff = DateTimeFormatter.ofPattern("E MM dd yyyy HH mm ss");
        String f2 = t1.format(ff);
        System.out.println(f2+"");
        
    }

}
