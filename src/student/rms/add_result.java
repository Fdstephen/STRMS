package student.rms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class add_result implements ActionListener {
    JFrame f;
    JLabel j1, j2, j3, j4, j5, j6, j7,j25,j9,j15,j35,j45,j55,j65,j75,j95;
    JTextField t1, t2, t3, t4, t5, t6, t7,t9;
    JButton b;


    add_result() {
        f = new JFrame("ADD STUDENT RESULT");
        f.setLayout(null);
        f.setBounds(0, 0, 800, 600);

        j1 = new JLabel("USN:");
        j1.setBounds(200, 100, 100, 25);
        j15=new JLabel(":");
        j15.setBounds(310,100,20,20);

        j9 = new JLabel("Student Name");
        j9.setBounds(200, 150, 100, 25);
        j95=new JLabel(":");
        j95.setBounds(310,150,20,20);

        j2 = new JLabel("Maths");
        j2.setBounds(200, 200, 100, 25);
        j25=new JLabel(":");
        j25.setBounds(310,200,20,20);

        j3 = new JLabel("DAA");
        j3.setBounds(200, 250, 100, 25);
        j35=new JLabel(":");
        j35.setBounds(310,250,20,20);

        j4 = new JLabel("DBMS               ");
        j4.setBounds(200, 300, 100, 25);
        j45=new JLabel(":");
        j45.setBounds(310,300,20,20);

        j5 = new JLabel("OS                 ");
        j5.setBounds(200, 350, 100, 25);
        j55=new JLabel(":");
        j55.setBounds(310,350,20,20);

        j6 = new JLabel("UHV          ");
        j6.setBounds(200, 400, 100, 25);
        j65=new JLabel(":");
        j65.setBounds(310,400,20,20);

        j7 = new JLabel("CONSTITUTION     ");
        j7.setBounds(200, 450, 120, 25);
        j75=new JLabel(":");
        j75.setBounds(310,450,20,20);

        t1 = new JTextField();
        t1.setBounds(330, 100, 150, 25);

        t9 = new JTextField();
        t9.setBounds(330, 150, 150, 25);

        t2 = new JTextField();
        t2.setBounds(330, 200, 150, 25);

        t3 = new JTextField();
        t3.setBounds(330, 250, 150, 25);

        t4 = new JTextField();
        t4.setBounds(330, 300, 150, 25);

        t5 = new JTextField();
        t5.setBounds(330, 350, 150, 25);

        t6 = new JTextField();
        t6.setBounds(330, 400, 150, 25);

        t7 = new JTextField();
        t7.setBounds(330, 450, 150, 25);

        b = new JButton("SUBMIT");
        b.setBounds(275, 500, 100, 25);
        b.addActionListener(this);

        f.add(j1);
        f.add(j2);

        f.add(j3);
        f.add(j4);
        f.add(j5);
        f.add(j6);
        f.add(j7);
        f.add(j9);

        f.add(j15);
        f.add(j25);
        f.add(j35);
        f.add(j45);
        f.add(j55);
        f.add(j65);
        f.add(j75);
        f.add(j95);

        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        f.add(t7);
        f.add(t9);

        f.add(b);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        System.out.println("Hello");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            String USN;

            String Subid1;
            String Subid2;
            String Subid3;
            String Subid4;
            String Subid5;
            String Subid6;
            String SName;

            String m1, m2, m3, m4, m5, m6;
            m1 = t2.getText();
            m2 = t3.getText();
            m3 = t4.getText();
            m4 = t5.getText();
            m5 = t6.getText();
            m6 = t7.getText();


            USN = t1.getText();
            System.out.println(USN);
            Subid1 = "CS401";
            Subid2 = "CS402";
            Subid3 = "CS403";
            Subid4 = "CS404";
            Subid5 = "UHV405";
            Subid6 = "ICO406";
            SName=t9.getText();

            //"delete from result where USN='"+USN[t1.getText]+"'"


            try {
                if (t1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "please fill every field");
                } else {

                    try {
                        connect c = new connect();
                        String q = "INSERT INTO RESULT(USN,Subid,Marks)" + "VALUES('" + USN + "','" + Subid1 + "','" + m1 + "')";
                        String r = "INSERT INTO RESULT(USN,Subid,Marks)" + "VALUES('" + USN + "','" + Subid2 + "','" + m2 + "')";
                        String s = "INSERT INTO RESULT(USN,Subid,Marks)" + "VALUES('" + USN + "','" + Subid3 + "','" + m3 + "')";
                        String t = "INSERT INTO RESULT(USN,Subid,Marks)" + "VALUES('" + USN + "','" + Subid4 + "','" + m4 + "')";
                        String u = "INSERT INTO RESULT(USN,Subid,Marks)" + "VALUES('" + USN + "','" + Subid5 + "','" + m5 + "')";
                        String v = "INSERT INTO RESULT(USN,Subid,Marks)" + "VALUES('" + USN + "','" + Subid6 + "','" + m6 + "')";
                        c.statement.executeUpdate(q);
                        c.statement.executeUpdate(r);
                        c.statement.executeUpdate(s);
                        c.statement.executeUpdate(t);
                        c.statement.executeUpdate(u);
                        c.statement.executeUpdate(v);

                        String z="INSERT INTO ALLR(USN,SName,Maths,DAA,DBMS,OS,UHV,ICO)"+"VALUES('"+USN+"','"+SName+"','"+m1+"','"+m2+"','"+m3+"','"+m4+"','"+m5+"','"+m6+"')";
                        c.statement.executeUpdate(z);


                    } catch (SQLException ex) {
                        ex.printStackTrace();
                        System.out.println("SQL State: " + ex.getSQLState());
                        System.out.println("Error Code: " + ex.getErrorCode());
                        System.out.println("Message: " + ex.getMessage());
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);
            t4.setText(null);
            t5.setText(null);
            t6.setText(null);
            t7.setText(null);
            t9.setText(null);
        }
    }


    public static void main(String[] args) {
        new add_result();
    }

}
