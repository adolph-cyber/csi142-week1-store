public class Main {
    public static void main(String[] args) {
        try {
            //8 FruitProduce objects
            FruitProduce[] fruits = new FruitProduce[8];
            fruits[0] = new FruitProduce("Apple", "Fruit", 2.5, 100, "Kg", "FruitShop",
                    "North Farm", "Fall", "Pome", "None", "Apple", "Cool, dry place", "Autumn");
            fruits[1] = new FruitProduce("Banana", "Fruit", 1.2, 200, "Bunch", "TropicalFruits",
                    "South Farm", "Summer", "Herbaceous", "None", "Banana", "Cool, dry place", "Summer");
            fruits[2] = new FruitProduce("Mango", "Fruit", 3.0, 150, "Kg", "FreshHarvest",
                    "East Farm", "Summer", "Drupe", "None", "Mango", "Cool storage", "Summer");
            fruits[3] = new FruitProduce("Orange", "Fruit", 1.8, 120, "Kg", "CitrusCorp",
                    "Citrus Farm", "Winter", "Citrus", "None", "Orange", "Refrigerated", "Winter");
            fruits[4] = new FruitProduce("Pineapple", "Fruit", 2.0, 80, "Kg", "TropicalFarm",
                    "Island Farm", "Summer", "Bromeliad", "None", "Pineapple", "Cool storage", "Summer");
            fruits[5] = new FruitProduce("Strawberry", "Fruit", 4.0, 60, "Box", "BerryLand",
                    "Berry Fields", "Spring", "Berry", "None", "Strawberry", "Refrigerated", "Spring");
            fruits[6] = new FruitProduce("Peach", "Fruit", 2.3, 90, "Kg", "PeachFields",
                    "Hill Farm", "Summer", "Drupe", "None", "Peach", "Cool, dry place", "Summer");
            fruits[7] = new FruitProduce("Grapes", "Fruit", 3.5, 110, "Kg", "Vineyard",
                    "Valley Farm", "Autumn", "Berry", "None", "Grapes", "Refrigerated", "Autumn");

            // Display before sorting
            System.out.println("=== BEFORE SORTING ===");
            for (FruitProduce fruit : fruits) {
                fruit.display();
            }

            // Perform selection sort
            ProduceUtility.selectionSort(fruits);
            System.out.println("\n=== AFTER SELECTION SORT (by Price) ===");
            for (FruitProduce fruit : fruits) {
                fruit.display();
            }

            // Perform insertion sort
            ProduceUtility.insertionSort(fruits);
            System.out.println("\n=== AFTER INSERTION SORT (by Price) ===");
            for (FruitProduce fruit : fruits) {
                fruit.display();
            }

            // Binary search by fruitType (sorted by fruitType first)
            ProduceUtility.sortByFruitType(fruits);
            String searchType1 = "Mango";
            int binaryIndex = ProduceUtility.binarySearch(fruits, searchType1);
            System.out.println(binaryIndex != -1
                    ? "\nBinary Search: '" + searchType1 + "' found at index " + binaryIndex + " → " + fruits[binaryIndex].getName()
                    : "\nBinary Search: '" + searchType1 + "' not found.");

            // Linear search by fruitType
            String searchType2 = "Peach";
            int linearIndex = ProduceUtility.linearSearch(fruits, searchType2);
            System.out.println(linearIndex != -1
                    ? "Linear Search: '" + searchType2 + "' found at index " + linearIndex + " → " + fruits[linearIndex].getName()
                    : "Linear Search: '" + searchType2 + "' not found.");

        } catch (OperationException e) {
            System.err.println("Operation Error: " + e.getMessage());
        }
    }
}
