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
