package com.company.controler;

import java.util.Scanner;

public class Controler {

    public void createNewAccount(String name, double amount){
        System.out.println("Wait.... Your Account is Being Processed");
        System.out.println("Your Name is: " + name);
        System.out.println("Your Amount is: " + amount);

    }
    public void addAmount(double newAmount, String modeOfTransaction, int accountNumber) {
        System.out.println("New Amount is: " + newAmount);
        System.out.println("Mode of Transaction: " + modeOfTransaction);
        System.out.println("Account Number is: " + accountNumber);
    }

    public void withdrawAmount(long userAccountNumber, String withdrawModeOfTransaction, double withdrawAmount) {
        System.out.println("Your Account Number : "+ userAccountNumber);
        System.out.println("Mode of Transaction: " +  withdrawModeOfTransaction);
        System.out.println("Amount Withdrawn from Your Account is: " + withdrawAmount);
    }

    public void checkBalance(double accountNum) {
        System.out.println("Available Balance in your Bank Account is: " + accountNum);
    }
}
