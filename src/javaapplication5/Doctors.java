package javaapplication5;
import java.awt.GridLayout;
import javax.swing.*;
import java.util.Scanner;
import java.io.*;

public class Doctors {
    private JFrame frame;
    private JButton goback;
    private JLabel doctors;
    private JTextArea doctor[];
    private JScrollPane[] scr;
    private int k=0;
    
    
    Doctors(){
        frame = new JFrame("Doctors list");
        doctors = new JLabel("Doctors list in apollo hospitals");
        doctor = new JTextArea[17];
        scr = new JScrollPane[17];
        for(int m=0;m<17;m++)    
        scr[m] = new JScrollPane(doctor[m],JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        for(int i =0;i<17;i++){
            String sf = "Doctor"+(i+1)+".txt";
            File f = new File(sf);
            StringBuffer sb = new StringBuffer();
        try{
        Scanner s = new Scanner(f);
        while(s.hasNextLine()==true){
             sb.append(s.nextLine()+"\n");
             
        }
        try{
            doctor[i]= new JTextArea(sb.toString());
        }catch(NullPointerException n){
            System.out.println(n);
        }
        //System.out.println(d);
        
       k++;
        }
        catch(IOException q){
            System.out.println(q);
        }
        }
        GridLayout g = new GridLayout(19,1);
        frame.setLayout(g);
        frame.add(doctors);
        
       for(int j= 0;j<17;j++){
           frame.add(doctor[j]);
          
       }
        frame.setVisible(true);
        frame.setSize(700,2000);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        
        }
}
