/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Appointment implements ActionListener{
    private JFrame frame;
    private JLabel label;
    private JButton doc[];
    Appointment(){
        frame = new JFrame("Appoint a Doctor");
        label = new JLabel("Appoint a Doctor");
        doc = new JButton[17];
        doc[0] = new JButton("Dr. Rajeev Chaudahry");
        doc[0].addActionListener(this);
        doc[1] = new JButton("Dr. Aditi Rahman");
        doc[1].addActionListener(this);
        doc[2] = new JButton("Dr. Aziz-Ul-Qadir");
        doc[2].addActionListener(this);
        doc[3] = new JButton("Dr. Tasnim Al Firoz");
        doc[3].addActionListener(this);
        doc[4] = new JButton("Dr. Mehrun Nahar");
        doc[4].addActionListener(this);
        doc[5] = new JButton("Dr. Altaf Rahman");
        doc[5].addActionListener(this);
        doc[6] = new JButton("Dr. Pavin Rahman");
        doc[6].addActionListener(this);
        doc[7] = new JButton("Dr. Tarunendra Nath Lahiri Mazumdar");
        doc[7].addActionListener(this);
        doc[8] = new JButton("Dr. Shah-Al Muqtadir");
        doc[8].addActionListener(this);
        doc[9] = new JButton("Dr. Mazharul Islam");
        doc[9].addActionListener(this);
        doc[10] = new JButton("Dr. Farzana Rahman");
        doc[10].addActionListener(this);
        doc[11] = new JButton("Dr. Anirban Chatterjee");
        doc[11].addActionListener(this);
        doc[12] = new JButton("Dr. Debendra Nath Guha Majumdar");
        doc[12].addActionListener(this);
        doc[13] = new JButton("Dr. Kalyan Kumar Ghosh");
        doc[13].addActionListener(this);
        doc[14] = new JButton("Dr. Partha Pratim Bose");
        doc[14].addActionListener(this);
        doc[15] = new JButton("Dr. Sirajus Salehin");
        doc[15].addActionListener(this);
        doc[16] = new JButton("Dr. Z. Alam");
        doc[16].addActionListener(this);
        GridLayout g = new GridLayout(19,1);
        frame.setLayout(g);
        frame.add(label);
        for(int k=0;k<17;k++){
            frame.add(doc[k]);
        }
        
        frame.setVisible(true);
        frame.setSize(1000,2000);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setTitle("Patient Portal");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==doc[0]){
            new Doct1();
        }
        else if(e.getSource()==doc[1]){
            new Doct2();
        }
        else if(e.getSource()==doc[2]){
            new Doct3();
            }
        else if(e.getSource()==doc[3]){
            new Doct4();
        }
        else if(e.getSource()==doc[4]){
                new Doct5();
            }
        else if(e.getSource()==doc[5]){
            new Doct6();
        }
        else if(e.getSource()==doc[6]){
             new Doct7();   
            }
        else if(e.getSource()==doc[7]){
            new Doct8();
        }
        else if(e.getSource()==doc[8]){
             new Doct9();   
            }
        else if(e.getSource()==doc[9]){
            new Doct10();
        }
        else if(e.getSource()==doc[10]){
              new Doct11();   
            }
        else if(e.getSource()==doc[11]){
             new Doct12();
        }
        else if(e.getSource()==doc[12]){
              new Doct13();   
            }
        else if(e.getSource()==doc[13]){
             new Doct14();
        }
        else if(e.getSource()==doc[14]){
              new Doct15();   
            }
        else if(e.getSource()==doc[15]){
             new Doct16();
        }
        else if(e.getSource()==doc[16]){
              new Doct17();   
            }


    }
    
}
