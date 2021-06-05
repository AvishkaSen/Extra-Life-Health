
package EL_Proxy;

import DesignP_Assignment_Common.mainpage;


public class Execute implements ProxyExecutor{

    
    @Override
    public void testexecute(String test1) throws Exception {
        System.out.println("The follwing feature will be available due to account having admin priviledges: " + test1);
        
        mainpage.jPanel6.setVisible(true);
        mainpage.jPanel7.setVisible(false);
        
    }
    
}


