package Medicineprice_EF_Decorator;

public interface Meds {

    void fetchmeds();
    
    // Used to get the price of each medicine and adding tax based on the milligram choice 
    int getCost();
    
    // Used to get the needed information and pull it to a jLabel
    String desc();
    
}


