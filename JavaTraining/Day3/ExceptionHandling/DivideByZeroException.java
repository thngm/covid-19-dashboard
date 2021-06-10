package Exceptions;

import java.util.Scanner;

public class DivideByZeroException {
	
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
		    while(true)
		    {
			  try
			  {
				System.out.print("enter numerator: ");
				String input1=scan.next();
				
				if(input1.contains("q") || input1.contains("Q"))
				{
					System.out.println("Exiting");
					System.exit(1);
				}
				
				double numerator=Double.parseDouble(input1);
				System.out.print("enter denominator: ");
				String input2=scan.next();
				double denominator =Double.parseDouble(input2);
				
				double result =numerator/denominator;
			 	System.out.println("result :"+ result);
			  }
			  catch(ArithmeticException e)
			  {
				 System.out.println("Denominator cant be 0..try with another no");
			  }
			  catch(NumberFormatException e)
			  {
				  System.out.println("enter an integer value");
			  }
			 
		    }
		
	}


}
