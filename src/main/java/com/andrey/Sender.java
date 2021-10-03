package com.andrey;

public class Sender extends CreateYogurtProcess{

    public Sender(Mediator mediator) {
        super(mediator);
    }

    public void doSend(){
        mediator.send("Send is finished", this);
    }
}
