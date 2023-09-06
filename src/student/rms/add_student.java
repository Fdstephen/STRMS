package student.rms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class add_student implements ActionListener {
    JFrame f;
    JLabel j1,j2,j3,j4,j5;
    JTextField t1,t2,t3,t4,t5;
    JButton b;
    add_student()
    {
        f=new JFrame("ADD STUDENT DETAILS");
        f.setLayout(null);
        f.setBounds(0,0,800,600);

        j1=new JLabel("USN                   :");
        j1.setBounds(200,150,100,25);

        j2=new JLabel("Student Name  :");
        j2.setBounds(200,200,100,25);

        j3=new JLabel("Branch              :");
        j3.setBounds(200,250,100,25);



        j4=new JLabel("Semester          :");
        j4.setBounds(200,300,100,25);



        j5=new JLabel("Gender             :");
        j5.setBounds(200,350,150,25);

        t1 = new JTextField();
        t1.setBounds(300,150,150,25);

        t2=new JTextField();
        t2.setBounds(300,200,150,25);

        t3=new JTextField();
        t3.setBounds(300,250,150,25);

        t4= new JTextField();
        t4.setBounds(300,300,150,25);

        t5=new JTextField();
        t5.setBounds(300,350,150,25);

        b=new JButton("SUBMIT");
        b.addActionListener(this);
        b.setBounds(275,400,100,25);

        f.add(j1);
        f.add(j2);
        f.add(j3);
        f.add(j4);
        f.add(j5);

        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);

        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        System.out.println("Hello");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b) {
            String USN;

            String sname;
            String Branch;
            String sem;
            String gender;

            USN = t1.getText();
            System.out.println(USN);
            sname = t2.getText();
            Branch = t3.getText();
            sem = t4.getText();
            gender = t5.getText();

            try {
                if(t1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"please fill every field");
                }
                else {

                    try {
                        connect c = new connect();
                        String q = "INSERT INTO STUDENT(USN,SName,Branch,Semester,Gender)" + "VALUES('" + USN + "','" + sname + "','" + Branch + "','" + sem + "','" + gender + "')";
                        c.statement.executeUpdate(q);


                        //new A_login();
                    }
                    catch (SQLException ex) {
                        ex.printStackTrace();
                        System.out.println("SQL State: " + ex.getSQLState());
                        System.out.println("Error Code: " + ex.getErrorCode());
                        System.out.println("Message: " + ex.getMessage());
                    }
                }
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);
            t4.setText(null);
            t5.setText(null);
        }



        }

    public static void main(String[] args)
    {
        new add_student();
    }
}
