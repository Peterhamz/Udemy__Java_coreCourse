package Udemy__Packages_11;

import java.util.ArrayList;

public class Account {
    public String accountName;
    public int balance;
    public ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }
    public int getBalance(){
        return balance;
    }
    public void deposit(int amount){
        if (amount > 0){
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " Deposited. Balance is now " + this.balance);
        }else {
            System.out.println(" Can not deposit negative sums");
        }
    }

    public void withdraw(int amount){
        int withdrawal = -amount;
        if (withdrawal < 0){
            transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(amount + " withdrawn. Balance is now " + this.balance);
        }else {
            System.out.println(" Can not withdraw negative sums");
        }
    }
    public void calculateBalance(){
        this.balance = 0;
        for(int i : transactions){
            this.balance += i;
        }
        System.out.println("Calculated balance is " + this.balance);
    }

}
