
package DesignP_Assignment_Common;

import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//Handles the connection to the database 
//singleton implementation
public class ConnectionManager {
      
    private static Connection connection; 
    
    public static Connection getConnection() {
        
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cb007077_ooae2","root","123"); 
            // username = root
            // password = 123
            
            System.out.println("Connection to the database is Successful"); 
        }
       catch(Exception e) {
           System.out.println("An error has occured connecting to the Database"); 
           e.printStackTrace();
        }
        return connection;
    }
    login log = new login();
}
        
     

