
public class Product {

    // Product fields
    private String name;
    private String category;
    private double price;
    private int quantity;
    private String unit;
    private String Buyer;

    // Constructor using custom exception
    public Product(String name, String category, double price, int quantity, String unit, String Buyer)
            throws InvalidProductException {

        if (name == null || name.isEmpty()) {
            throw new InvalidProductException("Product name cannot be null or empty.");
        }
        if (category == null || category.isEmpty()) {
            throw new InvalidProductException("Category cannot be null or empty.");
        }
        if (price < 0) {
            throw new InvalidProductException("Price cannot be negative.");
        }
        if (quantity < 0) {
            throw new InvalidProductException("Quantity cannot be negative.");
        }
        if (unit == null || unit.isEmpty()) {
            throw new InvalidProductException("Unit cannot be null or empty.");
        }
        if (Buyer == null || Buyer.isEmpty()) {
            throw new InvalidProductException("Buyer cannot be null or empty.");
        }

        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
        this.Buyer = Buyer;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public String getSupplier() {
        return supplier;
    }

    // Setters with exception
    public void setPrice(double price) throws InvalidProductException {
        if (price < 0) {
            throw new InvalidProductException("Price cannot be negative.");
        }
        this.price = price;
    }

    public void setQuantity(int quantity) throws InvalidProductException {
        if (quantity < 0) {
            throw new InvalidProductException("Quantity cannot be negative.");
        }
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + " (" + category + ") - P" + price + "/" + unit + " | Qty: " + quantity + " | Supplier: " + supplier;
    }
}
