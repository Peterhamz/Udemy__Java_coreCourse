package Udemy__Debugging_Testing_18;

public class BankAccount_testing {
    private String firstName;
    private String lastName;
    private double balance;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    public BankAccount_testing(String firstName, String lastName, double balance, int typeOfAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = typeOfAccount;
    }
    // THE BRANCH ARGUMENT IS TRUE IF THE CUSTOMER IS PERFORMING THE TRANSACTION AT A BRANCH WITH A TELLER
    // IT'S FALSE IF THE CUSTOMER IS PERFORMING THE TRANSACTION AT AN ATM
    public double deposit(double amount, boolean branch){
        balance += amount;
        return balance;
    }
    // THE BRANCH ARGUMENT IS TRUE IF THE CUSTOMER IS PERFORMING THE TRANSACTION AT A BRANCH WITH A TELLER
    // IT'S FALSE IF THE CUSTOMER IS PERFORMING THE TRANSACTION AT AN ATM
    public double withdraw(double amount, boolean branch){
        balance -= amount;
        return balance;
    }
    public double getBalance(){
        return balance;
    }
    public boolean isChecking(){
        return accountType == CHECKING;
    }
    //more methods that use firstname, lastName, and perform other functions
}
