package Exercise;

import java.util.Scanner;
public class Pattern {
	
	 
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);

	        int rows = sc.nextInt();
	         
	        // rows
	        for (int i = 1; i <= rows; i++) 
	        {
	            int num = i;
	             //columns
	            for (int j = 1; j <= i; j++) 
	            {
	                System.out.print(num+" ");
	                 
	                num = num+rows-j;
	            }
	             
	            System.out.println();
	        }
	         
	        sc.close();
	    }
	}


