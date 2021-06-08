package Collections;

import java.util.SortedSet;  
import java.util.TreeSet;  

public class SortdSet{  
   public static void main(String[] args) {  
       SortedSet<Integer> nos = new TreeSet();   
            // Add the elements in the given set.  
            nos.add(5);  
            nos.add(2);  
            nos.add(7);  
            nos.add(9);  
            System.out.println("set :");  
            for (Integer no : nos) {  
                System.out.println(no);  
                  }  
            //Returns the first element  
           System.out.println("The first element is given as: " + nos.first()); 
           
            //Returns the last element  
           System.out.println("The last element is given as: " + nos.last());  
           
           //Returns a view of the portion of the given set whose elements are strictly less than the toElement.   
           System.out.println("The respective element is given as: " + nos.headSet(5));
           
           //returns a subset 
           System.out.println("The elements of subset are given as: " + nos.subSet(5, 8)); 
           
           System.out.println("The respective element is given as: " + nos.tailSet(7));  
   }    
}  