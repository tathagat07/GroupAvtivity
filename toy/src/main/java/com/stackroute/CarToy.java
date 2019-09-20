package com.stackroute;

import java.math.BigDecimal;

public class CarToy extends Toy  implements Movable {
    private BigDecimal price;

    public String getcolor(){
        return super.color;
    }

    public String getColor(){
        return color;
    }
    public BigDecimal getPrice(){
        return price;
    }
    @Override
    public void move() {
        System.out.println("This toy can Move on Roads");
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price=price;
    }

//    @Override
//    public void setColor(String color) {
//        this.color=color;
//    }
}
