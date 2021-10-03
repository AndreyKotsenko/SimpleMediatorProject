package com.andrey;

public abstract class Mediator {

    public abstract void send(String msg, CreateYogurtProcess createYogurtProcess);

    public abstract void errorMessage(String msg);
}
