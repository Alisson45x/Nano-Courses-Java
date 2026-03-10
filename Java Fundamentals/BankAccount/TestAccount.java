package BankAccount;

import java.util.Scanner;

/**
 * Test class for the BankAccount system.
 * Creates a client and account, then simulates a deposit and withdrawal.
 */
public class TestAccount {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create client and account
        Client alisson = new Client("Alisson", 17);
        Account alissonAccount = new Account(45, 0, alisson);
        alissonAccount.status();

        // Deposit
        System.out.print("How much do you want to deposit: ");
        double amountDeposit = sc.nextDouble();
        alissonAccount.deposit(amountDeposit, "Amount deposited");
        alissonAccount.status();

        // Withdraw
        System.out.print("How much do you want to withdraw: ");
        double amountWithDraw = sc.nextDouble();
        alissonAccount.withdraw(amountWithDraw);
        alissonAccount.status();

        sc.close();
    }
}