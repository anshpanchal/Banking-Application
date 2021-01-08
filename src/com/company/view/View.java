package com.company.view;

import com.company.controler.Controler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class View {
    public void init(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(".......Welcome to Bank Application.........");
        System.out.println("1. Create New Account");
        System.out.println("2. Add Amount via Cash/Online");
        System.out.println("3. Withdraw Money Cash/Online/ATM");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");
        System.out.print("Select from the Bank Application:- ");
        int ch = scanner.nextInt();

        //Controller Object (Decomposition)
        Controler controler = new Controler();
        switch (ch){
            case 1:
                System.out.println("1. Create New Account");

                // User Input
                System.out.println("Enter Your Name to Create in Bank Account: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Enter the Amount you want to Add in Bank Account");
                double amount = scanner.nextDouble();
                // Calling new method account for controller
                controler.createNewAccount(name,amount);
                break;
            case 2:
                System.out.println("2.Add Amount via Cash/Online");
                System.out.println("Enter Your Amount to Add in your Bank Account:- ");
                double newAmount = scanner.nextDouble();
                System.out.println("Enter your Bank Account Number:-");
                int accountNumber = scanner.nextInt();
                System.out.println("Enter Your Mode of Transaction:-");
                scanner.nextLine();
                String modeOfTransaction = scanner.nextLine();
                String mode = "";
                System.out.println("1. Cash");
                System.out.println("2. Online");
                controler.addAmount(newAmount,modeOfTransaction,accountNumber);
                break;
            case 3:
                System.out.println("3.Withdraw Money Cash/Online/ATM");
                // account number, modeofT, Withdrawamount
                System.out.println("Amount to be Withdrawn from Bank Amount: ");
                double withdrawAmount = scanner.nextDouble();
                System.out.println("Enter Your Bank Account Number: ");
                long userAccountNumber = scanner.nextLong();
                System.out.println("Enter Your Mode of Transactions: ");
                scanner.nextLine();
                String withdrawModeOfTransaction = scanner.nextLine();

                String modeOfTran = "";
                System.out.println("1. Cash");
                System.out.println("2. Online");
                System.out.println("3. ATM");

                controler.withdrawAmount(userAccountNumber,withdrawModeOfTransaction,withdrawAmount);
                break;
            case 4:
                System.out.println("4.Check Balance");
                System.out.println("Enter Your Account Number: ");
                double accountNum = scanner.nextDouble();
                controler.checkBalance(accountNum);
                break;
            case 5:
                System.out.println("5.Exit");
                break;
            default:
                System.out.println("Invalid Choice");
        }

    }
}
