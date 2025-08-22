package LoanInterestSystem;

public class LoanAccount {
    double loanAmount;
    int accountNumber;

    static double interestRate = 8.5;

    LoanAccount(double loanAmount, int accountNumber) {
        this.loanAmount = loanAmount;
        this.accountNumber = accountNumber;
        System.out.println("Loan account created: #" + accountNumber + ", Amount: " + loanAmount + "Rs.");
    }

    static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    static double getInterestRate() {
        return interestRate;
    }

    void showLoanDetails() {
        System.out.println("Loan #" + accountNumber + " | Amount: " + loanAmount + "Rs. | Interest Rate: " + interestRate + "%");
    }
}
