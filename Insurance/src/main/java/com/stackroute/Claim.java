package com.stackroute;

import java.math.BigDecimal;
import java.util.Date;

public class Claim {

    private int id;
    private String claimType;
    private boolean status;
    private BigDecimal claimAmount;

    public Claim(int id, String claimType, boolean status, BigDecimal claimAmount) {
        this.id = id;
        this.claimType = claimType;
        this.status = status;
        this.claimAmount = claimAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }


    public BigDecimal getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(BigDecimal claimAmount) {
        this.claimAmount = claimAmount;
    }







}
