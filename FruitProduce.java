public class FruitProduce extends LivestockProduce{
    private String fruitType;
    private String storageCondition;
    private String ripeningSeason;

    public FruitProduce(String name, String category, double price, int quantity, String unit, String buyer,
                        String farmLocation, String season, String cropType, String animalType,
                        String fruitType, String storageCondition, String ripeningSeason)
            throws OperationException {
        super(name, category, price, quantity, unit, buyer, farmLocation, season, cropType, animalType);
        if (fruitType == null || fruitType.isEmpty())
            throw new OperationException("Fruit type cannot be empty.");
        if (storageCondition == null || storageCondition.isEmpty())
            throw new OperationException("Storage condition cannot be empty.");
        if (ripeningSeason == null || ripeningSeason.isEmpty())
            throw new OperationException("Ripening season cannot be empty.");

        this.fruitType = fruitType;
        this.storageCondition = storageCondition;
        this.ripeningSeason = ripeningSeason;
    }

    public String getFruitType() { return fruitType; }
    public String getStorageCondition() { return storageCondition; }
    public String getRipeningSeason() { return ripeningSeason; }

    @Override
    public void display() {
        super.display();
        System.out.println("Fruit Type: " + fruitType);
        System.out.println("Storage Condition: " + storageCondition);
        System.out.println("Ripening Season: " + ripeningSeason);
        System.out.println("--------------------------");
    }
}
