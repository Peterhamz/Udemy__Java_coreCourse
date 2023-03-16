package Udemy__Arrays__PhoneBook;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customers> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customers>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customers> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount){
       Customers newCustomer = findCustomer(customerName);
        if (newCustomer == null){
            this.customers.add(new Customers(customerName, initialAmount));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String customerName, double amount){
       Customers existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return true;
    }

    private Customers findCustomer(String customerName){
        for (int i = 0; i < this.customers.size(); i++){
            Customers checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }
}
