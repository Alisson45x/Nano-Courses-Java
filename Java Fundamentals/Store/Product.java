package Store;

public class Product {

    // Variable
    private String name;

    private double price;

    private int quantity;

    // Default Constructor
    public Product() {
    }

    // Overload Constructor
    public Product(String name, double price) {
        this(name, price, 0);

    }

    // Constructor 1
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method add
    public void addProducts(int amount) {
        if (amount > 0) {
            this.quantity += amount;
        }
    }

    // Method remove
    public void removeProducts(int amount) {
        if (amount > 0 && amount <= quantity) {
            this.quantity -= amount;
        } else if (amount >= quantity) {
            this.quantity = 0;
        }
    }

    // Method add overload
    public void addProducts(int amount, boolean promotion) {
        if (amount > 0) {
            this.quantity += amount;
            if (promotion)
                this.quantity += 5;
        }
    }

    // Product info
    public void productInfo() {
        System.out.println("--------------------------\n");
        System.out.println("Name:" + name);
        System.out.printf("Price: $%.2f%n", price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total value in stock: $%.2f%n\n", price * quantity);
        System.out.println("--------------------------\n");
    }

}
