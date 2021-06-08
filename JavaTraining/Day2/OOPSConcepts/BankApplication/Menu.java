package BankApplication;

import java.util.*;

public class Menu {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);

        //create initial accounts
        System.out.print("No of Customers: ");
        int n = scan.nextInt();
        
        Bank C[] = new Bank[n];
        for (int i = 0; i < C.length; i++)
        {
            C[i] = new Bank();
            C[i].createAccount();
        }

        //loop runs until exit is pressed
        int ch;
        while(true)
        {
                System.out.println("Menu\n1. Display All \n2. Deposit\n3. Withdrawal\n4. Transfer Fund \n5. Exit");
                System.out.println("Enter Choice :"); 
                ch = scan.nextInt();
                switch (ch) {
                
                    case 1:
                        for (int i = 0; i < C.length; i++) {
                            C[i].displayAccount();
                        }
                        break;

                    case 2:
                        System.out.print("Enter Account No : ");
                        long acn = scan.nextLong();
                        boolean found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                            	System.out.println("Enter Amount to be deposited : ");
                                long amt = scan.nextLong();
                                C[i].deposit(amt);
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Account Does Not Exist..");
                        }
                        break;

                    case 3:
                        System.out.print("Enter Account No : ");
                        acn = scan.nextLong();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                            	System.out.println("Enter Amount to withdraw : ");
                                long amt = scan.nextLong();
                                C[i].withdrawal(amt);
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Account Does Not Exist..");
                        }
                        break;
                        
                    case 4:
                    	System.out.print("Enter Account No : ");
                        acn = scan.nextLong();
                        System.out.print("Enter Recipient Account No : ");
                        long receipientAcn=scan.nextLong();
                        found = false;
                        boolean receipientFound=false;
                        long amt;
                        int senderIndex=-1,receipientIndex=-1;
                        for (int i=0 ;i <C.length;i++)
                        {
                        	
                        	if(found != true)
                        	{
                        		found = C[i].search(acn);
                        		if(found==true)
                            	{
                            		senderIndex=i;
                            		
                            	}
                        	}
                        	
                        	if(receipientFound != true)
                        	{
                        		receipientFound = C[i].search(receipientAcn);
                        		if(receipientFound==true)
                            	{
                            		receipientIndex=i;
                            	}
                        	}
                        	
                        	if(found==true && receipientFound==true)
                            {
                            	System.out.print("Enter amount to be transferred : ");
                            	amt = scan.nextLong();
                            	C[senderIndex].withdrawal(amt);
                            	C[receipientIndex].deposit(amt);
                            	break;
                            }
                           
                        }
                        if(found!=true || receipientFound!=true)
                        {
                        	System.out.println("Cannot transfer fund");
                        }
                        
                        break;
                    	

                    case 5:
                        System.exit(1);
                        
                    default:
                    	System.out.println("Incorrect Option");
                    	
                }
                
            }
           
         
        }
    
    }