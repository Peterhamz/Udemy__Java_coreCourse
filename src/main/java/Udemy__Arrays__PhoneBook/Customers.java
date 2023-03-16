package Udemy__Arrays__PhoneBook;

import java.util.ArrayList;

public class Customers {
    private String name;
    private ArrayList<Double> transaction;

    public Customers(String name, double initialAmount) {
        this.name = name;
        this.transaction = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount){
        this.transaction.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }
}
