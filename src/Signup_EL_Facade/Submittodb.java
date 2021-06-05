package Signup_EL_Facade;

import DesignP_Assignment_Common.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Submittodb implements signupinterface{
    
    Connection connection = null;
    
    @Override
    public void signupM(){
        
        try {
            
            // pulls the getConnection method from the ConnectionManager class for the database. 
            // making this a singleton pattern
            connection = ConnectionManager.getConnection();
            
            String query = "insert into registrations values(?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            
            ps.setString(1, signup.jTextField1.getText()); // Name
            ps.setString(2, signup.jTextField2.getText()); // Username 
            ps.setString(3, signup.jPasswordField1.getText()); // Password
            ps.setString(4, signup.jPasswordField2.getText()); // Confirm Password
            ps.setString(5, signup.jTextField3.getText()); // Email
            
            int i = ps.executeUpdate();
            
            if (i > 0) {
                // find a way to pull a joption pane message from a separate class
                //JOptionPane.showMessageDialog(this,"Your account has been created and saved!");
                System.out.println("Submission to database successful");
            }
            
        } catch (SQLException e) {
            
            System.out.println("Submission to database has failed");            
        }
    }
}

