package com.andrey;

public class TechnicalTask extends CreateYogurtProcess{

    public TechnicalTask(Mediator mediator) {
        super(mediator);
    }

    public void createTechnicalTask(){
        mediator.send("Technical Task created", this);
    }
}
