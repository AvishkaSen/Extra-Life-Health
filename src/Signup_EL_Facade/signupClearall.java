package Signup_EL_Facade;

import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class signupClearall implements signupinterface {
     
    @Override
    public void signupM() {   
        signup.jTextField1.setText("");
        signup.jTextField2.setText("");
        signup.jTextField3.setText("");
        signup.jPasswordField1.setText("");
        signup.jPasswordField2.setText("");
    }
}


