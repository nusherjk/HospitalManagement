package javaapplication5;
import java.io.*;
import java.io.IOException;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
public class ReportAproblem implements ActionListener{
    private JFrame frame;
    private JTextField textfield;
    private JLabel label;
    private JButton submit;
    private JButton cancel;
    
    ReportAproblem(){
        
        frame = new JFrame();
        label = new JLabel("Report a problem. ");
        textfield = new JTextField("");
        submit = new JButton("Submit");
        submit.addActionListener(this);
        cancel = new JButton("Cancel");
        cancel.addActionListener(this);
        
        GridLayout g = new GridLayout(3,2);
        
        frame.setLayout(g);
        frame.setSize(400,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        frame.add(label);
        frame.add(textfield);
        frame.add(submit);
        frame.add(cancel);
        frame.setTitle("Report a Problem");
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==submit){
            if(textfield.getText() == null)
                JOptionPane.showMessageDialog(null, "you must write something");
            else{
                String a = textfield.getText();
                File f = new File("reports.text");
                try{
                FileWriter fw = new FileWriter("reports.text",true);
                fw.write(a + "\n");
                fw.close();
                }catch(IOException el){
                    System.out.println(el.toString());
                }
                //JOptionPane.showMessageDialog(null, textfield.getText());
            }
        }
        else if(e.getSource() == cancel){
            textfield.setText("");
        }
    }
}
