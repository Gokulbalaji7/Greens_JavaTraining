package scanner_task;

import java.util.Scanner;

public class Scanner_studentinfo {
	
	public static void main(String[] args) {
		
//first type S in capital Scanner and give ctrl + space then click scanner java.until
//then it will comes import to top of the class refer point no 3
// then type the scanner syntax
		Scanner ref = new Scanner(System.in);
		
		System.out.println("enter student address");
		String next2 = ref.nextLine();
		System.out.println("student address :" + next2);
		
// how to take return type refer point 23
//so first type reference name given in syntax
// then dot . then next nu type pananum then cntl +space
// then namaku theva padra mathiri datatype oda varum adhula select pankanum.
// select pana apram patha last la end ;semicolan irukadhu so retun type edukanum,
// then adha click panitu cntl + 2 kodukanum apram right cornor la options varum
// adhula assighned to local variable nu varum adha select pankanum return type done.

		
// next and nextline this functions used to get only for string types
// next and nextline accept only string not datatypes		
		System.out.println("enter student first name"); // first step syso
		String next = ref.next(); // second step returntype edukanum
		System.out.println("my first name is - " + 'R'+' '+ next); // 3rd step syso

		//System.out.println("enter student address");
		//String next2 = ref.nextLine();
		//System.out.println("student address :" + next2);
		
//this all functions used only to get datatypes
		System.out.println("enter student age");
		short nextShort = ref.nextShort();
		System.out.println("my age is " + nextShort);

		System.out.println("student mobile num");
		int nextInt = ref.nextInt();
		System.out.println("my mobile num " + '-' + nextInt);

		System.out.println("student account number");
		long nextLong = ref.nextLong();
		System.out.println("my account no" + '-' + nextLong);
		
		ref.close();
// at last syntax la irukra referance name koduthu cntl+space kodutha close kekum it must

	}

}
