package Medicineprice_EF_Decorator;

public class _500mg extends MedDecorator {
    
    public _500mg(Meds decoratedMeds) {
        super(decoratedMeds);
    }
    
    @Override
    public void fetchmeds(){
        
        super.fetchmeds();
        set500mg();
        getCost();   
    }
    
    private void set500mg(){ // Meds decoratedMeds in parameters
        // new thing
        // System.out.println("500 per tablet.");
    }
     
    // Tax for 500 Milligram meds
    @Override 
    public int getCost(){
        return super.getCost() + 10;
    }
   
    @Override 
    public String desc(){
        return super.desc() + "500 per tablet.";
        
    }
    
}


