package Factory;

import Strategy.Supplement;
import Strategy.BetaAlanine;

public class BetaAlanineFactory extends SupplementFactory {
    @Override
    public Supplement createSupplement(double decorationCost) {
        return new BetaAlanine(decorationCost);
    }
}