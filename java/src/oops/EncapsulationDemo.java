package oops;

public class EncapsulationDemo {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("Rishi Kokil", 1234567890L, 10000.0);

        System.out.println("Account Holder: " + myAccount.getAccountHolderName());
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Initial Balance: ₹" + myAccount.getBalance());

        myAccount.deposit(2500);
        System.out.println("Balance after deposit: ₹" + myAccount.getBalance());

        myAccount.withdraw(1200);
        System.out.println("Balance after withdrawal: ₹" + myAccount.getBalance());
    }
}
