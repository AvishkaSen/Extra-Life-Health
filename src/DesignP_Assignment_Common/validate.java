
package DesignP_Assignment_Common;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class validate {
    
    // Variable section
    Connection connection = null;
    
     
    public void getValidation(String textfield, String password){
        
        // Login object to get fields in Login class
        login log = new login(textfield,password);
        login log2 = new login();
        
        //Singleton
        connection = ConnectionManager.getConnection();
        
        try {
            
            String query = "select Fname, username, pword from registrations where username ='"+ log.getUname() +"' and pword ='"+ log.getPword() +"'";
            
            Statement st = connection.createStatement();
            ResultSet set = st.executeQuery(query);
            
            if(!set.next())
            {
                // if login details do not match
                log.jTextField1.setBorder(new LineBorder (Color.RED)); // changes the border colour
                log.jPasswordField1.setBorder(new LineBorder (Color.RED)); // changes the border colour                
            } else {
                // if login information is valid, go to the homepage with options   
                mainpage m1 = new mainpage();
                
                m1.welcomeusername.setText(set.getString("Fname"));
                m1.setVisible(true);
            }      
        } catch (Exception e){
            System.out.println("An error has occured");
            e.printStackTrace();
        }    
    }     
}


//JOptionPane.showMessageDialog(this,"Your passwords don't match!");