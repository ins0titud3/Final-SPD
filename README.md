# Sports Nutrition Store. Product Purchase

# 1. Strategy Pattern
Usage: The Strategy Pattern is implemented to define distinct supplement types, each with its pricing strategy. For instance, the pricing strategy for Whey Protein may differ from that of Creatine. This pattern facilitates the seamless switching between supplement types, allowing each type to encapsulate its unique cost calculation logic.
# 2. Decorator Pattern
Usage: The Decorator Pattern enhances the flexibility of the product purchase system by dynamically adding extra features (e.g., Vegan, Organic) to the base supplements without modifying their core structure. Classes like VeganDecorator and OrganicDecorator enable users to customize their selected supplements with additional attributes.
# 3. Adapter Pattern
Usage: The Adapter Pattern is employed to integrate various payment methods seamlessly into the purchase system. It allows the system to work with different payment methods by providing adapters that convert their payment data into a standardized format. For example, the EuroPaymentAdapter and TengePaymentAdapter adapt payment amounts to Euros and Tenge, respectively.
# 4. Observer Pattern
Usage: The Observer Pattern is integrated to notify subscribers about special offers and updates in the sports nutrition store. It ensures that multiple observers, such as email subscribers, can react to updates. The EmailSubscriber class observes updates and receives notifications about special offers.
# 5. Singleton Pattern
Usage: The Singleton Pattern is employed to ensure a single instance of the product prices configuration throughout the application. It optimizes resource usage by creating a single, shared instance for accessing product prices.
# 6. Factory Pattern
Usage: The Factory Pattern is implemented to centralize the creation of supplement instances based on their type. The SupplementFactory and its concrete implementations, such as WheyProteinFactory and CreatineFactory, provide a unified way to create different supplements.
# 
Collectively, these design patterns contribute to a well-structured, maintainable, and expandable sports nutrition store system. This README provides an overview of how each design pattern collaborates to create a comprehensive and robust product purchase and subscription system, enriching the user experience in the sports nutrition domain.

![image](https://github.com/ins0titud3/Final-SPD/assets/113097957/a37af60f-9ecb-4406-a92a-ca7c379a9ecf)
