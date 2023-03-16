package UdemyJava;

public class OOP_part_1_____6 {

    public static void main(String[] args) {

    }

    public static class BankAccount {
        public static void main(String[] args) {
            BankAccount peterAccount = new BankAccount("84748484",0.000,"Peter hamza", "peterhamza8@gmail.com","09033210661");

            System.out.println(peterAccount.customerName);

            peterAccount.withdrawal(500);
            peterAccount.depositFunds(6000);
            peterAccount.withdrawal(3000);
            peterAccount.withdrawal(5000);
        }
        private String number;
        private double balance;
        private String customerName;
        private String email;

        private String phoneNumber;

        public  BankAccount(){

        }

        public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
            this.number = accountNumber;
            this.balance = balance;
            this.customerName = customerName;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.number = accountNumber;
        }

        public void setBalance(double balance){

            this.balance = balance;
        }


        public void setCustomerName(String customerName) {

            this.customerName = customerName;
        }

        public void setEmail(String email){

            this.email = email;
        }
        public void setPhoneNumber(String phoneNumber){

            this.phoneNumber = phoneNumber;
        }

        public String getAccountNumber() {
            return number;
        }

        public double getBalance(){
            return balance;
        }

        public String getCustomerName() {
            return customerName;
        }
        public String getEmail(){
            return email;
        }
        public String getPhoneNumber(){
            return phoneNumber;
        }

        public void depositFunds(double depositAmount){
           balance += depositAmount;
            System.out.println("Deposit of " + depositAmount + " was successful");
        }

        public void withdrawal(double withdrawAmount){
            if(balance < withdrawAmount){
                System.out.println("Insufficient fund your balance is remaining " + getBalance());
            }else {
                this.balance -= withdrawAmount;
                System.out.println("withdrawal of " + withdrawAmount + " processed. Remaining Balance = " + getBalance());
            }
        }
    }
}
