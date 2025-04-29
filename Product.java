
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
    {

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
       
        this.price = price;
    }

    public void setQuantity(int quantity) throws InvalidProductException {
       
        
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + " (" + category + ") - P" + price + "/" + unit + " | Qty: " + quantity + " | Supplier: " + supplier;
    }
}
