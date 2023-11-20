import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import singleton.*;
import Observer.*;
import Factory.*;
import Strategy.*;
import Decorator.*;
import Adapter.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ShopNewsletter shopNewsletter = new ShopNewsletter();

        System.out.println("Welcome to the Sports Nutrition Store!");

        SettingsSingleton.getProductPrices();

        int selectedProduct = scanner.nextInt();

        SupplementFactory supplementFactory = null;
        switch (selectedProduct) {
            case 1:
                supplementFactory = new WheyProteinFactory();
                break;
            case 2:
                supplementFactory = new CreatineFactory();
                break;
            case 3:
                supplementFactory = new BetaAlanineFactory();
                break;
            case 4:
                supplementFactory = new BCAAFactory();
                break;
            default:
                System.out.println("Invalid selection. Exiting.");
                System.exit(0);
        }

        Supplement selectedSupplement = supplementFactory.createSupplement(0.0);

        System.out.println("You have selected: " + selectedSupplement.getClass().getSimpleName());



        System.out.println("Select supplements for your product:");
        System.out.println("1. Vegan/Vegetarian (+$5)");
        System.out.println("2. Certified Organic (+$3)");
        System.out.println("3. Organic Certificate Important Feature (+$11)");
        System.out.println("4. Gluten-Free (+$2)");

        List<SupplementDecorator> selectedDecorations = new ArrayList<>();

        int selectedDecoration;
        do {
            selectedDecoration = scanner.nextInt();

            switch (selectedDecoration) {
                case 1:
                    selectedSupplement = new VeganDecorator(selectedSupplement);
                    break;
                case 2:
                    selectedSupplement = new OrganicDecorator(selectedSupplement);
                    break;
                case 3:
                    selectedSupplement = new CertificationDecorator(selectedSupplement);
                    break;
                case 4:
                    selectedSupplement = new GlutenFreeDecorator(selectedSupplement);
                    break;
                default:
                    System.out.println("Invalid supplements selection. No additional cost added.");
            }

            System.out.println("Do you want to add more supplements? (1 for yes, 0 for no)");
        } while (scanner.nextInt() == 1);

        double totalCost = selectedSupplement.calculateTotalCost();
        System.out.println("Total Cost: $" + totalCost);



        System.out.println("choose which currency to pay with: 1. Euro, 2. Tenge, 3. Dollar");
        int paymentMethod = scanner.nextInt();

        PaymentAdapter paymentAdapter = null;

        switch (paymentMethod) {
            case 1:
                paymentAdapter = new EuroPaymentAdapter();
                break;
            case 2:
                paymentAdapter = new TengePaymentAdapter();
                break;
            case 3:
                paymentAdapter = new DollarPaymentAdapter();
                break;
            default:
                System.out.println("Invalid payment method. Exiting.");
                System.exit(0);
        }

        paymentAdapter.pay(totalCost);

        System.out.println("Would you like to subscribe for updates? (yes/no)");
        String subscribeChoice = scanner.next().toLowerCase();

        if ("yes".equals(subscribeChoice)) {
            System.out.println("Enter your email address:");
            String email = scanner.next();
            EmailSubscriber subscriber = new EmailSubscriber(email);
            shopNewsletter.subscribe(subscriber);
            System.out.println("Thank you for subscribing! You will receive updates.");
        } else {
            System.out.println("Thank you for your purchase. Have a great day!");
        }

        shopNewsletter.notifySubscribers("Newsletter: New products in stock!");
        scanner.close();
    }
}
