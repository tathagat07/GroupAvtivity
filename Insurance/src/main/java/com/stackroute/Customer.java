package com.stackroute;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer extends Person {

    private Claim claimobj;

    Customer(String name,int age)
    {
        super(name,age);
        System.out.println("Customer Created with name: "+this.name);
    }

    public Claim getClaimobj() {
        return claimobj;
    }

    public void setClaimobj(Claim claimobj) {
        this.claimobj = claimobj;
    }






    /*public void setClaim(String type)
    {
        this.claimobj=new Claim(new SimpleDateFormat("dd/mm/yy").format(new Date()),type);
        claimList.add(this.claimobj);
        System.out.println("Succesfully Clamied Raised on: "+new SimpleDateFormat("dd/mm/yy").format(new Date()));
    }*/
}
