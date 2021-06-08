package Collections;

import java.util.*;

public class LinkedHMap {

	public static void main(String args[])
	{
		// Create an empty hash map
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
  
        // Add elements to the map
        map.put("A", 10);
        map.put("B", 30);
        map.put("C", 20);
        map.put("C", 50);
  
        // Print size and content
        System.out.println("Size of map is:- " + map.size());
        System.out.println(map);
  
        // Check if a key is present and if
        // present, print value
        if (map.containsKey("A")) {
            Integer a = map.get("A");
            System.out.println("value for key" + " \"A\" is: " + a);
        }
        
     // remove element with a key
        // using remove method
        map.remove("B");
  
        // Final HashMap
        System.out.println("Mappings after removal are : " + map);
        
        // Iterate the map using
        // for-each loop
        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        
        // provide value for new key which is absent
        // using computeIfAbsent method
        map.computeIfAbsent("E", k -> 70);
        
        System.out.println(map);
        
        System.out.println("Contains A : " + map.containsKey("A"));
        
        System.out.println("Contains 99 : " + map.containsValue(99));
        
        System.out.println("Keys: " + map.keySet());
        
        System.out.println("values: " + map.values());
        
        System.out.println(map.getOrDefault("Z", 0));
        
        map.putIfAbsent("X", 25);
        System.out.println(map);
        
        map.replace("A", 0);
        System.out.println(map);
        
        
        
       
        
        
	}
}
