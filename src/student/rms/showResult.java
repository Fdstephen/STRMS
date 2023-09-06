package student.rms;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;


public class showResult {
    JFrame f = new JFrame("ALL STUDENT RESULT DB");
    private JTable j;


    showResult()
    {


        String[] col={"USN","NAME","MATHS","DAA","DBMS","OS","UHV","ICO"};
        Object[][] D = fetchResult();



        f.setLayout(null);
        f.setBounds(0,0,800,600);


        j= new JTable(D,col);
        JScrollPane V=new JScrollPane(j);
        V.setBounds(30,30,600,500);
        f.add(V);
        f.setLocationRelativeTo(null);

        f.setVisible(true);
    }
    private Object[][] fetchResult()
    {
        connect c=new connect();
        Object[][] D = new Object[100][8];
        int R=0;
        try{

            String q= "SELECT * FROM ALLR";
            ResultSet r=c.statement.executeQuery(q);
            while (r.next())
            {
                D[R][0]=r.getString("USN");
                D[R][1]=r.getString("SName");
                D[R][2]=r.getString("Maths");
                D[R][3]=r.getString("DAA");
                D[R][4]=r.getString("DBMS");
                D[R][5]=r.getString("OS");
                D[R][6]=r.getString("UHV");
                D[R][7]=r.getString("ICO");

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
        new showResult();
    }
}
