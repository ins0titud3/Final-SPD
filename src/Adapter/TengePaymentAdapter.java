package Adapter;

public class TengePaymentAdapter implements PaymentAdapter {
    private static final double TENGE_EXCHANGE_RATE = 440;

    @Override
    public void pay(double amount) {
        double tengeAmount = convertToTenge(amount);
        System.out.println("Payment with Tenge: ₸" + tengeAmount);
    }

    private double convertToTenge(double amount) {
        return amount * TENGE_EXCHANGE_RATE;
    }
}
