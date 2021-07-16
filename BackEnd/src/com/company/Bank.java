package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Bank {
    private String name;
    private ArrayList<user> users;
    private ArrayList<Account> accounts;
    public  String getNewUserUUID() {
        String uuid = " ";
        Random rng = new Random();
        int length = 6;
        boolean nonUnique;

        do {
            uuid = " ";
            for (int c = 0;c < length;c++){
                uuid += ((Integer)rng.nextInt(10)).toString();
            }
            nonUnique = false;
            for (user u : this.users){
                if (uuid.compareTo(u.getUUID())== 0) {
                    nonUnique = true;
                    break;
                }
            }
        } while (nonUnique);

        return uuid;
    }
   public String getNewAccountUUID() {

   }
public user addUser(String fname,String lname,String pin) {
        user newUser = new user(fname,lname,pin,this);
        this.users.add(newUser);
        Account newAcc = new Account("Savings",newUser,this);
        newUser.addAccount(newAcc);
        this.addAccount(newAcc);
}
}
