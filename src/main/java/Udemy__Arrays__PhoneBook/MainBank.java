package Udemy__Arrays__PhoneBook;

public class MainBank {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australian Bank");

        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim",23.32);
        bank.addCustomer("Adelaide", "Peter",82.33);
        bank.addCustomer("Adelaide", "Yome",245.78);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bola",83.45);

        bank.addCustomerTransaction("Adelaide", "Peter", 44.22);
        bank.addCustomerTransaction("Adelaide", "Peter", 565.33);
        bank.addCustomerTransaction("Adelaide", "Yome", 5.333);


        bank.listCustomers("Adelaide",true);
    }
}
