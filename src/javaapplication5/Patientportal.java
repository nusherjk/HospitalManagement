package javaapplication5;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class Patientportal implements ActionListener{
    private JFrame frame;
    private JLabel label;
    private JLabel label2;
    private JLabel label3;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    public Patientportal(){
        frame = new JFrame();
        
        label = new JLabel("Enroll a patient");
        label2 = new JLabel("appointment with a doctor");
        label3 = new JLabel("Patient List");
        button1 = new JButton("Admit Patient");
        button1.addActionListener(this);
        button2 = new JButton("Appointment with a doctor");
        button2.addActionListener(this);
        button3 = new JButton("Patients List");
        button3.addActionListener(this);
        GridLayout g = new GridLayout(3,2);
        frame.setLayout(g);
        frame.add(label);
        frame.add(button1);
        frame.add(label2);
        frame.add(button2);
        frame.add(label3);
        frame.add(button3);
        frame.setVisible(true);
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setTitle("Patient Portal");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== button1){
           // JOptionPane.showMessageDialog(null, "Button1 pressed");
            new Admissionform();
        }
        else if(e.getSource()== button2){
            new Appointment();
            
    }
        else if(e.getSource()== button3){
           new PatientList();
}
}
}