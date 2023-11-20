package Strategy;
import singleton.SettingsSingleton;
public class Creatine implements Supplement{
    private double decorationCost;

    public Creatine(double decorationCost) {
        this.decorationCost = decorationCost;
    }

    @Override
    public double calculateTotalCost() {
        double basePrice = SettingsSingleton.getInstance().getProductPrice("creatine");
        return basePrice + decorationCost;
    }
}
