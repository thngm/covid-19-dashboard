package Collections;

import java.util.*;
import org.json.simple.JSONObject;

import org.json.simple.JSONArray;

public class ArayList {

		public static void main(String[] args)
		{

			// Declaring the ArrayList 
			ArrayList<Integer> arr= new ArrayList<Integer>();

			// Appending new elements at
			// the end of the list
			
			arr.add(1);
			arr.add(2);
			arr.add(3);
			

			// Printing elements
			System.out.println(arr);
            
			arr.add(1,5);
			System.out.println(arr);
			
			// Remove element at index 2
			arr.remove(2);

			// Displaying the ArrayList
			// after deletion
			System.out.println(arr);
			
			arr.set(1, 0);
			System.out.println(arr);

			// create an empty array list2 
	        ArrayList<Integer> arr2 = new ArrayList<Integer>();
	  
	        // use add() method to add elements in list2
	        arr2.add(25);
	        arr2.add(30);
	        arr2.add(31);
	        arr2.add(3);
	  
	            
	        System.out.println(arr2);
	        // inserting all elements, list2 will get printed
	        // after list1
	        arr.addAll(arr2);
	        
			// Printing elements one by one
			for (int i = 0; i < arr.size(); i++)
				System.out.print(arr.get(i) + " ");
			
			
	        System.out.println("does the list contain 2 ? :"+arr.contains(2));
	        
	        System.out.println("The element 3 is at index : " + arr.indexOf(3) );
	        
	        
	    
	        System.out.println("The ArrayList is empty :" + arr.isEmpty());
	        
	        System.out.println("the lastIndexof of" + " 3 is " + arr.lastIndexOf(3));
	        
	        ListIterator<Integer> iterator = arr.listIterator();

	        // Printing the iterated value
	        System.out.println("\nUsing ListIterator:\n");
	        while (iterator.hasNext()) 
	        {
	        	System.out.println("Value is : " + iterator.next());
	        }
	        
	        arr.removeIf(n -> (n % 2 == 0));
	        
	        System.out.println(arr);
	        
	        ArrayList<Integer> arr3 = new ArrayList<Integer>();
	        arr3.addAll(arr2);
	        System.out.println("before retaining : " + arr);
	        arr.retainAll(arr3);
	        System.out.println("after retaining : " + arr);
	        
	        arr.clear();
	        System.out.println("after clearing : " + arr);
	       
		}
	}

