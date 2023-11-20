package Decorator;
import Strategy.Supplement;
public abstract class SupplementDecorator implements Supplement {
    protected Supplement supplement;

    public SupplementDecorator(Supplement supplement) {
        this.supplement = supplement;
    }
}
