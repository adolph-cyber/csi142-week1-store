// Linear Search for a string field (e.g., name), returning an index or -1
    public static int linearSearch(List<String> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }