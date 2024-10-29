package com.neoteric._4;

import java.util.Date;

public class AccountTest {

    public static void main(String[] args) {
        Account account=new Account("tarun","1234","acd123",new Date());

        System.out.println(account.getAccountHolderName()+" "+account.getAadharNo()+" "+account.getPanNo()+" " +account.getDob());


    }
}
