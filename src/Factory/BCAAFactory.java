package Factory;

import Strategy.Supplement;
import Strategy.BCAA;

public class BCAAFactory extends SupplementFactory {
    @Override
    public Supplement createSupplement(double decorationCost) {
        return new BCAA(decorationCost);
    }
}
