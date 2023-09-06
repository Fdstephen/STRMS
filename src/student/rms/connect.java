package student.rms;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;

public class connect{
    Connection connection;
    Statement statement;
    public connect(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/dbsr","root","Sjec4441#");
            System.out.println("Connected to the database!");
            statement = connection.createStatement();
        }
        catch(Exception ex)
        {
            System.err.println("Error connecting to the database: " + ex.getMessage());
        }

    }

    public static void main(String[] args) {

    }

}