package com.stackroute;

public class Operator {

    public static void main(String[] args) {

        Bulb bulb = new Bulb();
        Sw1tch sw1tch = new Sw1tch(bulb);
        sw1tch.toggle();
        sw1tch.toggle();
        sw1tch.toggle();
        sw1tch.toggle();
        sw1tch.toggle();
        sw1tch.toggle();

        //simulating fan
        Fan fan = new Fan();
        Sw1tch sw1tc2h = new Sw1tch(fan);
        sw1tch.toggle();
        sw1tch.toggle();
        sw1tch.toggle();
        sw1tch.toggle();
        sw1tch.toggle();
        sw1tch.toggle();
    }
}
