package PaymentGatewaySystem;

public class UPIPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "Rs. using UPI payment");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + "Rs. using UPI payment");
    }
}
