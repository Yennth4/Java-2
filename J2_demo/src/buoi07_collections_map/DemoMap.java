package buoi07_collections_map;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("iPhone", 30);
        myMap.put("Samsung", 15);
        myMap.put("Oppo", 5);
        myMap.put("Nokia", 3);
        myMap.put("Samsung", 31);
        
        System.out.println(myMap);
    }
}
