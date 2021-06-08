package Collections;

import java.util.*;

public class HSet {
	public static void main(String args[])
	{
		HashSet<Integer> h = new HashSet<Integer>();
		  
	    // Adding elements into HashSet using add()
	    h.add(1);
	    h.add(2);
	    h.add(3);
	    h.add(3); // adding duplicate elements

	    // Displaying the HashSet
	    System.out.println(h);
	    System.out.println("List contains 1 or not:" + h.contains(1));

	    // Removing items from HashSet using remove()
	    h.remove(2);
	    System.out.println("List after removing 2:"+ h);

	    // Iterating over hash set items
	    System.out.println("Iterating over list:");
	    Iterator<Integer> i = h.iterator();
	    while (i.hasNext())
	        System.out.println(i.next());
	    
        System.out.println("hashcode :" + h.hashCode());
	}
}


