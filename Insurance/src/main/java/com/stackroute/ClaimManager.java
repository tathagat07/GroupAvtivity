package com.stackroute;

public class ClaimManager extends Person implements Manager {
    private Surveyor surveyor;
    ClaimManager(Surveyor surveyor, String name, int age)
    {
        super(name,age);
        this.surveyor=surveyor;
    }
    @Override
    public boolean approveRejectClaim(Claim claim)
    {
        claim=surveyor.validateClaim(claim);
        return claim.getStatus();
    }
}
