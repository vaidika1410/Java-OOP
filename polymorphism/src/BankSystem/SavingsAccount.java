package BankSystem;

public class SavingsAccount extends Account {
    SavingsAccount(double balance) {
        this.balance = balance;
    }

    void calculateInterest() {
        System.out.println("Annual interest: " + (balance * 0.04) + currency);
    }
}
