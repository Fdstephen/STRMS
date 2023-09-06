package student.rms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class student_login implements ActionListener{
    JFrame f=new JFrame();
    JLabel j2,j1;
    JTextField t1,t2;
    JButton sub;
    student_login()
    {
        f.setLayout(null);
        f.setBounds(0,0,800,600);
        f.setTitle("STUDENT DASHBOARD");

        j1=new JLabel("Student I'D : ");
        j1.setBounds(250,150,100,25);

        j2=new JLabel(" Password   : ");
        j2.setBounds(250,200,100,25);

        f.add(j1);
        f.add(j2);

        t1=new JTextField();
        t1.setBounds(330,150,100,25);

        t2= new JTextField();
        t2.setBounds(330,200,100,25);

        f.add(t1);
        f.add(t2);

        sub=new JButton("Enter");
        sub.setBounds(300,300,100,25);
        sub.addActionListener(this);
        f.add(sub);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        f.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        connect c = new connect();

        if (e.getSource() == sub) {
            try {
                String USN = t1.getText();
                String q = "SELECT * FROM STUDENT WHERE USN='" + USN + "'";
                ResultSet R = c.statement.executeQuery(q);
                if (R.next()) {
                    f.setVisible(false);
                    new S_login(USN);
                }
                else {
                    JOptionPane.showMessageDialog(null,"INVALID USN");
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }

        }

    public static void main(String[] args)
    {
        new student_login();
    }
}