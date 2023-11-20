package Factory;

import Strategy.Supplement;
import Strategy.WheyProtein;

public class WheyProteinFactory extends SupplementFactory {
    @Override
    public Supplement createSupplement(double decorationCost) {
        return new WheyProtein(decorationCost);
    }
}
