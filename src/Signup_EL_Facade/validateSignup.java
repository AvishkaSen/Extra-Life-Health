package Signup_EL_Facade;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;


public class validateSignup implements signupinterface{
      
    @Override
    public void signupM() {

        String pass1 = signup.jPasswordField1.getText();
        String pass2 = signup.jPasswordField2.getText();
        
        if(!pass1.equals(pass2)) {
            // sets the password border to RED  
            signup.jPasswordField2.setBorder(new LineBorder (Color.RED)); 
        }
    }   
}


//signup.JOptionPane.showMessageDialog(this, "Your entered password does not match the original!");
