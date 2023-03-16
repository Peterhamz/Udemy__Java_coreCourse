package Udemy__Packages_11;

public class MainAccount {

    public static void main(String[] args) {
        Account timsAccount = new Account("Tims");
        timsAccount.deposit(1000);
        timsAccount.withdraw(200);
        timsAccount.withdraw(-30);
        timsAccount.deposit(-44);

        timsAccount.calculateBalance();
    }
}
