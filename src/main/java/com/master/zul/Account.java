package com.master.zul;

public class Account {

    public String accountNo;
    public float balance;
    public String type;

    public Account(String accountNo) {
        this.accountNo = accountNo;
    }



    public Account(String accountNo, float balance){
        this.accountNo = accountNo;
        this.balance = balance;
        type = "checking";
    }
}
