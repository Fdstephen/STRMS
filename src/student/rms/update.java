package student.rms;

import javax.swing.*;

public class update
{
    JFrame f=new JFrame();
    JLabel j1, j2, j3, j4, j5, j6, j7,j25,j9,j15,j35,j45,j55,j65,j75,j95;
    JTextField t1, t2, t3, t4, t5, t6, t7,t9;
    JButton b;
    JButton d1,d2,d3,d4,d5,d6;
    update()
    {
        f.setLayout(null);
        f.setBounds(0,0,800,600);
        f.setTitle("ADMIN DASHBOARD");

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
        //b.addActionListener(this);

        d1=new JButton("UPDATE");
        d1.setBounds(500, 200, 100, 25);

        d2=new JButton("UPDATE");
        d2.setBounds(500, 250, 100, 25);

        d3=new JButton("UPDATE");
        d3.setBounds(500, 300, 100, 25);

        d4=new JButton("UPDATE");
        d4.setBounds(500, 350, 100, 25);

        d5=new JButton("UPDATE");
        d5.setBounds(500, 400, 100, 25);

        d6=new JButton("UPDATE");
        d6.setBounds(500, 450, 100, 25);

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

        f.add(d1);
        f.add(d2);
        f.add(d3);
        f.add(d4);
        f.add(d5);
        f.add(d6);

        f.add(b);
        f.setLocationRelativeTo(null);

        f.setVisible(true);
    }
    public static void main(String[] args) {
        new update();
    }
}
