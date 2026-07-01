import java.util.*;

class Product {
    private String productId;
    private String productName;
    private double price;
    private int stockQuantity;

    public Product(String productId, String productName, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = (price < 0) ? 0.0 : price;
        this.stockQuantity = (stockQuantity < 0) ? 0 : stockQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = (price < 0) ? 0.0 : price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = (stockQuantity < 0) ? 0 : stockQuantity;
    }

    public void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
    }
}

public class Product_Inventory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        String productId = sc.nextLine();
        // Enter Product ID: P101
        System.out.print("Enter Product Name: ");
        String productName = sc.nextLine();
        // Enter Product Name: Laptop
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        // Enter Price: 1000.0
        System.out.print("Enter Stock Quantity: ");
        int stockQuantity = sc.nextInt();
        // Enter Stock Quantity: 15
        System.out.print("Enter Discount Percentage: ");
        double discount = sc.nextDouble();
        // Enter Discount Percentage: 10

        Product p = new Product(productId, productName, price, stockQuantity);
        p.applyDiscount(discount);

        System.out.println("\nAfter Discount:");
        System.out.println("Product ID: " + p.getProductId());
        // Product ID: P101
        System.out.println("Product Name: " + p.getProductName());
        // Product Name: Laptop
        System.out.println("Price: " + p.getPrice());
        // Price: 900.0
        System.out.println("Stock Quantity: " + p.getStockQuantity());
        // Stock Quantity: 15

        sc.close();
    }
}