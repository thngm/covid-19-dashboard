package Java8Ex;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]){
		        Scanner sc = new Scanner(System.in);
		          
		        int choice;
		        while(true) {
		        	//display menu to user
			    	 System.out.print("Enter two numbers: ");
			    	 System.out.println("1.Enter add for addition  ");
			    	 System.out.println("2.Enter sub for subtraction  ");
			    	 System.out.println("3.Enter mul for multiplication  ");
			    	 System.out.println("4.Enter div for division ");
			    	 System.out.println("5.Enter mod for modulo operation ");
			    	 System.out.println("6.Enter sq for squaring  ");
			    	 System.out.println("7.Enter cube for cubing  ");
			    	 System.out.println("8.Enter pow for finding power  ");
			    	 System.out.println("9.Enter exit for exiting  ");
			    	  
		            choice = sc.nextInt();
		            
		            double number1,number2;

		            switch(choice) {
		                    case 1:{
		                            //add operation
		                            System.out.print("\nEnter First number: ");
		                            number1 = sc.nextDouble();
		                            System.out.print("\nEnter second number: ");
		                            number2 = sc.nextDouble();
		                            System.out.print("\nResult: ");

		                            CalculatorIf adder = (num1, num2) -> num1 + num2;
		                            System.out.println(adder.calculate(number1, number2));
		                            break;
		                    }
		                    case 2:{
		                            //subtraction
		                            System.out.print("\nEnter the First number: ");
		                            number1 = sc.nextDouble();
		                            System.out.print("\nEnter the second number: ");
		                            number2 = sc.nextDouble();
		                            System.out.print("\nResult: ");

		                            CalculatorIf subtract = (num1, num2) -> num1 - num2;
		                            System.out.println(subtract.calculate(number1, number2));
		                            break;
		                    }
		                    case 3:{
		                            //multiplication
		                            System.out.print("\nEnter the first number: ");
		                            number1 = sc.nextDouble();
		                            System.out.print("\nEnter the second number: ");
		                            number2 = sc.nextDouble();
		                            System.out.print("\nResult: ");

		                            CalculatorIf multiply = (num1, num2) -> num1 * num2;
		                            System.out.println(multiply.calculate(number1, number2));
		                            break;
		                    }
		                    case 4:{
		                            //division
		                            System.out.print("\nEnter operand1: ");
		                            number1 = sc.nextDouble();
		                            System.out.print("\nEnter operand2: ");
		                            number2 = sc.nextDouble();
		                            System.out.print("\nResult: ");

		                            CalculatorIf division = (num1, num2) -> num1 / num2;
		                            System.out.println(division.calculate(number1, number2));
		                            break;
		                    }
		                    case 5:{
		                            //modulus operation
		                            System.out.print("\nEnter operand1: ");
		                            number1 = sc.nextDouble();
		                            System.out.print("\nEnter operand2: ");
		                            number2 = sc.nextDouble();
		                            System.out.print("\nResult: ");

		                            CalculatorIf mod = (num1, num2) -> num1 % num2;
		                            System.out.println(mod.calculate(number1, number2));
		                            break;
		                    }
		                    case 6:{
		                            //squaring
		                            System.out.print("\nEnter the number ");
		                            number1 = sc.nextDouble();
		                            System.out.print("\nResult: ");

		                            System.out.println(CalculatorIf.square(number1));
		                            break;
		                    }
		                    case 7:{
		                            //cubing
		                            System.out.print("\nEnter the number: ");
		                            number1 = sc.nextDouble();
		                            System.out.print("\nResult: ");

		                            System.out.println(CalculatorIf.cube(number1));
		                            break;
		                    }
		 
		                    case 8:{
		                            //power
		                            System.out.print("\nEnter the First number:  ");
		                            number1 = sc.nextDouble();
		                            System.out.print("\nEnter the second number: ");
		                            number2 = sc.nextDouble();
		                            System.out.print("\nResult: ");

		                            CalculatorIf power = (num1, num2) -> Math.pow(num1, num2);
		                            System.out.println(power.calculate(number1, number2));
		                            break;
		                    }
		                    case 9:{
			                    	//exit
			                    	System.out.println("Exiting...");
			                    	System.exit(1);
		                    	
		                    }

		                    default:
		                            System.out.println("\nU have entered an invalid option..enter a valid one");
		            }	
		           
		    }
	}


}
