package BankSystem;

public class Account {
    double balance;

    Account() {
        this.balance = 2000;
    }

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if(balance > amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    void calculateInterest() {
        System.out.println("0% interest");
    }

    void getBalance(){
        System.out.println(balance);
    }
}
