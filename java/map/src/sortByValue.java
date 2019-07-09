import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class sortByValue {
    // This map stores unsorted values
    static Map<String, Integer> map = new HashMap<>();

    // Function to sort map by Key
    public static void sortbykey() {

        // TreeMap to store values of HashMap
        TreeMap<String, Integer> sorted = new TreeMap<>();

        // Copy all data from hashMap into TreeMap
        sorted.putAll(map);

        LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();

        // Display the Value which is naturally sorted
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMap.put(x.getValue(), x.getKey()));

        System.out.println(sortedMap);

    }
    public static void main(String[] args) {


        {
            // putting values in the Map
            map.put("Jayant", 80);
            map.put("Abhishek", 90);
            map.put("Anushka", 80);
            map.put("Amit", 75);
            map.put("Danish", 40);

            // Calling the function to sortbyKey
            sortbykey();
        }
    }
}
