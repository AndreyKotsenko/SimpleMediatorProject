package com.andrey;

public class Manufacturer extends CreateYogurtProcess{

    private boolean breakdowns = false;

    public Manufacturer(Mediator mediator) {
        super(mediator);
    }

    public void doManufacturer(){

        if(!breakdowns){
            mediator.send("Manufacture is finished", this);
        } else{
            mediator.errorMessage("Manufacture is breakdowns");
        }

    }

    public void setBreakdowns(boolean breakdowns){
        this.breakdowns = breakdowns;
    }
}
