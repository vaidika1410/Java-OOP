package BankSystem;

public class Main {
    public static void main(String[] args) {
//        upcasting
        Account account1 = new SavingsAccount(4000);
        Account account2 = new CurrentAccount(3000);
        Account account3 = new Account(80, "$.");
        Account account4 = new SavingsAccount(4500);


        System.out.println("Account 1");
//        System.out.println(account1.balance); // directly access the parent variable
        account1.getBalance();
        // method overloading
        account1.deposit(3000);
//        System.out.println(account1.balance);
        account1.getBalance();
        account1.withdraw(200);
        account1.getBalance();
        account1.deposit(5000, "Rs.");
        account1.withdraw(100);
        // method overriding
        account1.calculateInterest();

        System.out.println("---------------------------");
        System.out.println("Account 2");
//        System.out.println(account2.balance); // uses the variable of parent directly
        account2.getBalance();
        // method overloading
        account2.deposit(2000);
        account2.getBalance();
        account2.withdraw(500);
//        System.out.println(account2.balance);
        account2.getBalance();
        // method overriding
        account2.calculateInterest();

//        accessing the getter method of parent class
        account2.getBalance();

        System.out.println("-------------------------");
        System.out.println("Account 3");
        account3.getBalance();
        account3.deposit(40, "$");
        account3.getBalance();

        System.out.println("-------------------------");
        System.out.println("Account 4");
        account4.getBalance();
        account4.calculateInterest();
        account4.withdraw(2500);
    }
}
