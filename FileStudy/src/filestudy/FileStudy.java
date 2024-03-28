/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filestudy;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author John
 */
public class FileStudy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        File myFile = new File("myFile.txt");
        myFile.createNewFile();
        if(myFile.exists()){
            System.out.println("afirmative created file");
        }else{
            System.out.println("file doesn't exist");
        }
            
        } catch (IOException e) {
            System.out.println("an error ocurred");
            e.printStackTrace();
        }
    }

}
