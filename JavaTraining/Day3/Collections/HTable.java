package Collections;

import java.util.*;

public class HTable {
	
	 public static void main(String args[])
	 {
		 Hashtable<Integer, String> ht1 = new Hashtable<>(5,0.5f);
		  
	    
	     Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(ht1);

	     // Inserting the Elements
	     // using put() method
	     ht1.put(1, "one");
	     ht1.put(2, "two");
	     ht1.put(3, "three");
	     ht1.put(2, "Two");

	     ht2.put(4, "four");
	     ht2.put(5, "five");
	     ht2.put(6, "six");
	     

	     // Print mappings to the console
	     System.out.println("Mappings of ht1 : " + ht1);
	     System.out.println("Mappings of ht2 : " + ht2);
	     
	     ht2.remove(4);
	     System.out.println("Mappings of ht2 : " + ht2);
	     
	     // Iterating using enhanced for loop
	        for (Map.Entry<Integer , String> e : ht1.entrySet())
	            System.out.println(e.getKey() + " " + e.getValue());
	        
	     // provide value for new key which is absent
	     // using computeIfAbsent method
         ht1.computeIfAbsent(8, k -> "eight");
	        
	     System.out.println(ht1);
	        
	     System.out.println("Contains 8 : " + ht1.containsKey(8));
	        
	     System.out.println("Contains two : " + ht1.containsValue("two"));
	        
	     System.out.println("Keys: " + ht1.keySet());
	        
	     System.out.println("values: " + ht1.values());
	        
	     System.out.println(ht1.getOrDefault(9, "nine"));
	        
	     ht1.putIfAbsent(10, "ten");
	     System.out.println(ht1);
	        
	     ht1.replace(1, "ONE");
	     System.out.println(ht1); 
	        
	 }

}
