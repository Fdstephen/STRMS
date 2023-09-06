package student.rms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class deletedetails implements ActionListener {
    JFrame f=new JFrame();

    JLabel j1;

    JTextField t1;
    JButton b1;

    deletedetails()
    {
        f.setLayout(null);
        f.setBounds(0,0,800,600);
        f.setTitle("DELETE DETAILS");

        j1=new JLabel("ENTER THE USN : ");
        j1.setBounds(150,150,200,25);
        f.add(j1);

        t1 = new JTextField();
        t1.setBounds(270,150,150,25);
        f.add(t1);

        b1 = new JButton("DELETE");
        b1.setBounds(225,200,100,25);
        f.add(b1);

        b1.addActionListener(this);
        f.setLocationRelativeTo(null);

        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String USN;
            USN = t1.getText();
            try {
                if(t1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"please fill every field");
                }
                else {

                    try {
                        connect c = new connect();
                        String q = "DELETE FROM RESULT WHERE USN='"+USN+"'";
                        c.statement.executeUpdate(q);
                        String s= "DELETE FROM ALLR WHERE USN='"+USN+"'";
                        c.statement.executeUpdate(s);
                        String r="DELETE FROM STUDENT WHERE USN='"+USN+"'";
                        c.statement.executeUpdate(r);

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
        }
    }

    public static void main(String[] args)
    {
        new deletedetails();
    }
}
