package BankAccount;

public class Account {

    // information
    int bankNumber;
    double balance;
    Client client;

    public Account() {
    }

    public Account(int bankNumber, double balance, Client client) {
        this.bankNumber = bankNumber;
        this.balance = 0;
        this.client = client;

    }
    // deposit

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void deposit(double amount, String description) {
        this.balance += amount;
        System.out.println(description + ": " + amount);

    }

    // withdraw check
    public void withdraw(double amount) {
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
