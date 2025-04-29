
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

   
public class ProductStore{ 


    // Product fields
    private String name;
    private String category;
    private double price;
    private int quantity;
    private String unit;
    private String buyer;

    // Constructor
    public ProductStore(String name, String category, double price, int quantity, String unit, String buyer) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
        this.buyer = buyer;
    }

    // Getters
    public String getName()
     { return name;
    
    }
    public String getCategory()
     { return category;
     
    }
    public double getPrice()
     { return price;
    
    }
    public int getQuantity()
     { return quantity; 
    
    }
    public String getUnit() 
    { return unit; 
    }
    public String getBuyer()
     { return buyer; 
    
    }

    // Setters
    public void setPrice(double price) 
    { this.price = price;
    
    }
    public void setQuantity(int quantity)
     { this.quantity = quantity;
    
    }

    public void setUnit(String unit) 
    { this.unit = unit;
    
    }

    public void setBuyer(String buyer) 
    { this.buyer = buyer;
    
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




}
