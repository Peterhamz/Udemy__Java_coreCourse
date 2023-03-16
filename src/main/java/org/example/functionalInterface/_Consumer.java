package org.example.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "009090909");
        greetCustomer(maria);
        greetCustomer2(maria,false);

        greetCustomerConsumer.accept(maria);
        greetCustomerConsumer2.accept(maria,Boolean.TRUE);


    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumer2 = (customer, showNumber) ->
            System.out.println("hello "
            + customer.customerName
            + " you just registered " + (showNumber ? customer.customerPhoneNumber : "*******"));

    static Consumer<Customer> greetCustomerConsumer = customer ->  System.out.println("hello "
            + customer.customerName
            + " you just registered " + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer){
        System.out.println("hello " + customer.customerName + " you just registered " + customer.customerPhoneNumber);
    }

    static void greetCustomer2(Customer customer, Boolean showNumber){
        System.out.println("hello "
                + customer.customerName
                + " you just registered " + (showNumber ? customer.customerPhoneNumber : "*******"));
    }


    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
