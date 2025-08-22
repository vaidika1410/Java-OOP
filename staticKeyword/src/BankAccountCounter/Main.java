package BankAccountCounter;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1, 4000);
        BankAccount account2 = new BankAccount(2, 3000);

        BankAccount.getTotalAccounts();
    }
}
