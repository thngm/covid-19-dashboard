package Exercise;

import java.util.regex.Pattern;
import java.util.Scanner;

public class ValidationRegex {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter Name : ");
    	String name = sc.nextLine();
    	
    	System.out.println("Enter Phone no : ");
    	String phoneNo = sc.nextLine();
    	
    	System.out.println("Enter email id : ");
    	String emailId = sc.nextLine();
    	
  
    	//name validation
    	if(name.matches("^[a-zA-Z\\s]*$"))
        {
        	System.out.println("Name is valid");
        }
    	else
    	{
    		System.out.println("Invalid name");
    	}
    	//phone no validation
    	if (phoneNo.matches("\\d{10}"))
        {
        	System.out.println("Phone no is valid");
        }
    	else
    	{
    		System.out.println("Invalid phone no");
    	}
    	
    	//email id validation
    	if (emailId.matches("^[a-zA-Z0-9+_.-]+@([a-zA-Z]+\\.)+[a-zA-Z]{2,6}$"))
    	{
    		System.out.println("email id is valid");
    	}
    	else
    	{
    		System.out.println("Invalid email id");
    	}
         
    }
}