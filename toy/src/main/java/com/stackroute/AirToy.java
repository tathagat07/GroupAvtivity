package com.stackroute;

import java.math.BigDecimal;

public class AirToy extends Toy implements Flyable, Movable {
    private BigDecimal price;

    public void setColor() {
        super.setColor();
    }

//    private String color;

    public String getColor(){
        return super.color;
    }
    public BigDecimal getPrice(){
        return price;
    }

    @Override
    public void move() {
        System.out.println("This toy can Move on Runway");
    }

    @Override
    public void fly() {
        System.out.println("This toy can Fly in Sky");
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price=price;
    }
}
