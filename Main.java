public class Main {
    public static void main(String[] args) {
        try {
            // An array of 8 FruitProduce objects with local context
            FruitProduce[] fruits = new FruitProduce[8];
            fruits[0] = new FruitProduce("Marula", "Fruit", 1.8, 90, "Kg", "Maun Wild Harvest", "Marula", "Summer", "Cool, dry place");
            fruits[1] = new FruitProduce("Naartjie", "Fruit", 2.2, 120, "Bag", "Citrusdal Co-op", "Naartjie", "Winter", "Refrigerated");
            fruits[2] = new FruitProduce("Mopane Worm Fruit Mix", "Fruit", 3.5, 60, "Pack", "Gweta Agro", "Mopane Blend", "Summer", "Dry storage");
            fruits[3] = new FruitProduce("Papaya", "Fruit", 2.0, 100, "Kg", "Francistown Tropicals", "Papaya", "Spring", "Cool storage");
            fruits[4] = new FruitProduce("Granadilla", "Fruit", 4.0, 80, "Box", "Polokwane Fresh", "Granadilla", "Autumn", "Refrigerated");
            fruits[5] = new FruitProduce("Avocado", "Fruit", 3.0, 140, "Kg", "Limpopo Greens", "Avocado", "Spring", "Cool, dry place");
            fruits[6] = new FruitProduce("Guava", "Fruit", 2.5, 110, "Kg", "Thamaga Gardens", "Guava", "Summer", "Cool storage");
            fruits[7] = new FruitProduce("Litchi", "Fruit", 3.8, 70, "Box", "Mpumalanga Orchards", "Litchi", "Summer", "Refrigerated");

            // Show the array BEFORE sorting
            System.out.println("=== BEFORE SORTING ===");
            for (FruitProduce fruit : fruits) {
                fruit.display();
            }

            // Sort the fruits by price using selection sort
            SorterUtility.selectionSort(fruits);

            // Show the array AFTER sorting
            System.out.println("\n=== AFTER SORTING BY PRICE (Selection Sort) ===");
            for (FruitProduce fruit : fruits) {
                fruit.display();
            }

           //sort the fruits by price using Insertion sort    
            System.out.println("\n=== ARRAY BEFORE INSERTION SORT (Same as Original) ===");
            for (FruitProduce fruit : fruitsForInsertionSort) {
                 fruit.display(); // Show the copied, unsorted array
            }

            // Sort the 'fruitsForInsertionSort' array using insertion sort
            SorterUtility.insertionSort(fruitsForInsertionSort);

            System.out.println("\n=== AFTER SORTING BY PRICE (Insertion Sort) ===");
            for (FruitProduce fruit : fruitsForInsertionSort) {
                fruit.display();
            }

            //  Binary search by price
            double searchPrice1 = 2.0;
            double searchPrice2 = 3.8;

            int index1 = UtilityOperations.binarySearch(fruits, searchPrice1);
            System.out.println(index1 != -1
                ? "\nBinary Search: Product with price " + searchPrice1 + " found at index " + index1 +
                  " → " + fruits[index1].getName()
                : "\nBinary Search: Product with price " + searchPrice1 + " not found.");

            int index2 = UtilityOperations.binarySearch(fruits, searchPrice2);
            System.out.println(index2 != -1
                ? "Binary Search: Product with price " + searchPrice2 + " found at index " + index2 +
                  " → " + fruits[index2].getName()
                : "Binary Search: Product with price " + searchPrice2 + " not found.");

            // Linear search by fruit type
            String searchFruitType = "Guava";
            int linearIndex = UtilityOperations.linearSearch(fruits, searchFruitType);

            System.out.println(linearIndex != -1
                ? "Linear Search: Fruit type '" + searchFruitType + "' found at index " + linearIndex +
                  " → " + fruits[linearIndex].getName()
                : "Linear Search: Fruit type '" + searchFruitType + "' not found.");

        } catch (OperationException e) {
            System.err.println("Operation Error: " + e.getMessage());
        }
    }
}
