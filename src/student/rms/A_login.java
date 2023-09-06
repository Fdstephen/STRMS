package student.rms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class A_login implements ActionListener {
    JFrame f=new JFrame();
    JButton b1,b2,b3,b4,b5,b6;

    A_login()
    {
        f.setLayout(null);
        f.setBounds(0,0,800,600);
        f.setTitle("ADMIN DASHBOARD");


        b1=new JButton("NEW STUDENT");
        b1.setBounds(150,100,200,25);
        b2=new JButton("ADD RESULT");
        b2.setBounds(400,100,200,25);
        b3=new JButton("REGISTERED STUDENTS");
        b3.setBounds(150,150,200,25);
        b4=new JButton("ALL STUDENT RESULT");
        b4.setBounds(400,150,200,25);

        b5=new JButton("DELETE STUDENT DETAILS");
        b5.setBounds(150,200,200,25);

        b6=new JButton("UPDATE RESULT");
        b6.setBounds(400,200,200,25);

        b1.addActionListener(this);

        b2.addActionListener(this);

        b3.addActionListener(this);

        b4.addActionListener(this);

        b5.addActionListener(this);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.setLocationRelativeTo(null);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            new add_student();
        }
        else if(e.getSource()==b2)
        {
            new add_result();
        }
        else if(e.getSource()==b3)
        {
            new showStudent();
        }
        else if(e.getSource()==b4)
        {
            new showResult();
        }
        else if(e.getSource()==b5)
        {
            new deletedetails();
        }
    }

    public static void main(String[] args)
    {
        new A_login();
    }
}
