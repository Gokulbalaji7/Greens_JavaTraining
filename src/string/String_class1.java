package string;

public class String_class1 {

	public static void main(String[] args) {

		String a = " Gokul ";
		
		String b = " gokul ";
		
		String c =  " Gokul ";
		
		int g = a.length();
		System.out.println("length is " + g);
		
		boolean g1 = a.equals(b);
		System.out.println("string is " + g1);
		
		boolean g2 = a.equalsIgnoreCase(b);
		System.out.println("string is " + g2);
		
		String g3 = a.toUpperCase();
		System.out.println("uppercase is " + g3);
		
		String g4 = b.toLowerCase();
		System.out.println("lowercase is " + g4);
		
		System.out.println();
		
		char g5 = a.charAt(3);
		System.out.println("g5 char is " + g5);
		
		
// ref string class 3 also how to find string value storage type syso
//then inside() bracket of syso type System.identifyhashcode thenchange
//the referance name to a.
		
		System.out.println(System.identityHashCode(a));
		
		System.out.println(System.identityHashCode(c));
		
// ipo a and c two string ku same value or duplicate value same aa
//vandha java ore memory laye dhan values aa allogate pannum
		
		
		
		
		
	}

}
