

                    // task complete correct


package control_statement;

import java.util.Scanner;

public class Task_done {

	public static void main(String[] args) {

		int a = 500;
		int b;
		Scanner name = new Scanner (System.in);
		
		System.out.println("Enter your bill amount");
		int amount = name.nextInt();
		
		if (amount<a) {
			b = 5;
			
		} else {
			
			b = 10;

		}
		
		System.out.println("your discount is" + b + '%');
		int c = (amount * b)/ 100;
		System.out.println("your discount amount is" + c );
		System.out.println("your balance amount is" + (amount - c));
		System.out.println("thank you sir have a nice day");
		
		
		name.close();	
	}

}

//task

//enter your bill amount
//your discount is 5% or 10%
//your discount amount 
//balance amount
//thank you sir have a nice day
