package student.rms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login implements ActionListener {
    JFrame f=new JFrame();
    JButton b1,b2;
    JLabel bl;
    ImageIcon BG;
    login()
    {
        f.setLayout(null);
        f.setBounds(0,0,800,600);
        f.setTitle("Login");
        BG=new ImageIcon("dbsr.png");
        bl=new JLabel(BG);

        b1=new JButton("Student_login");
        b1.setBounds(50,100,300,25);
        b1.addActionListener(this);
        f.add(b1);

        b2=new JButton("Admin_login");
        b2.setBounds(400,100,300,25);
        b2.addActionListener(this);
        f.add(b2);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            new student_login();
        }
        else if(e.getSource()==b2)
        {
            new admin_login();
        }
    }
    public static void main(String[] args)
    {
        new login();
    }
}