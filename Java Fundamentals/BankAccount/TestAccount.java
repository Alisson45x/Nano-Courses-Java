package BankAccount;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Client information
        Client alisson = new Client("Alisson", 17);
        Account alissonAccount = new Account(45, 0, alisson);
        alissonAccount.status();

        // deposit part
        System.out.print("How much do you want to deposit: ");
        double amountDeposit = sc.nextDouble();
        alissonAccount.deposit(amountDeposit, "Amount deposited");
        alissonAccount.status();

        // withdraw the amount
        System.out.print("How much do you want to withdraw: ");
        double amountWithDraw = sc.nextDouble();
        alissonAccount.withdraw(amountWithDraw);
        alissonAccount.status();
        sc.close();
    }

}
