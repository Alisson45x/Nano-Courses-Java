package BankAccount;

/**
 * Represents a bank account linked to a client.
 * Provides methods for depositing, withdrawing, and checking balance.
 */
public class Account {

    /** The unique bank account number. */
    int bankNumber;

    /** The current balance of the account. */
    double balance;

    /** The client who owns this account. */
    Client client;

    /**
     * Default constructor. Creates an empty account.
     */
    public Account() {
    }

    /**
     * Creates an account with the given bank number, balance, and client.
     *
     * @param bankNumber the unique account number
     * @param balance    the initial balance (starts at 0)
     * @param client     the client who owns this account
     */
    public Account(int bankNumber, double balance, Client client) {
        this.bankNumber = bankNumber;
        this.balance = balance;
        this.client = client;
    }

    /**
     * Deposits an amount into the account.
     *
     * @param amount the value to be deposited
     */
    public void deposit(double amount) {
        this.balance += amount;
    }

    /**
     * Deposits an amount into the account and prints a description.
     * Overload of {@link #deposit(double)}.
     *
     * @param amount      the value to be deposited
     * @param description a label describing the deposit (e.g. "Salary")
     */
    public void deposit(double amount, String description) {
        this.balance += amount;
        System.out.println(description + ": " + amount);
    }

    /**
     * Withdraws an amount from the account if funds are sufficient.
     *
     * @param amount the value to be withdrawn
     */
    public void withdraw(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    /**
     * Prints the account and client information to the console.
     */
    public void status() {
        System.out.println("Bank Number: " + bankNumber);
        System.out.println("Name: "        + client.name);
        System.out.println("Age: "         + client.age);
        System.out.println("Balance: "     + balance);
    }

    /**
     * Returns the current balance of the account.
     *
     * @return the current balance
     */
    public double checkBalance() {
        return balance;
    }
}