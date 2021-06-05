package Medicineprice_EF_Decorator;

public class Aspirin implements Meds{
    
    
    @Override
    public void fetchmeds() {
        // System.out.print("Box of Aspirin with the milligram of ");
    } 
    
    // Base cost of Aspirin
    @Override 
    public int getCost(){
        return 10;
    }
    
    
    @Override
    public String desc(){
        return "Box of Aspirin with the milligram of ";
    }
    
}
