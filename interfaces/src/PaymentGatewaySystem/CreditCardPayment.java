package PaymentGatewaySystem;

public class CreditCardPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "Rs. using Credit card");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + "Rs. using Credit card");
    }
}
