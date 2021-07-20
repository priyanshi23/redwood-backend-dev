package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       String accInfo = "accountInfo.csv";
       File file = new File(accInfo);
       try {
           Scanner input = new Scanner(file);
           while (input.hasNext()) {
               String data = input.next();
               Scanner cin = new Scanner(System.in);
           }
           input.close();

       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
       String uname = "Billy";
       String password = "billy";
       Scanner lol = new Scanner(System.in);
       String value = lol.next();
       String pswd = lol.next();
       String menu = " ";
       int bal = 0;
       int withdrawl = 0;
       int money = bal - withdrawl;
       int deposit = 0;
       int deposited = bal + deposit;
       if(uname == password) {
           System.out.println("Welcome to the bank");
           System.out.println("Menu: Please choose the desired service");
           switch (menu) {
               case "A":
                   System.out.println("Check Balance");
                   break;
               case "B":
                   System.out.println("Deposit");
                   System.out.println("The money Deposited is" + deposited);
                   break;
               case "C":
                   System.out.println("Withdraw money");
                   System.out.println("The money withdrawn is: " + money);
                   break;
               case "D":
                   System.out.println("Transfer money");
                   System.out.println("Please enter the account number and the amount to be transferred");
                   String accNum = lol.next();
                   String amt = lol.next();
               case "E":
                   System.out.println("Transaction successful");
                   break;
               default:
                   System.out.println("All the processes have been successfully completed");
           }
       }
       else {
           System.out.println("Password or the username is wrong");
       }
    }

}
