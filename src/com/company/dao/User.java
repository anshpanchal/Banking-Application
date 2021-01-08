package com.company.dao;

public class User {
    int account_number;
    String name;
    double balance;
    public User(int accountNumber, String name, double balance){
        this.account_number = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return account_number;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
