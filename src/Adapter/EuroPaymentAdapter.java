package Adapter;

public class EuroPaymentAdapter implements PaymentAdapter {
    private static final double EURO_EXCHANGE_RATE = 0.85;

    @Override
    public void pay(double amount) {
        double euroAmount = convertToEuro(amount);
        System.out.println("Payment with Euros: €" + euroAmount);
    }

    private double convertToEuro(double amount) {
        return amount * EURO_EXCHANGE_RATE;
    }
}
