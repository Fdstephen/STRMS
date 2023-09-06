package student.rms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class admin_login extends Component implements ActionListener {

    JFrame f=new JFrame();
    JButton sub;
    JLabel j1,j2,sl;
    JTextField t1,t2;
    admin_login()
    {
        f.setLayout(null);
        f.setBounds(0,0,800,600);
        f.setTitle("ADMIN DASHBOARD");

        j1=new JLabel("Admin I'D : ");
        j1.setBounds(250,150,100,25);

        j2=new JLabel("Password : ");
        j2.setBounds(250,200,100,25);

        f.add(j1);
        f.add(j2);

        t1=new JTextField();
        t1.setBounds(330,150,100,25);

        t2= new JTextField();
        t2.setBounds(330,200,100,25);

        f.add(t1);
        f.add(t2);

        sub=new JButton("Login");
        sub.setBounds(300,250,100,25);
        sub.addActionListener(this);


        f.add(sub);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sub)
        {
            String user,pass;
            user= t1.getText();
            char[] password= t2.getText().toCharArray();
            pass = new String(password);
            if(user.equals("admin123")&& pass.equals("Admin@123"))
            {
                new A_login();

            }
            else {
                JOptionPane.showMessageDialog(admin_login.this, "Incorrect User I'd/Password. Please try again.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        new admin_login();
    }
}