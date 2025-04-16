public class Product {
    private String name;
    private String category;
    private double price;
    private int quantity;
    private String unit;
    private String supplier;

    public Product(String name, String category, double price, int quantity, String unit, String supplier) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
        this.supplier = supplier;
    }

    public String getName() { return name; }
    public String getCategory() { return category; }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public String getUnit() { return unit; }
    public String getSupplier() { return supplier; }

    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return name + " (" + category + ") - P" + price + "/" + unit +
                " | Qty: " + quantity + " | Supplier: " + supplier;
    }
}
