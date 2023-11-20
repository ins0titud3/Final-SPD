package singleton;

import java.util.HashMap;
import java.util.Map;

public class SettingsSingleton {
    private static SettingsSingleton instance;
    private Map<String, Double> productPrices;

    private SettingsSingleton() {
        productPrices = new HashMap<>();
        productPrices.put("whey", 29.99);
        productPrices.put("creatine", 24.99);
        productPrices.put("beta-alanine", 19.99);
        productPrices.put("BCAA", 17.45);
    }

    public static SettingsSingleton getInstance() {
        if (instance == null) {
            instance = new SettingsSingleton();
        }
        return instance;
    }

    public double getProductPrice(String product) {
        return productPrices.getOrDefault(product, 0.0);
    }

    public static void getProductPrices() {
        System.out.println("Select a product to purchase\n" +
                "Base price of products:\n" +
                "1) whey protein - 29.99$\n" +
                "2) creatine - 24.99$\n" +
                "3) beta-alanine - 19.99$\n" +
                "4) BCAA - 17.45$\n");
    }
}
