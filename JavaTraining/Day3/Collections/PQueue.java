package Collections;

import java.util.*;

public class PQueue {
	
	public static void main(String args[])
	{
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(new Comparator<Integer>() {

                    public int compare(Integer a, Integer b)
                    {
                        if (a < b)
                            return 1;
                        if (a > b)
                            return -1;
                        return 0;
                    }
                });;
		 
        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.offer(40);
 
        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());
 
        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());
        
        System.out.println(pQueue.element());
 
      
        
        pQueue.remove(20);
        
        System.out.println("After Remove - " + pQueue);
        
        Iterator<Integer> iterator = pQueue.iterator();
        
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        
        System.out.println("\n is the Priority Queue empty : " + pQueue.isEmpty());
        
        pQueue.clear();
        
        System.out.println("\n Peek : " + pQueue.peek());
        
        System.out.println("\n Element : " + pQueue.element());
        
        
        
	}

}
