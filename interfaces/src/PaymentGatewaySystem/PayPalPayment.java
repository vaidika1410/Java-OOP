package PaymentGatewaySystem;

public class PayPalPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "Rs. using PayPal");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + "Rs. using PayPal");
    }
}
