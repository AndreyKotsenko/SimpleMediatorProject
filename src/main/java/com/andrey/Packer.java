package com.andrey;

public class Packer extends CreateYogurtProcess{

    public Packer(Mediator mediator) {
        super(mediator);
    }

    public void doPack(){
        mediator.send("Pack is finished", this);
    }
}
