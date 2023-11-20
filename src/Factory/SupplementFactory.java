package Factory;

import Strategy.Supplement;

public abstract class SupplementFactory {
    public abstract Supplement createSupplement(double decorationCost);
}
