package com.company;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class user {
    //first name of the user
    private String fName;
    //last name of the user
    private String lName;
    //ID number of the user
    private String uUid;
    //hash pin of the user of the user
    private byte pin;
    //list of accounts for the user
    private ArrayList<Account> accounts;
    public user(String fName,String lName,String pin,Bank theBank) {
        //set user's name
        this.fname = fname;
        this.lname = lName;
        //store the pin's MD5 hash

        try {
            MessageDigest msg = MessageDigest.getInstance("MD5");
            this.pin = md.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException e) {
            System.err.Println("error,NoSuchException");
            e.printStackTrace();
            System.exit(1);
        }
        this.uUid = theBank.getNewUserUUID();
        this.accounts = new ArrayList<Account>();
        System.out.Printf("New user %s,%s with ID %s created.\n",lName,fName,this.uUid);
    }
 public void addAccount(Account anAcct) {
     this.accounts.add(anAcct);
 }
 public String getUUID() {
        return  this.uUid;
 }
}
