package com.company;

import java.util.ArrayList;

public class Account {
    //name of the account
    private String name;
    //current balance of the account
    private double balance;
    //account ID number
    private String uuid;
    //user object that owns the account
    private user holder;
    //list of transactions for this account
    private ArrayList<Transcation> transcactions;
    public Account(String name,user holder,Bank theBank) {
      this.name = name;
      this.holder = holder;

      this.uuid = theBank.getNewAccountUUID();
      this.transcactions = new ArrayList<Transcation>();


    }
public String getUUID(){
        return this.uuid;
}

}
