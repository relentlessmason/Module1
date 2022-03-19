package com.techelevator;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }
    public SavingsAccount(String accountHolderName, String accountNumber, int balance){
        super(accountHolderName, accountNumber, balance);
    }

    public int withdraw(int amountToWithdraw){
        int savingsFee = 2;
        if(getBalance() - amountToWithdraw >= 150) {
            super.withdraw(amountToWithdraw);}
        if (getBalance() - amountToWithdraw < 150) {
            if (getBalance() - amountToWithdraw - savingsFee < 0)
                return getBalance();
            else {
                super.withdraw(amountToWithdraw + savingsFee);

            }
        } return getBalance();
    }
}