package com.stackroute;

public class Customer extends Person {

    private Claim claimObj;

    Customer(String name,int age)
    {
        super(name,age);
        System.out.println("Customer Created with name: "+this.name);
    }

    public Claim getClaimObj() {
        return claimObj;
    }

    public void setClaimObj(Claim claimObj) {
        this.claimObj = claimObj;
    }






    /*public void setClaim(String type)
    {
        this.claimobj=new Claim(new SimpleDateFormat("dd/mm/yy").format(new Date()),type);
        claimList.add(this.claimobj);
        System.out.println("Succesfully Clamied Raised on: "+new SimpleDateFormat("dd/mm/yy").format(new Date()));
    }*/
}
