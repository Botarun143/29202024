package com.neoteric._4;

import java.util.Date;

public class Account {

    public String accountHolderName;
    public String aadharNo;
    public String panNo;
    public Date dob;

    public Account(){

    }
    public Account(String accountHolderName,String aadharNo,String panNo,Date dob){
        this.accountHolderName=accountHolderName;
        this.aadharNo=aadharNo;
        this.panNo=panNo;
        this.dob=dob;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public String getPanNo() {
        return panNo;
    }

    public Date getDob() {
        return dob;
    }
}
