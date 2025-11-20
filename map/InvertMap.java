package map;

import java.util.*;

public class InvertMap {

    public static <K, V> Map<V, List<K>> invert(Map<K, V> originalMap) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();

            // If value not present, add a new list
            invertedMap.putIfAbsent(value, new ArrayList<>());

            // Add key to the list of keys for this value
            invertedMap.get(value).add(key);
        }
        return invertedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        System.out.println("Original Map: " + map);
        System.out.println("Inverted Map: " + invert(map));
    }
}

