package ClientServerCalci;


//for Simple Calculator using TCP
import java.io.DataInputStream;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
	public static void main(String args[])
	{
		try{

			//  Establish the socket connection.
			ServerSocket ss = new ServerSocket(9999);
			Socket s = ss.accept();
		
			// Processing the request.
			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			
			System.out.println("server");
			// wait for input
		
			double num1,num2,ans=0;
			boolean done=false;
			while (!done)
		    {  
		    		String input = dis.readUTF();
		    		done = input.equals("exit");
		    		String[] split = input.split(" ");
		    		// performs addition
		    		if (input.contains("+"))
		    		{   
		    			num1 = Double.parseDouble(split[0]);
		    		    num2 = Double.parseDouble(split[2]);
		    		    ans = num1 + num2;
		    		      		    
		    		}
		    		 //performs subtraction
		    		else if (input.contains("-"))
		    		{
		    		    num1 = Double.parseDouble(split[0]);
		    		    num2 = Double.parseDouble(split[2]);
		    		    ans = num1 - num2;
		    		      		    
		    		}
		    		
		    		//performs multiplication
		    	    else if (input.contains("*"))
		    		{
		    		     num1 = Double.parseDouble(split[0]);
		    		     num2 = Double.parseDouble(split[2]);
		    		     System.out.print(num1 );
		    		     System.out.print(num2 );
		      		   	 ans=num1 * num2;
		    		      		    
		    		}
		    		
		    		//performs division
		            else if (input.contains("/"))
		            {
		            	num1 = Double.parseDouble(split[0]);
		                num2 = Double.parseDouble(split[2]);
		      		    ans = num1 / num2;
		      		    
		            }
		    		
		    		//performs squaring
		            else if (input.contains("square"))
		            {
		            	num1 = Double.parseDouble(split[0]);
		      		    ans = num1 * num1;
		      		    
		            }
		            
		    		//performs cubing
		            else if (input.contains("cube"))
		            {
		            	num1 = Double.parseDouble(split[0]);
		      		    ans = num1 * num1 * num1;
		      		    
		            }
		            
		    		//find remainder
		            else if (input.contains("%"))
		            {
		            	num1 = Double.parseDouble(split[0]);
		                num2 = Double.parseDouble(split[2]);
		      		    ans = num1 % num2;
		      		    
		            }
		            
		    		//find factorial
		            else if (input.contains("factorial"))
		            {
		            	num1 = Double.parseDouble(split[0]);
		      		    ans=1;
		      		    if(num1==0)
		      		    {
		      		    	ans=1;
		      		    	return;
		      		    }
		      		    for(double i=1;i<=num1;i++)
		      		    {    
		      		    	ans=ans*i;   
		      		    	System.out.print(ans);
		      		    }    
		      		}
		    		//finding power
		            else if (input.contains("^"))
		            {
		            	num1 = Double.parseDouble(split[0]);
		                num2 = Double.parseDouble(split[2]);
		      		    ans=Math.pow(num1, num2);
		      		    
		            }
		    	    
		    		//writes result
		    		dos.writeUTF(Double.toString(ans));
        		
		    }
		  } 
		  catch(IOException ioe)
          {  
			 System.out.print(ioe.getMessage());
          }
			
        
	}
}