package Strategy;
import singleton.SettingsSingleton;
public class BetaAlanine implements Supplement{
    private double decorationCost;

    public BetaAlanine(double decorationCost) {
        this.decorationCost = decorationCost;
    }

    @Override
    public double calculateTotalCost() {
        double basePrice = SettingsSingleton.getInstance().getProductPrice("beta-alanine");
        return basePrice + decorationCost;
    }
}
