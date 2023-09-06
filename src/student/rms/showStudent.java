package student.rms;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;


public class showStudent {
    JFrame f = new JFrame("REGISTERED STUDENTS");
    private JTable j;


    showStudent()
    {


        String[] col={"USN","NAME","BRANCH","SEMESTER","GENDER"};
        Object[][] D = fetchResult();

        j= new JTable(D,col);
        JScrollPane V=new JScrollPane(j);
        V.setBounds(30,30,530,600);

        f.setLayout(null);
        f.setBounds(0,0,800,600);
        f.add(V);
        f.setLocationRelativeTo(null);

        f.setVisible(true);
    }
    private Object[][] fetchResult()
    {
        connect c=new connect();
        Object[][] D = new Object[100][5];
        int R=0;
        try{
            String q= "SELECT * FROM STUDENT";
            ResultSet r=c.statement.executeQuery(q);
            while (r.next())
            {
                D[R][0]=r.getString("USN");
                D[R][1]=r.getString("SName");
                D[R][2]=r.getString("Branch");
                D[R][3]=r.getString("Semester");
                D[R][4]=r.getString("Gender");
                R++;
            }
        }
        catch(SQLException ex)
        {

            ex.printStackTrace();

        }
        return Arrays.copyOf(D,R);
    }

    public static void main(String[] args) {
        new showStudent();
    }
}
