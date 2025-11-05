interface PaymentProcessor {
    void processPayment(double amount);

    // Default method added without affecting existing implementations (old providers)
    default void refund(double amount) {
        System.out.println("Default Refund: Initiating generic refund of $" + amount + ".");
        System.out.println("Provider specific refund method not implemented. Using fallback.");
    }
}

// Old Provider (doesn't know about refund())
class LegacyProvider implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Legacy Provider: Payment of $" + amount + " processed.");
    }
    // Automatically inherits the default refund() method
}

// New Provider (can optionally override refund())
class ModernProvider implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Modern Provider: Payment of $" + amount + " processed quickly.");
    }
    
    @Override
    public void refund(double amount) {
        System.out.println("Modern Provider: Executing advanced refund workflow for $" + amount + ".");
    }
}

public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        System.out.println("\n--- Payment Gateway Integration (Default Methods) ---");
        
        PaymentProcessor legacy = new LegacyProvider();
        PaymentProcessor modern = new ModernProvider();

        System.out.println("\n**Legacy Provider Test:**");
        legacy.processPayment(50.00);
        legacy.refund(5.00); // Uses the default method

        System.out.println("\n**Modern Provider Test:**");
        modern.processPayment(100.00);
        modern.refund(10.00); // Uses the overridden method
    }
}