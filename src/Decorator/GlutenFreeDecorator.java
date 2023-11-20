package Decorator;
import Strategy.Supplement;
public class GlutenFreeDecorator extends SupplementDecorator{
    public GlutenFreeDecorator(Supplement supplement) {
        super(supplement);
    }

    @Override
    public double calculateTotalCost() {
        return supplement.calculateTotalCost() + 2.0;
    }
}
