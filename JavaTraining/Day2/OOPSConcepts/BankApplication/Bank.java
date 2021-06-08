package BankApplication;

import java.util.Scanner;

class Bank {
    private long accno;
    private String name;
    private long balance;

    Scanner scan = new Scanner(System.in);

    //method to create an account
    void createAccount() {
        System.out.print("Enter Account No: ");
        accno = scan.nextLong();
        System.out.print("Enter Name: ");
        name = scan.next();
        System.out.print("Enter Balance: ");
        balance = scan.nextLong();
    }

    //method to display account details
    void displayAccount() {
        System.out.println(accno + "," + name + "," + balance);
    }

    //method to deposit money
    void deposit(long amt) {
        balance = balance + amt;
    }

    //method to withdraw money
    void withdrawal(long amt) {
        if (balance >= amt) {
            balance = balance - amt;
        } else {
            System.out.println("Balance is insufficient");
        }
    }
    

    //method to search an account number
    boolean search(long acn) {
        if (accno==acn) {
        	return (true);
        }
        return (false);
    }
}