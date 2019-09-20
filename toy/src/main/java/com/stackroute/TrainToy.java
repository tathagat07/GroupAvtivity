package com.stackroute;

import java.math.BigDecimal;

public class TrainToy extends Toy implements Movable {
    private String color;
    private BigDecimal price;

    public String getColor(){
        return super.color;
    }
    public BigDecimal getPrice(){
        return price;
    }

    @Override
    public void move() {
        System.out.println("This toy can Move on Rails");
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price=price;
    }
}
