// Interface Definition
interface PaymentMethod {
    void pay(double amount);
}

class UPIPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("UPI Payment: ₹" + amount + " paid successfully via linked bank account.");
    }
}

// Implementation 2: Credit Card
class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Credit Card Payment: ₹" + amount + " charged to Visa ending in **** 4567.");
    }
}

// Main Test Class
public class DigitalPayment {
    public static void main(String[] args) {
        System.out.println("\n--- Digital Payment Interface ---");
        PaymentMethod upi = new UPIPayment();
        PaymentMethod creditCard = new CreditCardPayment();

        upi.pay(99.99);
        creditCard.pay(1500.00);
    }
}