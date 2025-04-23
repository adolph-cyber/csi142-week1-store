public class Product {
    
    //Product fields
    private String name;
    private String category;
    private double price;
    private int quantity;
    private String unit;
    private String supplier;

    //Constructors to initialize
    public Product(String name, String category, double price, int quantity, String unit, String supplier) {
          if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty.");
        }
        if (category == null || category.isEmpty()) {
            throw new IllegalArgumentException("Category cannot be null or empty.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        if (unit == null || unit.isEmpty()) {
            throw new IllegalArgumentException("Unit cannot be null or empty.");
        }
        if (supplier == null || supplier.isEmpty()) {
            throw new IllegalArgumentException("Supplier cannot be null or empty.");
        }
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
        this.supplier = supplier;
    }

    //Getter for Name
    public String getName() {
        return name;
    }
    
    //Getter for Category
    public String getCategory() {
        return category;
    }

    //Getter for Price
    public double getPrice() {
        return price;
    }
    
    //Getter for Quantity
    public int getQuantity() {
        return quantity;
    }
    
    //Getter for Unit
    public String getUnit() {
        return unit;
    }
    
    //Getter for Supplier
    public String getSupplier() {
        return supplier;
    }

    //Setter for Price
    public void setPrice(double price) {
        this.price = price;
    }
    
    //Setter for Quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    //Display Method
    public String toString() {
        return name + " (" + category + ") - P" + price + "/" + unit + " | Qty: " + quantity + " | Supplier: " + supplier;
    }
}
