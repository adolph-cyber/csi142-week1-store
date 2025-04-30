public class CropProduct extends ProduceStore {
    private String farmLocation;
    private String season;
    private String cropType;

    public CropProduct(String name, String category, double price, int quantity, String unit, String buyer,
                       String farmLocation, String season, String cropType) throws OperationException {
        super(name, category, price, quantity, unit, buyer);
        if (farmLocation == null || farmLocation.isEmpty())
            throw new OperationException("Farm location cannot be empty.");
        if (season == null || season.isEmpty())
            throw new OperationException("Season cannot be empty.");
        if (cropType == null || cropType.isEmpty())
            throw new OperationException("Crop type cannot be empty.");

        this.farmLocation = farmLocation;
        this.season = season;
        this.cropType = cropType;
    }

    public String getFarmLocation() { return farmLocation; }
    public String getSeason() { return season; }
    public String getCropType() { return cropType; }

    @Override
    public void display() {
        super.display();
        System.out.println("Farm Location: " + farmLocation);
        System.out.println("Season: " + season);
        System.out.println("Crop Type: " + cropType);
    }
}
