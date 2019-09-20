package com.stackroute;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Claim claim = new Claim(1,"Health Insurance Claim", false,new BigDecimal(100000));
        Customer customer= new Customer("Ritesh",22);
        customer.setClaimobj(claim);

        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor("Tathagat",23);
        ClaimManager claimManager= new ClaimManager(healthInsuranceSurveyor,"Rishav",24);
        Boolean result=claimManager.approveRejectClaim(claim);
        System.out.println(result);

        //simulating car insurance...

        Claim carClaim = new Claim(1,"Car Insurance Claim", false,new BigDecimal(10000));
        Customer customer2= new Customer("Prakhar",22);
        customer2.setClaimobj(carClaim);

        CarInsuranceSurveyor carInsuranceSurveyor = new CarInsuranceSurveyor("Roshan",23);
        ClaimManager claimManager2= new ClaimManager(carInsuranceSurveyor,"Rishav",24);
        Boolean result2=claimManager2.approveRejectClaim(claim);
        System.out.println(result2);




/*
        Customer customer = new Customer("Barun",22);
        customer.nowclaim("Health Insurance");


        ClaimManager claimManager = new ClaimManager("Semanta",40);

        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor("Tathagat",23);

        healthInsuranceSurveyor.validates_claim(customer, claimManager);

        customer.addclaim("Vechicle");

        System.out.println(customer.getClaimList());*/







    }
}
