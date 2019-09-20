package com.stackroute;

public class HealthInsuranceSurveyor extends Person implements Surveyor {
    HealthInsuranceSurveyor(String name, int age)
    {
        super(name,age);
    }
    @Override
    public Claim validateClaim(Claim claimobj)
    {
        //if validation is done by surveyor then managerobj.approve(person)
        //else return 0;

        if(claimobj.getClaimAmount().doubleValue() > 80000)
        {
            claimobj.setStatus(false);
            return claimobj;
        }
        else
        {
            claimobj.setStatus(true);
            return claimobj;
        }
    }
}
