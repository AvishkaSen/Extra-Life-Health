package Medicineprice_EF_Decorator;

public class Abenol implements Meds {

    @Override
    public void fetchmeds() {
        //System.out.println("Box of Abenol with the Milligram of ");
    }

    
    // base cost of Abenol
    @Override 
    public int getCost(){
        return 20;
    }
    
    
    // new stuff
    @Override
    public String desc(){
        return "Box of Abenol with the Milligram of ";
    }
    
}


