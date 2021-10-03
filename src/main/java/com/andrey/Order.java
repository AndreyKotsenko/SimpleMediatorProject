package com.andrey;

public class Order extends CreateYogurtProcess{

    private double price;

    public Order(Mediator mediator) {
        super(mediator);
    }

    public void createOrder(double price){
        logger.info("Verify price");

        if( verifyPrice(price) ){
            this.price = price;
            mediator.send("Order created", this);
        } else{
            mediator.errorMessage("The price is too high!");
        }

    }

    public boolean verifyPrice(double desiredPrice){
        return desiredPrice <= 15.0;
    }
}
