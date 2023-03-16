package Udemy__LinkedList;

public class MainDemo {
    public static void main(String[] args) {
        Customer customer = new Customer("Peter", 232.2);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.34);
        anotherCustomer.setName("micheal");
        System.out.println(customer.getBalance() + "  " + customer.getName());
    }
}
