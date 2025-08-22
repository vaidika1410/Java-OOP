package BankAccountCounter;

public class BankAccount {
    int accountNumber;
    double balance;
    static int accountCount = 0;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountCount++;
        System.out.println("Created account #" + accountNumber + " with balance: " + balance + "Rs.");
    }

    static void getTotalAccounts() {
        System.out.println("Number of accounts: " + accountCount);
    }
}
