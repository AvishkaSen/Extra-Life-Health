package Signup_EL_Facade;

public class signupFacade {
    
    private signupinterface validatepass;
    private signupinterface clear;
    private signupinterface submittodb;
    
    
    public signupFacade() {
        validatepass = new validateSignup();
        clear = new signupClearall();
        submittodb = new Submittodb();
    }
    
    public void getSubmittodb(){
        submittodb.signupM();
    }
    
    public void getValidation(){
        validatepass.signupM();
    }
    public void getClearall(){
        clear.signupM();
    }
    
}

