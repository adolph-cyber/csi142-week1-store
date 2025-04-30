public class ProduceStore {
    //Produce Fields
    private String name;
    private String category;
    private double price;
    private int quantity;
    private String unit;
    private String buyer;

    //Constructors to initialize
    public ProduceStore(String name, String category, double price, int quantity, String unit, String buyer)
            throws OperationException {
        if (name == null || name.isEmpty()) throw new OperationException("Product name cannot be empty.");
        if (category == null || category.isEmpty()) throw new OperationException("Category cannot be empty.");
        if (price < 0) throw new OperationException("Price cannot be negative.");
        if (quantity < 0) throw new OperationException("Quantity cannot be negative.");
        if (unit == null || unit.isEmpty()) throw new OperationException("Unit cannot be empty.");
        if (buyer == null || buyer.isEmpty()) throw new OperationException("Buyer cannot be empty.");

        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
        this.buyer = buyer;
    }

    //Getter for Name
    public String getName() {
        return name;
    }
    
    //Getter for Catergory
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

    //Getter for Buyer
    public String getBuyer() {
        return buyer;
    }

    //Setter for Price
    public void setPrice(double price) throws OperationException {
        if (price < 0) throw new OperationException("Price cannot be negative.");
        this.price = price;
    }

    //Setter for Quantity
    public void setQuantity(int quantity) throws OperationException {
        if (quantity < 0) throw new OperationException("Quantity cannot be negative.");
        this.quantity = quantity;
    }

    //Setter for Unit
    public void setUnit(String unit) throws OperationException {
        if (unit == null || unit.isEmpty()) throw new OperationException("Unit cannot be empty.");
        this.unit = unit;
    }

    //Setter for Buyer
    public void setBuyer(String buyer) throws OperationException {
        if (buyer == null || buyer.isEmpty()) throw new OperationException("Buyer cannot be empty.");
        this.buyer = buyer;
    }

    public void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit: " + unit);
        System.out.println("Buyer: " + buyer);
    }
}
