package com.andrey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class CreateYogurtProcess {
    Mediator mediator;

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public CreateYogurtProcess(Mediator mediator){
        this.mediator = mediator;
    }

}
