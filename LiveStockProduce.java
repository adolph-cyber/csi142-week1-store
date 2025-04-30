public class LivestockProduce extends CropProduct {
    private String animalType;

    public LivestockProduce(String name, String category, double price, int quantity, String unit, String buyer, String farmLocation, String season, String cropType, String animalType)
            throws OperationException {
        super(name, category, price, quantity, unit, buyer, farmLocation, season, cropType);
        if (animalType == null || animalType.isEmpty())
            throw new OperationException("Animal type cannot be empty.");
        this.animalType = animalType;
    }

    public String getAnimalType() { return animalType; }

    @Override
    public void display() {
        super.display();
        System.out.println("Animal Type: " + animalType);
    }
}
