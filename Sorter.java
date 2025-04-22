import java.util.List;

public class Sorter {

    // Selection Sort by Price (for Produce)
    public static void selectionSortByPrice(List<Produce> produceList) {
        for (int i = 0; i < produceList.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < produceList.size(); j++) {
                if (produceList.get(j).getPrice() < produceList.get(minIndex).getPrice()) {
                    minIndex = j;
                }
            }
            Produce temp = produceList.get(minIndex);
            produceList.set(minIndex, produceList.get(i));
            produceList.set(i, temp);
        }
    }

    // Insertion Sort by Jersey Number (for Players)
    public static void insertionSortByJerseyNumber(List<Player> players) {
        for (int i = 1; i < players.size(); i++) {
            Player key = players.get(i);
            int j = i - 1;
            while (j >= 0 && players.get(j).getJerseyNumber() > key.getJerseyNumber()) {
                players.set(j + 1, players.get(j));
                j--;
            }
            players.set(j + 1, key);
        }
    }

    // Linear Search for Produce Name
    public static int linearSearchProduce(List<Produce> produceList, String name) {
        for (int i = 0; i < produceList.size(); i++) {
            if (produceList.get(i).getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search for Player Jersey Number (requires sorted data)
    public static int binarySearchPlayer(List<Player> players, int jerseyNumber) {
        int left = 0, right = players.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (players.get(mid).getJerseyNumber() == jerseyNumber) {
                return mid;
            }
            if (players.get(mid).getJerseyNumber() < jerseyNumber) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}