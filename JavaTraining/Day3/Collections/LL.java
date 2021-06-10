package Collections;

import java.util.*;

public class LL {
	 public static void main(String args[])
	    {
	        // Creating object of the
	        // class linked list
	        LinkedList<String> ll= new LinkedList<String>();
	  
	        // Adding elements to the linked list
	        ll.add("A");
	        ll.add("B");
	        ll.addLast("C");
	        ll.addFirst("D");
	        ll.add(2, "E");
	  
	        System.out.println(ll);
	  
	        ll.remove("B");
	        ll.remove(3);
	        ll.removeFirst();
	        ll.removeLast();
	  
	        System.out.println(ll);
	        
	        ll.set(0, "D"); 
	        ll.add("A");
	        ll.add("B");
	        
	        
	        System.out.println("Updated LinkedList " + ll);
	        
	        System.out.print(ll.get(1) + " ");
	        
	        Iterator<String> x = ll.descendingIterator();
	        
            // print list with descending order
            while (x.hasNext()) {
                System.out.println("Value is : "+ x.next());
            }
            
         // Creating a Collection
            LinkedList<String> collect = new LinkedList<String>();
            collect.add("A");
            collect.add("C");
            collect.add("P");
            collect.add("f");
            collect.add("G");
        
            // Displaying the list
            System.out.println("The LinkedList is: " + ll);
                    
            // Appending the collection to the list
            ll.addAll(1, collect);
        
           // Clearing the list using clear() and displaying
           System.out.println("The new linked list is: " + ll);
           ll.offer("X");
           ll.offerLast("Z");
           System.out.println("head is : " + ll.element());
           System.out.println("peek : " + ll.peek());
           System.out.println("peek : " + ll.poll());
           System.out.println("peek : " + ll.remove());
           System.out.println(ll);
           
           
           
           
	    }

}
