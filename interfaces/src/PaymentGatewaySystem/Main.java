package PaymentGatewaySystem;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of payments: ");
        int numPayments = sc.nextInt();

        CreditCardPayment payment1 = new CreditCardPayment();
        PayPalPayment payment2 = new PayPalPayment();
        UPIPayment payment3 = new UPIPayment();
        PaymentGateway[] payments = new PaymentGateway[numPayments];

        double[] paidAmt = new double[numPayments];
        double[] refundAmt = new double[numPayments];

        for(int i = 0; i < numPayments; i++){
            System.out.println("Choose a payment method \n1. for Credit card payments \n2. for PayPal payments \n3. " +
                    "for" +
                    " " +
                    "UPI payments : ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1: payments[i] = new CreditCardPayment();
                break;
                case 2: payments[i] = new PayPalPayment();
                break;
                case 3: payments[i] = new UPIPayment();
                break;
//                case 3 -> payments[i] = new UPIPayment(); new Java syntax
                default:
                    System.out.println("Invalid choice. Please select a valid payment method.");
                    break;
            }

            System.out.print("Enter an amount to pay: ");
            double paidAmount = sc.nextDouble();

            System.out.print("Enter an amount to refund: ");
            double refundAmount = sc.nextDouble();

            paidAmt[i] = paidAmount;
            refundAmt[i] = refundAmount;

        }


        System.out.println(Arrays.toString(paidAmt));
        System.out.println(Arrays.toString(refundAmt));
//        System.out.println(Arrays.toString(payments));

//        Transactions summary
        System.out.println("--------Transactions summary--------");
        for(int i=0; i<numPayments; i++) {
            payments[i].pay(paidAmt[i]);
            payments[i].refund(refundAmt[i]);
            System.out.println();
        }


//        payment1.pay(2000);
//        payment1.refund(100);
//        System.out.println();
//        payment2.pay(4300);
//        payment2.refund(1200);
//        System.out.println();
//        payment3.pay(1000);
//        payment3.refund(400);

    }
}
