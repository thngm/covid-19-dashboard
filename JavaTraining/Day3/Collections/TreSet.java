package Collections;

import java.util.*;

public class TreSet {	
	
	public static void main(String args[])
	{
		TreeSet<String> ts1 = new TreeSet<>();
		 
        // Elements are added using add() method
        ts1.add("A");
        ts1.add("B");
        ts1.add("C");
        ts1.add("D");
 
        // Duplicates will not get insert
        ts1.add("C");
 
        // Elements get stored in default natural
        // Sorting Order(Ascending)
        System.out.println(ts1);
        
        System.out.println("Contains A :"  +  ts1.contains("A"));

        // Print the first element in
        // the TreeSet
        System.out.println("First Value " + ts1.first());

        // Print the last element in
        // the TreeSet
        System.out.println("Last Value " + ts1.last());

   

        // Find the values just greater
        // and smaller 
        System.out.println("Higher " + ts1.higher("C"));
        System.out.println("Lower " + ts1.lower("C"));
        
        
        System.out.println("Initial TreeSet " + ts1);
        
        // Removing the element b
        ts1.remove("B");
 
        System.out.println("After removing element " + ts1);
 
        // Removing the first element
        ts1.pollFirst();
 
        System.out.println("After removing first " + ts1);
 
        // Removing the last element
        ts1.pollLast();
 
        System.out.println("After removing last " + ts1);
        
        
	}
}
