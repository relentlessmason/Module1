package com.techelevator;
import java.util.ArrayList;
import java.util.List;
public class BankCustomer {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>(); ;
    ///////// getters /////////
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    ///////////// setters//////////
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    ///////// methods /////////////
    public Accountable[] getAccounts() {
        Accountable[] accountAsArray = new Accountable[accounts.size()];
        accountAsArray = accounts.toArray(accountAsArray);
        return accountAsArray;
    }
    public void addAccount(Accountable newAccount){
        accounts.add(newAccount);
    }
    public boolean isVip(){
        int total=0;
        for (Accountable eachAccount : accounts) {
            total += eachAccount.getBalance() ;
        }
        if (total >= 25000) {
            return true;
        }
        System.out.println(total);
        return false;
    }
}