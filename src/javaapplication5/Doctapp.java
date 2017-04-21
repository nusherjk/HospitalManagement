/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.io.*;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Doctapp implements ActionListener{
    private JFrame frame;
    private JTextArea txt;
    private JLabel name;
    private JTextField namein;
    private JButton submit;
    private JButton cancel;
    private JLabel Doctorsname;
    Doctapp(String filename){
        FileWritter f =new FileWritter();
        frame = new JFrame("Appointment");
        Doctorsname = new JLabel("Doctors info: ");
        txt = new JTextArea(f.filewrite(filename));
        name = new JLabel("Patient Name");
        namein = new JTextField("");
        submit  = new JButton("Submit");
        submit.addActionListener(this);
        cancel  = new JButton("Cancel");
        cancel.addActionListener(this);
        GridLayout g = new GridLayout(3,2);
        frame.setLayout(g);
        frame.add(Doctorsname);
        frame.add(txt);
        
        frame.add(name);
        frame.add(namein);
        frame.add(submit);
        frame.add(cancel);
        
        frame.setVisible(true);
        frame.setSize(800,250);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== submit){
            try{
            FileWriter fn = new FileWriter("Appointments.txt" ,true);
            fn.write("Doctors detail:\n");
            fn.write(txt.getText()+"\n");
            fn.write("patients name:\n");
            fn.write(namein.getText()+"\n");
            fn.close();
            }
            catch(IOException fe){
                System.out.println(fe);
            }
        }
        else if(e.getSource()== cancel){
            namein.setText("");
        }
    }
}
