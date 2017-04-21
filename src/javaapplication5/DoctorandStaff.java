package javaapplication5;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class DoctorandStaff implements ActionListener{
    private JFrame frame;
    private JButton doctors;
    private JButton staffs;
    private JLabel dands;
    
    DoctorandStaff(){
        frame = new JFrame();
        dands = new JLabel("This is the Doctors and Staff portal");
        doctors = new JButton("Doctors Portal");
        doctors.addActionListener(this);
        staffs = new JButton("Staffs Portal");
        staffs.addActionListener(this);
        
        GridLayout g = new GridLayout(4,1);
        
        frame.setLayout(g);
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setTitle("Doctor and Staff portal");
        
        frame.add(dands);
        frame.add(doctors);
        frame.add(staffs);
    }

   
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== doctors){
            new Doctorj();
             //JOptionPane.showMessageDialog(null, "show doctors");
        }
        else if(e.getSource()== staffs){
            new Staff();
             //JOptionPane.showMessageDialog(null, "show staffs");
        }
    }
}