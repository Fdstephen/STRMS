package student.rms;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;


public class S_login {
    JFrame f = new JFrame("ALL STUDENT RESULT DB");
    private JTable j;
    JLabel U,N,B,S,G;
    JLabel u1,n1,b1,s1,g1;
    JLabel U1,N1,B1,S1,G1;
    String usn;


    S_login(String USN) {
        connect c = new connect();
        this.usn = USN;
        String[] col = {"COURSE CODE", "TITLE", "MARKS", "CREDITS"};
        Object[][] D = fetchResult();

        U = new JLabel("USN");
        U.setBounds(200, 30, 100, 25);
        n1 = new JLabel();
        n1.setBounds(300, 60, 100, 25);

        N = new JLabel("NAME");
        N.setBounds(200, 60, 100, 25);

        B = new JLabel("BRANCH");
        B.setBounds(200, 90, 100, 25);
        b1=new JLabel();
        b1.setBounds(300, 90, 100, 25);

        S = new JLabel("SEMESTER");
        S.setBounds(200, 120, 100, 25);
        s1=new JLabel();
        s1.setBounds(300, 120, 100, 25);

        G=new JLabel("GENDER");
        G.setBounds(200, 150, 100, 25);
        g1=new JLabel();
        g1.setBounds(300, 150, 100, 25);

        U1=new JLabel(":");
        U1.setBounds(280,30,20,20);

        N1=new JLabel(":");
        N1.setBounds(280,60,20,20);

        B1=new JLabel(":");
        B1.setBounds(280,90,20,20);

        S1=new JLabel(":");
        S1.setBounds(280,120,20,20);

        G1=new JLabel(":");
        G1.setBounds(280,150,20,20);



        try {

            String q1 = "SELECT SNAME FROM STUDENT WHERE USN='" + usn + "'";
            ResultSet R= c.statement.executeQuery(q1);
            if(R.next())
            {
                String w=R.getString("SNAME");
                n1.setText(w);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        try {

            String q2 = "SELECT BRANCH FROM STUDENT WHERE USN='" + usn + "'";
            ResultSet E= c.statement.executeQuery(q2);
            if(E.next())
            {
                String s=E.getString("BRANCH");
                b1.setText(s);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        try {

            String q3 = "SELECT SEMESTER FROM STUDENT WHERE USN='" + usn + "'";
            ResultSet F= c.statement.executeQuery(q3);
            if(F.next())
            {
                String es=F.getString("SEMESTER");
                s1.setText(es);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        try {

            String q4 = "SELECT GENDER FROM STUDENT WHERE USN='" + usn + "'";
            ResultSet P= c.statement.executeQuery(q4);
            if(P.next())
            {
                String y=P.getString("GENDER");
                g1.setText(y);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }





        f.setLayout(null);
        f.setBounds(0, 0, 800, 600);


        j = new JTable(D, col);
        JScrollPane V = new JScrollPane(j);
        V.setBounds(100, 250, 600, 119);
        f.add(V);
        f.setLocationRelativeTo(null);

        String q = null;

        u1 = new JLabel(usn);
        u1.setBounds(300, 30, 100, 25);

        f.add(U);
        f.add(N);
        f.add(B);
        f.add(S);
        f.add(G);

        f.add(U1);
        f.add(N1);
        f.add(B1);
        f.add(S1);
        f.add(G1);

        f.add(u1);
        f.add(n1);
        f.add(b1);
        f.add(s1);
        f.add(g1);

        f.setVisible(true);
    }
    private Object[][] fetchResult()
    {

        connect c=new connect();
        Object[][] D = new Object[100][8];
        int R=0;
        try{

            String q= "SELECT S.Subid,S.Subname,R.Marks,S.Credits from SUBJECT AS S,RESULT AS R WHERE S.Subid=R.Subid AND USN='"+usn+"'";
            ResultSet r=c.statement.executeQuery(q);
            while (r.next())
            {
                D[R][0]=r.getString("Subid");
                D[R][1]=r.getString("Subname");
                D[R][2]=r.getString("Marks");
                D[R][3]=r.getString("Credits");
                R++;
            }
        }
        catch(SQLException ex)
        {

            ex.printStackTrace();

        }
        return Arrays.copyOf(D,R);
    }

    public static void main(String[] args)
    {
        new S_login("");
    }
}
