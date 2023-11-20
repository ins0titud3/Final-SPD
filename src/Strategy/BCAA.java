package Strategy;
import singleton.SettingsSingleton;

public class BCAA implements Supplement{
    private double decorationCost;

    public BCAA(double decorationCost) {
        this.decorationCost = decorationCost;
    }

    @Override
    public double calculateTotalCost() {
        double basePrice = SettingsSingleton.getInstance().getProductPrice("BCAA");
        return basePrice + decorationCost;
    }
}
