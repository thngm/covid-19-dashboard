package Exceptions;

import java.util.Scanner;

public class NoFormatException {

	public static void main (String [] args)
	{
	   
	    
	    double sum=0,score;
        Scanner sc = new Scanner(System.in);
	    
	    while(true)
	    {
	    	try
		      {
		    	  for (int i = 1; i <= 10; i++)
		  	      {
		            System.out.println("Enter mark " + i );
		        
		            score = Double.parseDouble(sc.next());
		            if(score>100)
		            {
		            	//exception is thrown
		            	throw new ScoreOutOfRangeException("Enter score within range 0-100");
		            }
		            else if(score<0)
		            {
		            	//exception is thrown
		            	throw new NegValueException("Enter positive values");
		            }
		            sum+=score;
		  	      }
		    	  
		    	  System.out.println("Average is : " + sum/10.0);
				  return;
		    	  
		      }  
		      
	    	  
	    	  catch(ScoreOutOfRangeException se)
	    	  {
                System.out.println(se.getMessage());

              }
	    	
	    	  catch(NegValueException e)
	    	  {
                System.out.println(e.getMessage());
              }
	    	 
	    	catch(NumberFormatException e)
		      {
		        System.out.println("enter an integer..");
		      }
            	    
	      
	    }
	     
	    }
}
