package Week07;

public class BankAccount {

    int accountNumber;
    String holderName;
    double balance;

   
    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance for " + holderName);
        }
    }

    public void displayBalance() {
        System.out.println(holderName + "'s Balance: " + balance);
    }
}
