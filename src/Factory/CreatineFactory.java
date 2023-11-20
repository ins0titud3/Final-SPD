package Factory;

import Strategy.Supplement;
import Strategy.Creatine;

public class CreatineFactory extends SupplementFactory {
    @Override
    public Supplement createSupplement(double decorationCost) {
        return new Creatine(decorationCost);
    }
}
