package Medicineprice_EF_Decorator;

abstract class MedDecorator implements Meds {

    protected Meds decoratedMeds;
    
    public MedDecorator(Meds decoratedMeds) {
        this.decoratedMeds = decoratedMeds;
    }
   
    
    @Override 
    public void fetchmeds() {
        decoratedMeds.fetchmeds();
    }
    
    
    @Override 
    public int getCost(){
        return decoratedMeds.getCost();
    }
    
    
    @Override
    public String desc() {
        return decoratedMeds.desc();
    }
    
}

