package com.stackroute;

import java.math.BigDecimal;

public abstract class Toy {
    protected String color;
//    private String color;
    public abstract void setPrice(BigDecimal price);
    public void setColor(){
        this.color="blue";
    };


}
