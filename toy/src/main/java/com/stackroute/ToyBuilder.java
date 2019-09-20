package com.stackroute;

import java.math.BigDecimal;

public class ToyBuilder {
    public static void main(String args[]){
//        CarToy a=new CarToy(); a.price=1.0; a.color="Blue";
//        TrainToy b=new TrainToy(); b.price=1.2; b.color="Green";
//        AirToy c=new AirToy(); c.price=1.3; c.color="Red";
        CarToy a=new CarToy(); a.setPrice(new BigDecimal(1.0));a.setColor();

        TrainToy b=new TrainToy(); b.setPrice(new BigDecimal(1.2));b.setColor();

        AirToy c=new AirToy(); c.setPrice(new BigDecimal(1.3));c.setColor();

        System.out.println("This is a Car Toy"+"\tPrice:"+a.getPrice()+"\tColor:"+a.getColor());a.move();
        System.out.println("This is a Train Toy"+"\tPrice:"+b.getPrice()+"\tColor:"+b.getColor());b.move();
        System.out.println("This is a Air Toy"+"\tPrice:"+c.getPrice()+"\tColor:"+c.getColor());c.move();c.fly();

    }
}
