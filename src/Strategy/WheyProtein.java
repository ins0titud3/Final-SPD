package Strategy;
import singleton.SettingsSingleton;

public class WheyProtein implements Supplement{
    private double decorationCost;

    public WheyProtein(double decorationCost) {
        this.decorationCost = decorationCost;
    }

    @Override
    public double calculateTotalCost() {
        double basePrice = SettingsSingleton.getInstance().getProductPrice("whey");
        return basePrice + decorationCost;
    }
}
