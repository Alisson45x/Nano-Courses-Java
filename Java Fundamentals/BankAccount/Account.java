package BankAccount;

public class Account {

    // Information
    int bankNumber;
    double balance;
    Client client;

    // Pattern Constructor
    public Account() {
    }

    // Class Constructor
    public Account(int bankNumber, double balance, Client client) {
        this.bankNumber = bankNumber;
        this.balance = balance;
        this.client = client;

    }

    // Deposit method
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Deposit method overcharge
    public void deposit(double amount, String description) {
        this.balance += amount;
        System.out.println(description + ": " + amount);

    }

    // Withdraw method
    public void withdraw(double amount) {

        // Funds check
        if (amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds: ");
        }
    }

    // Client status
    public void status() {
        System.out.println("Bank Number: " + bankNumber);
        System.out.println("Name: " + client.name);
        System.out.println("Age: " + client.age);
        System.out.println("Balance: " + balance);

    }

    // check balance
    public double checkBalance() {
        return balance;
    }
}
