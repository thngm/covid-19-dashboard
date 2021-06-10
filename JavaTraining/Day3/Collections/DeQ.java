package Collections;

import java.util.*;

public class DeQ {

	public static void main(String[] args)
    {
        Deque<String> deque = new LinkedList<String>();
  
        // We can add elements to the queue
        // in various ways
  
        // Add at the last
        deque.add("Element 1 (Tail)");
  
        // Add at the first
        deque.addFirst("Element 2 (Head)");
  
        // Add at the last
        deque.addLast("Element 3 (Tail)");
  
        // Add at the first
        deque.push("Element 4 (Head)");
  
        // Add at the last
        deque.offer("Element 5 (Tail)");
  
        // Add at the first
        deque.offerFirst("Element 6 (Head)");
  
        System.out.println(deque + "\n");
  
        // We can remove the first element
        // or the last element.
        deque.removeFirst();
        deque.removeLast();
        
        System.out.println("dequeue :" + deque);
        
        // Call iterator() method of deque
        Iterator<String> iteratorVals = deque.iterator();
  
        // Print elements of iterator
        
        System.out.println("The iterator values of deque are:");
  
        // prints the elements using an iterator
        while (iteratorVals.hasNext()) {
            System.out.println(iteratorVals.next());
        }
        
     // Call iterator() method of deque
        Iterator<String> iteratorVal = deque.descendingIterator();
  
        // Print elements of iterator
        
        System.out.println("The iterator values of deque(rev order) are:");
  
        // prints the elements using an iterator
        while (iteratorVal.hasNext()) {
            System.out.println(iteratorVal.next());
        }
        
        System.out.println("peek first :" + deque.peekFirst());
        System.out.println("peek last :" + deque.peekLast());
        
        System.out.println("poll first :" + deque.pollFirst());
        System.out.println("poll last :" + deque.pollLast());
        
        System.out.println("Dequeue :" + deque);
        
        deque.push("Element 6 (Head)");
        deque.push("Element 5 (Head)");
        
        System.out.println("pop :" + deque.pop());
        System.out.println("Dequeue :" + deque);
        
        
        
        
        
        
        
    }
}
