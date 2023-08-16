

                       // sample done


package control_statement;

import java.util.Scanner;

public class Task_sample {
	
	public static void main(String[] args) {
		
		Scanner gokul = new Scanner (System.in);
		
		int a = 500;
		int b;
		
		System.out.println("enter your bill amount");
		
		int bill = gokul.nextInt();
		
		if (bill<a) {
		b = 5;
		} else {
		b = 10;
		}
		
		System.out.println("your discount is" + b + '%' );
		
		int c = (bill/b);
		System.out.println("your discount amount is" + c);
		
		System.out.println("your balance amount is" + (bill - c));
		
		
		gokul.close();
		
			
	}

	}
	
//task

//enter your bill amount
//your discount is 5% or 10%
//your discount amount is
//your balance amount is
//thank you sir have a nice day

