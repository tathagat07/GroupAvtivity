package com.stackroute;

public class Sw1tch {
    private Bulb bulb;
    private boolean curPosition;

    public Sw1tch(Bulb bulb) {
        this.bulb = bulb;
    }

    public void toggle() {
        if(curPosition == true) {
            this.curPosition = false;
            bulb.off();
        }
        else {
            this.curPosition = true;
            bulb.on();
        }
    }
}
