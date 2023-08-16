package operators;

public class Operators_type {
	
	static int a = 5;
	static int b = 10;
	
	public static void main(String[] args) {
		String iam = "Gokul";
		System.out.println(iam);
		
		System.out.println(b/a);
		
		int add = a+b;
		System.out.println(add);
		
		int unary = a++; // a ku apram dhan ++ iteration agum so nexttime a va call pandrapo increace agirkum
		System.out.println(unary);
		
		int unary1 = ++a;
		System.out.println(unary1);
		
		float unary2 = b--;
		System.out.println(unary2);
		
		long unary3 = --b;
		System.out.println(unary3);
		
		System.out.println(a<b); // b vida a smaller
		System.out.println(a>b);  // b vida a greater
		System.out.println(a<=b);  // b vida a smaller or equal
	}

}
