public class ShoppingCart {
    
    public static void main(String[] args) {
        String[] itemPrices = {"250", "499", "99", "150", "abc", "350", "75"};
        
        int totalPrice = 0;
        int validItems = 0;
        int invalidItems = 0;
        
        System.out.println("=== Shopping Cart Price Calculation ===\n");
        System.out.println("Processing items...\n");
        for (int i = 0; i < itemPrices.length; i++) {
            try {
                int price = Integer.parseInt(itemPrices[i]);
                totalPrice = totalPrice + price;
                validItems++;
                
                System.out.println("Item " + (i + 1) + ": ₹" + price + " ✓");
                
            } catch (NumberFormatException e) {
                 
                invalidItems++;
                System.out.println("Item " + (i + 1) + ": \"" + itemPrices[i] + "\" - Invalid price! ✗");
            }
        }
        
        // Display results
        System.out.println("\n" + "=".repeat(40));
        System.out.println("Total Valid Items: " + validItems);
        System.out.println("Invalid Items: " + invalidItems);
        System.out.println("Total Price: ₹" + totalPrice);
        System.out.println("=".repeat(40));
    }
}