package Collections;

import java.util.*;

public class TMap {
	public static void main(String args[])
	{
		TreeMap<String,Integer> tree = new TreeMap<String,Integer>();
		
		tree.put("A",0);
        tree.put("B",15);
        tree.put("G",20);
        tree.put("W",25);
        tree.put("Y",30);
        

        // Print size and content
        System.out.println("Size of map is:- " + tree.size());
        System.out.println(tree);
  
        // Check if a key is present and if
        // present, print value
        if (tree.containsKey("A")) {
            Integer a = tree.get("A");
            System.out.println("value for key" + " \"A\" is: " + a);
        }
        
     // remove element with a key
        // using remove method
        tree.remove("B");
  
        // Final HashMap
        System.out.println("Mappings after removal are : " + tree);
        
        // Iterate the map using
        // for-each loop
        for (Map.Entry<String , Integer> e : tree.entrySet())
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        
        // provide value for new key which is absent
        // using computeIfAbsent method
        tree.computeIfAbsent("E", k -> 70);
        
        System.out.println(tree);
        
        System.out.println("Contains A : " + tree.containsKey("A"));
        
        System.out.println("Contains 99 : " + tree.containsValue(99));
        
        System.out.println("Keys: " + tree.keySet());
        
        System.out.println("values: " + tree.values());
        
        System.out.println(tree.getOrDefault("Z", 0));
        
        tree.putIfAbsent("X", 25);
        System.out.println(tree);
        
        tree.replace("A", 10);
        System.out.println(tree);
        
        
        System.out.println("first key :"+tree.firstKey());
        System.out.println("first key :"+tree.lastKey());
        
     // Creating the sorted map for map head
        SortedMap<String,Integer> map_head = new TreeMap<String,Integer>();
        map_head = tree.headMap("G");
  
        // Getting the map head
        System.out.println("The headmap is: " + map_head);
        
        
        
		
		
	}

}
