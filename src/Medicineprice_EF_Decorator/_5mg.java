package Medicineprice_EF_Decorator;

public class _5mg extends MedDecorator {
    
    public _5mg(Meds decoratedMeds) {
        super(decoratedMeds);
    }
    
    @Override
    public void fetchmeds(){
        
        super.fetchmeds();
        set5mg();
        getCost();      
    }
    
    private void set5mg(){ // Meds decoratedMeds in parameters
        // new thing
        // System.out.println("5 per tablet.");
    }
    
    
    // Tax for 5 Milligram meds
    @Override 
    public int getCost(){
        return super.getCost() + 5;
    }

    @Override 
    public String desc(){
        return super.desc() + "5 per tablet.";
        
    }   
}


