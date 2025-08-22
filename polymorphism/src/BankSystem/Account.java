package BankSystem;

public class Account {
    double balance;
    String currency;

    Account() {
        this.balance = 2000;
        this.currency = "Rs.";
    }

    Account(double balance, String currency) {
        this.balance = balance;
        this.currency = currency;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void deposit(double amount, String currency) {
        balance += amount;
        this.currency = currency;
    }

    void withdraw(double amount) {
        if(balance > amount) {
            balance -= amount;
            System.out.println("Withdrawal Amount: " + amount + this.currency + "\nRemaining balance: " + balance + this.currency);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    void calculateInterest() {
        System.out.println("0% interest");
    }

    void getBalance(){
        System.out.println("Balance: " + balance + this.currency);
    }
}
