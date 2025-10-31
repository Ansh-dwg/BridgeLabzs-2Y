import java.util.ArrayList;
import java.util.List;

public class Product {
    public final String sku;
    public String name;
    public double price;
    private static int totalProducts = 0;

    public Product(String sku, String name, double price) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        totalProducts++;
    }
}

class Order {
    public final String orderId;
    private Customer customer;
    private List<Product> items;
    private static String status = "Processing";

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.items.add(product);
    }

    public void displayOrderDetails() {
        System.out.println("\nOrder ID: " + this.orderId + " | Status: " + status);
        System.out.println("Customer: " + this.customer.name);
        System.out.println("Items:");
        double total = 0.0;
        for (Product p : items) {
            Object check = p;
            if (check instanceof Product) {
                System.out.println(" - " + ((Product) check).name + " ($" + ((Product) check).price + ")");
                total += ((Product) check).price;
            }
        }
        System.out.println("Total: $" + total);
    }
}

class Customer {
    public final String customerId;
    public String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public Order placeOrder(String orderId) {
        Order newOrder = new Order(orderId, this);
        System.out.println("\n" + this.name + " is placing order " + orderId + "...");
        return newOrder;
    }
}

class EcommerceSystem {
    
    public static void main(String[] args) {
        
        Product p1 = new Product("A1", "Wireless Keyboard", 45.99);
        Product p2 = new Product("B2", "Mechanical Mouse", 29.50);
        Product p3 = new Product("C3", "Monitor Stand", 19.99);
        
        Customer c1 = new Customer("C101", "Jane Doe");
        
        Order order1 = c1.placeOrder("ORD001");
        
        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.addProduct(p2); 
        
        order1.displayOrderDetails();
        
        Customer c2 = new Customer("C102", "Mark Smith");
        Order order2 = c2.placeOrder("ORD002");
        order2.addProduct(p3);
        
        order2.displayOrderDetails();
    }
}
