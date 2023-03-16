package Udemy__Debugging_Testing_18;


import static junit.framework.TestCase.*;

public class bankAccountTestingTest {

    private BankAccount_testing account;

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before any test cases");
    }

    @org.junit.Before
    public void setUp(){
         account = new BankAccount_testing("Peter", "James", 1000.00, BankAccount_testing.CHECKING);
        System.out.println("Running a test...");
    }

    @org.junit.Test
    public void deposit() {
        double balance = account.deposit(500, true);
       assertEquals(1500.00, balance, 0);

    }

    @org.junit.Test
    public void withdraw() {
        double balance = account.withdraw(600,true);
        assertEquals(400, balance, 0);
    }

    @org.junit.Test
    public void getBalance() {
        account.deposit(500, true);
        assertEquals(1500.00, account.getBalance(), 0);
    }
    @org.junit.Test
    public void isChecking_true(){
        assertTrue(account.isChecking());
    }
    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("This executes after any test cases");
    }

}