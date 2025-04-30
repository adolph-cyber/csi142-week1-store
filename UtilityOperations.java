public class UtilityOperations {

    public static void selectionSort(double[] arr) throws OperationException {
        if (arr == null || arr.length == 0) {
            throw new OperationException("Array is null or empty.");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            double temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    public static void insertionSort(double[] arr) throws OperationException {
        if (arr == null || arr.length == 0) {
            throw new OperationException("Array is null or empty.");
        }
        for (int i = 1; i < arr.length; i++) {
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static int binarySearch(double[] arr, double key) throws OperationException {
        if (arr == null || arr.length == 0) {
            throw new OperationException("Array is null or empty.");
        }
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        throw new OperationException("Key not found in array.");
    }

    public static int linearSearch(FruitProduce[] arr, String key) throws OperationException {
        if (arr == null || arr.length == 0) {
            throw new OperationException("Array is null or empty.");
        }
    
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getFruitType().equalsIgnoreCase(key)) {
                return i;
            }
        }
    
        return -1;  // Not found
    }
    
}
