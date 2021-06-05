package Medicineprice_EF_Decorator;

public class _250mg extends MedDecorator {
    
    public _250mg(Meds decoratedMeds) {
        super(decoratedMeds);
    }
    
    @Override
    public void fetchmeds(){
        
        super.fetchmeds();
        set250mg();
        getCost();
    }
    
    private void set250mg(){ // Meds decoratedMeds in parameters
        // new thing
        // System.out.print("250 per tablet.");
    }
    
    // Tax for 250 Milligram meds
    @Override 
    public int getCost(){
        return super.getCost() + 7;
    }
    
    @Override 
    public String desc(){
        return super.desc() + "250 per tablet.";
        
    }
  
}

