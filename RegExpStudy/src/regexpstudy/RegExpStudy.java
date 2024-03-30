/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexpstudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author John
 */
public class RegExpStudy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("la Concha", Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher("me cago en la concha de la lora puta ");
        System.out.println(matcher.find());

    }

}
