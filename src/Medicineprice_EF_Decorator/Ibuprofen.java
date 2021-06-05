package Medicineprice_EF_Decorator;

public class Ibuprofen implements Meds {

    @Override
    public void fetchmeds() {
        //System.out.println("Box of Ibuprofen with the Miligram of ");
    }
    
    
    //Base cost of Ibuprofen
    @Override 
    public int getCost(){
        return 30;
    }
   
    // new stuff
    @Override
    public String desc(){
        return "Box of Ibuprofen with the Miligram of ";
    }
    
}
