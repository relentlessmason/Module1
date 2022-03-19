package com.techelevator;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }
    public CheckingAccount(String accountHolderName, String accountNumber, int balance){
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        int newBalance = getBalance();
        int fee = 10;
        if (getBalance() < 0 && getBalance() >= -100){
            newBalance = getBalance() - fee - amountToWithdraw;
            return newBalance;
        }
        else {return super.deposit(amountToWithdraw);}
    }
}