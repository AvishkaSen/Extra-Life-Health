
package EL_Proxy;

import DesignP_Assignment_Common.mainpage;

public class ExecuteProxy implements ProxyExecutor{
    
    boolean isAdmin;
    Execute execute;
    
    
    
    
    public ExecuteProxy(String username, String password) {
        
        if (username == "admin" && password == "admin123") {
            isAdmin = true;
        }
        execute = new Execute();
    }
    
    
    @Override
    public void testexecute(String test1) throws Exception {
        if(isAdmin) {
            
            execute.testexecute(test1);
            
        } else {
            
            if(test1.equals("AdminDetails")) {
                System.out.println("Certain access is blocked due to account not having administrator priviledges!");
                
                mainpage.jPanel6.setVisible(false);
                mainpage.jPanel7.setVisible(true);
                
            } else {
                execute.testexecute(test1);
                
            }
        }
    }
}


