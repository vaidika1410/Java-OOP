package BankSystem;

public class SavingsAccount extends Account {
    SavingsAccount(double balance) {
        this.balance = balance;
    }

    void calculateInterest() {
        System.out.println(balance * 0.04 + "% Annual interest");
    }
}
