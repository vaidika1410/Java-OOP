package LoanInterestSystem;

public class Main {
    public static void main(String[] args) {
        LoanAccount account1 = new LoanAccount(400000, 101);
        LoanAccount account2 = new LoanAccount(300000, 102);

        System.out.println();
        account1.showLoanDetails();
        account2.showLoanDetails();

        System.out.println();
        LoanAccount.setInterestRate(9.5);
        System.out.println("--- Bank updates interest rate to " + LoanAccount.getInterestRate() + "% ---");
        System.out.println();
        account1.showLoanDetails();
        account2.showLoanDetails();
    }
}
