import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;
    
    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }
    
    @Override
    public String toString() {
        return name + " - Price: $" + price + ", Rating: " + rating + ", Discount: " + discount + "%";
    }
}

public class ECommerceSorting {
    
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 999.99, 4.5, 10));
        products.add(new Product("Phone", 699.99, 4.8, 15));
        products.add(new Product("Tablet", 399.99, 4.2, 20));
        products.add(new Product("Watch", 299.99, 4.6, 5));
        
        System.out.println("Original List:");
        products.forEach(System.out::println);
        
        System.out.println("\nSorted by Price:");
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        products.forEach(System.out::println);
        
        System.out.println("\nSorted by Rating:");
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        products.forEach(System.out::println);
        
        System.out.println("\nSorted by Discount:");
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        products.forEach(System.out::println);
    }
}