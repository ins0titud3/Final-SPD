package Adapter;

public class DollarPaymentAdapter implements PaymentAdapter {
    @Override
    public void pay(double amount) {
        System.out.println("Payment with Dollars: $" + amount);
    }
}
