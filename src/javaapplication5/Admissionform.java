package javaapplication5;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Admissionform implements ActionListener{
    private JFrame frame;
    private JLabel Fullname;
    private JLabel Fathername;
    private JLabel age;
    private JLabel sexl;
    private JLabel bgrp;
    private JLabel dob;
    private JTextField fntxt;
    private JTextField fttxt;
    private JTextField bday;
    private JTextField agee;
    private JComboBox sex;
    private JComboBox bg;
    private JButton submit;
    private JButton cancel;
    
    Admissionform(){
        frame = new JFrame("Admission Form");
        
        Fullname = new JLabel("Full Name:");
        Fathername = new JLabel("Father's Name:");
        age = new JLabel("Age");
        sexl = new JLabel("Sex:");
        bgrp = new JLabel("Blood Group:");
        dob = new JLabel("Date od Birth:");
        fntxt = new JTextField();
        fttxt = new JTextField();
        bday = new JTextField("dd-mm-yy");
        agee = new JTextField();
        
        String [] sexopt = {"Select One","Male","Female"};
        sex = new JComboBox(sexopt);
        String [] bgopt = {"Select One", "A+","A-","B+","B-","AB+","AB-","O+","O-"};
        bg = new JComboBox(bgopt);
        
        submit = new JButton("submit");
        submit.addActionListener(this);
        cancel = new JButton("cancel");
        cancel.addActionListener(this);
        
        GridLayout g = new GridLayout(8,2);
        frame.setLayout(g);
        frame.add(Fullname);
        frame.add(fntxt);
        frame.add(Fathername);
        frame.add(fttxt);
        frame.add(dob);
        frame.add(bday);
        frame.add(age);
        frame.add(agee);
        frame.add(sexl);
        frame.add(sex);
        frame.add(bgrp);
        frame.add(bg);
        
        frame.add(submit);
        frame.add(cancel);
        
        frame.setVisible(true);
        frame.setSize(700,300);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submit){
            StringBuffer a = new StringBuffer();
               a.append("Name: " +fntxt.getText());
               a.append("\n");
               a.append("Fathers Name: "+fttxt.getText());
               a.append("\n");
               a.append("Age: "+agee.getText());
               a.append("\n");
               a.append("Date of Birth:" +bday.getText());
               a.append("\n");
               a.append("Sex: "+sex.getSelectedItem().toString());
               a.append("\n");
               a.append("Blood Group: " +bg.getSelectedItem().toString());
               a.append("\n");
                File f = new File("patients.text");
                try{
                FileWriter fw = new FileWriter("patients.text",true);
                fw.write(a + "\n");
                fw.close();
                }catch(IOException el){
                    System.out.println(el.toString());
// JOptionPane.showMessageDialog(null, "submit");
        }
        }
        else if(e.getSource()==cancel){
            fntxt.setText("");
            fttxt.setText("");
            agee.setText("");
            bday.setText("");
            sex.setSelectedIndex(0);
            bg.setSelectedIndex(0);
            
        }
    }
}
