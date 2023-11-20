package Decorator;
import Strategy.Supplement;
public class VeganDecorator extends SupplementDecorator {
    public VeganDecorator(Supplement supplement) {
        super(supplement);
    }

    @Override
    public double calculateTotalCost() {
        return supplement.calculateTotalCost() + 5.0;
    }
}