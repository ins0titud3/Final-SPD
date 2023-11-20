package Decorator;
import Strategy.Supplement;
public class CertificationDecorator extends SupplementDecorator {
    public CertificationDecorator(Supplement supplement) {
        super(supplement);
    }

    @Override
    public double calculateTotalCost() {
        return supplement.calculateTotalCost() + 11.0;
    }
}
