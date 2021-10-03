package com.andrey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleMediatorProjectClass {

    private static Logger logger = LoggerFactory.getLogger(SimpleMediatorProjectClass.class);

    public static void main(String[] args){
        ManagerMediator mediator = new ManagerMediator();
        Order order = new Order(mediator);
        TechnicalTask technicalTask = new TechnicalTask(mediator);
        Manufacturer manufacturer = new Manufacturer(mediator);
        Packer packer = new Packer(mediator);
        Sender sender = new Sender(mediator);

        mediator.setOrder(order);
        mediator.setTechnicalTask(technicalTask);
        mediator.setManufacturer(manufacturer);
        mediator.setPacker(packer);
        mediator.setSender(sender);


        logger.info("-----First-----");
        order.createOrder(12);
        logger.info("\n");

        logger.info("-----Second-----");
        order.createOrder(18);
        logger.info("\n");

        manufacturer.setBreakdowns(true);
        order.createOrder(10);
        logger.info("\n");



    }
}
