public class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: $" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total products created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.00);
        p1.displayProductDetails();
        
        Product p2 = new Product("Mouse", 25.50);
        p2.displayProductDetails();
        
        displayTotalProducts();
        
        Product p3 = new Product("Keyboard", 75.99);
        p3.displayProductDetails();

        displayTotalProducts();
    }
}
