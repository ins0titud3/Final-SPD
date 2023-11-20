package Decorator;
import Strategy.Supplement;
public class OrganicDecorator extends SupplementDecorator {
    public OrganicDecorator(Supplement supplement) {
        super(supplement);
    }

    @Override
    public double calculateTotalCost() {
        return supplement.calculateTotalCost() + 3.0;
    }
}
