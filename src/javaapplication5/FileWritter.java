/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JTextArea;

/**
 *
 * @author HP ElitBook
 */
public class FileWritter {
    
    public String filewrite(String filename){
        File f = new File(filename);
        StringBuffer sw = new StringBuffer();
        try{
            Scanner s = new Scanner(f);
            
            while(s.hasNextLine()== true){
                sw.append(s.nextLine());
                sw.append("\n");
            }
          
            
        }catch(IOException n){
                    System.out.println(n);
                    }
        return sw.toString();
    }
}
