
package javaapplication5;

import java.awt.GridLayout;
import java.io.*;
import javax.swing.*;
import java.util.Scanner;
public class Staff {
    private JFrame frame;
    private JLabel doctors;
    private JTextArea doc1;
    private JScrollPane scr;
    Staff(){
        frame = new JFrame("Doctors list");
        doctors = new JLabel("Doctors list in apollo hospitals");
        FileWritter f = new FileWritter();
        doc1 = new JTextArea(f.filewrite("Staff.txt"));
        scr = new JScrollPane(doc1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        GridLayout g = new GridLayout(2,1);
        frame.setLayout(g);
        frame.add(doctors);
        frame.add(scr);
       
        frame.setVisible(true);
        frame.setSize(1200,300);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}
