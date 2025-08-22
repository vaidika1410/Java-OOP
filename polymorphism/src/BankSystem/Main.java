package BankSystem;

public class Main {
    public static void main(String[] args) {
//        upcasting
        Account account1 = new SavingsAccount(4000);
        Account account2 = new CurrentAccount(3000);



        System.out.println("Account 1");
        System.out.println(account1.balance);
        // method overloading
        account1.deposit(3000);
        System.out.println(account1.balance);
        // method overriding
        account1.calculateInterest();

        System.out.println("---------------------------");
        System.out.println("Account 2");
        System.out.println(account2.balance);
        // method overloading
        account2.deposit(2000);
        System.out.println(account2.balance);
        account2.withdraw(500);
        System.out.println(account2.balance);
        // method overriding
        account2.calculateInterest();

//        accessing the getter method of parent class
        account2.getBalance();
    }
}
