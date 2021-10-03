package com.andrey;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

public class ManagerMediator extends Mediator{

    private Order order;

    private TechnicalTask technicalTask;

    private Manufacturer manufacturer;

    private Packer packer;

    private Sender sender;

    private  final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void errorMessage(String msg){
        logger.info("Process is stopped: " + msg);
    }

    @Override
    public void send(String msg, CreateYogurtProcess createYogurtProcess) {

        logger.info(msg);

        if(createYogurtProcess == order){
            technicalTask.createTechnicalTask();
        } else if(createYogurtProcess == technicalTask){
            manufacturer.doManufacturer();
        }else if(createYogurtProcess == manufacturer){
            packer.doPack();
        }else if(createYogurtProcess == packer){
            sender.doSend();
        }else if(createYogurtProcess == sender){
            logger.info("Process is finished");
        }

    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setTechnicalTask(TechnicalTask technicalTask) {
        this.technicalTask = technicalTask;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPacker(Packer packer) {
        this.packer = packer;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

}
