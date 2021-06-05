package EL_Proxy;

public interface ProxyExecutor {
    
    // used to restrict access per user depending on admin priviledges 
    public void testexecute(String test) throws Exception;
    
}


