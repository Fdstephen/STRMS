package student.rms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login implements ActionListener {
    JFrame f=new JFrame();
    JButton b1,b2;
    JLabel H;
    ImageIcon BG;
    login()
    {
        f.setLayout(null);
        f.setBounds(0,0,680,500);
        f.setTitle("Login");

        H=new JLabel("WELCOME");
        H.setBounds(250,40,200,45);
        H.setForeground(Color.BLACK);
        H.setFont(new Font("Raleway",Font.BOLD,30));
        f.add(H);


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("ICON/BOY.PNG"));
        Image i2=i1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel i4=new JLabel(i3);
        i4.setBounds(160,160,300,300);
        f.add(i4);

        b1=new JButton("Student_login");
        b1.setBounds(50,100,200,35);
        b1.setFont(new Font("Raleway",Font.BOLD,18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        f.add(b1);

        b2=new JButton("Admin_login");
        b2.setBounds(400,100,200,35);
        b2.setFont(new Font("Raleway",Font.BOLD,18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        f.add(b2);



        f.getContentPane().setBackground(Color.ORANGE);
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