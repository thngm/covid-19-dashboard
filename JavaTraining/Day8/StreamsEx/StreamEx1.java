package Java8Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
	
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<>();
		//adding nos to list
		list.add(5);
		list.add(7);
		list.add(6);
		list.add(8);
		
		//find min
		int min = list.stream().mapToInt(a->a).min().orElse(0);
	    System.out.println("min element :"+ min);
	    
	    //find max
	    int max = list.stream().mapToInt(a->a).max().orElse(0);
	    System.out.println("max element :"+ max);
	    
	    //find avg
	    double average = list.stream().mapToInt(a->a).average().orElse(0);
	    System.out.println("average :" + average);
	}

}
