package javaapplication5;

import java.awt.GridLayout;
import java.io.*;
import javax.swing.*;
import java.util.Scanner;
public class PatientList {
    private JFrame frame;
    private JLabel doctors;
    private JTextArea doc1;
    private JScrollPane scr;
    PatientList(){
        frame = new JFrame("Patient List");
        doctors = new JLabel("Patients List in apollo hospitals");
        FileWritter f = new FileWritter();
        doc1 = new JTextArea(f.filewrite("patients.text"));
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