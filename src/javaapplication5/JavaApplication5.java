
package javaapplication5;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class JavaApplication5 implements ActionListener{
    private JFrame frame;
    private JLabel label;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    
    public JavaApplication5(){
        frame = new JFrame();
        
        label = new JLabel("Wellcome To APOLLO HOSPITAL");
        button1 = new JButton("Doctors and Staffs");
        button1.addActionListener(this);
        button2 = new JButton("Patient_portal");
        button2.addActionListener(this);
        button3 = new JButton("Report a Problem");
        button3.addActionListener(this);
        GridLayout g = new GridLayout(4,1);
        frame.setLayout(g);
        frame.add(label);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setVisible(true);
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setTitle("Apollo hospital portal");
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1){
            new DoctorandStaff();
        }
        else if(e.getSource() == button2){
            new Patientportal();
        }
        else if(e.getSource() == button3){
            new ReportAproblem();
        }
    }
    public static void main(String[] args) {
        
        new JavaApplication5();
    }
    
}
