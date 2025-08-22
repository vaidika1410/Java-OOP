package BankSystem;

public class CurrentAccount extends Account {
    CurrentAccount(double balance) {
        this.balance = balance;
    }

    void calculateInterest() {
        System.out.println("Annual interest: " + (balance * 0.02) + currency);
    }
}
