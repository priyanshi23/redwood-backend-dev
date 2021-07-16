package com.company;

import java.util.Date;

public class Transactions {
    //name of this transaction
    private double amt;
    //time and date of this transaction
    private Date timeStamp;
    //memo for this transaction
    private String memo;
    //acc in which transaction was performed
    private Account inAcc;

    public Transactions(double amt,Account inAcc) {
                    this.amt = amt;
                    this.inAcc = inAcc;
                    this.timeStamp = new Date();
                    this.memo = " ";
    }

public Transactions(double amt,String memo,Account inAcc) {
this(amount,inAcc);
this.memo = memo;
}
}
