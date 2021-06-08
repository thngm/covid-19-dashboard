import java.util.Scanner;

import java.lang.System;

public class Calculator {
	  double num1,num2;
	  double ans;
	  String op;
	  Scanner scan = new Scanner(System.in);
	    
	  public static void main(String[] args) 
	  {
		  Calculator calci = new Calculator();
		  
		  calci.calculate();
		  
	  }
	  
	  
	  public void calculate()
	  {
		  Calculator cal = new Calculator();
		  
	       while(true )
	      {   
	    	  //display menu to user
	    	  System.out.print("Enter two numbers: ");
	    	  System.out.println("1.Enter add for addition  ");
	    	  System.out.println("2.Enter sub for subtraction  ");
	    	  System.out.println("3.Enter mul for multiplication  ");
	    	  System.out.println("4.Enter div for division ");
	    	  System.out.println("5.Enter mod for modulo operation ");
	    	  System.out.println("6.Enter sq for squaring  ");
	    	  System.out.println("7.Enter cube for cubing  ");
	    	  System.out.println("8.Enter fact for finding factorial  ");
	    	  System.out.println("9.Enter pow for finding power  ");
	    	  System.out.println("10.Enter exit for exiting  ");
	    	  
	    	  op = scan.nextLine().toLowerCase();
	    	  
	    	  switch(op) {
	    	  	case "add": 
	    	  		ans=cal.add();
	    	  		break;
	    	  	case "sub": 
	    	  		ans=cal.sub();
	    	  		break;
	    	  	case "mul": 
	    	  		ans=cal.multiply();
	    	  		break;
	    	  	case "div":
	    	  		ans=cal.divide();
	    	  		break;
	    	  	case "mod":
	    	  		ans=cal.remainder();
	    	  		break;
	    	  	case "sq":
	    	  		ans=cal.square();
	    	  		break;
	    	  	case "cube":
	    	  		ans=cal.cube();
	    	  		break;
	    	  	case "fact":
	    	  		ans=cal.factorial();
	        	 	break;
	    	  	case "pow":
	    	  		ans=cal.power();
	    	  		break;
	    	  	case "exit":
	    	  		System.exit(0);
	    	  	default: 
	    	  		System.out.println("Enter correct option");
	       
	      }
	      
	      //printing the result
	      System.out.println("Result is "+ ans);
	     
	   }
	  }
	  
	  //method to perform addition
	  public double add()
	  {
		  System.out.println("Enter 2 nos");
		  num1=scan.nextDouble();
		  num2=scan.nextDouble();
		  ans = num1 + num2;
		  return ans; 
	  }
	  
	  //method to perform subtraction
	  public double sub()
	  {
		  System.out.println("Enter 2 nos");
		  num1=scan.nextDouble();
		  num2=scan.nextDouble();
		  ans = num1 - num2;
		  return ans;
	  }
	  
	  //method to perform multiplication
	  public double multiply()
	  {
		  System.out.println("Enter 2 nos");
		  num1=scan.nextDouble();
		  num2=scan.nextDouble();
		  ans = num1 * num2;
		  return ans;
	  }
	  
	  //method to perform division
	  public double divide()
	  {
		  System.out.println("Enter 2 nos");
		  num1=scan.nextDouble();
		  num2=scan.nextDouble();
		  ans = num1 / num2;
		  return ans;
	  }
	  public double remainder()
	  {
		  System.out.println("Enter 2 nos");
		  num1=scan.nextDouble();
		  num2=scan.nextDouble();
		  ans = num1 % num2;
		  return ans;
		  
	  }
	  
	  //method to perform squaring
	  public double square()
	  {
		  System.out.println("Enter 1 no");
		  num1=scan.nextDouble();
		  ans = num1 * num1;
		  return ans;
		  
	  }
	  
	  //method to perform cubing
	  public double cube()
	  {
		  System.out.println("Enter 1 no");
		  num1=scan.nextDouble();
		  ans = num1 * num1 * num1;
		  return ans;
		  
	  }
	  
	  //method to find factorial
	  public double factorial()
	  {
		  System.out.println("Enter 1 no");
		  num1=scan.nextDouble();
		  ans=1;
		  if(num1==0)
		  {
			  return 1;
		  }
		  for(double i=1;i<=num1;i++){    
		      ans=ans*i;   
		      
		  }    
		  return ans;
		  
	  }
	  
	  //method to perform power
	  public double power()
	  {
		  System.out.println("Enter 2 nos");
		  num1=scan.nextDouble();
		  num2=scan.nextDouble();
		  ans=Math.pow(num1, num2);
		  return ans;
		  
	  }
	  
	  
}


