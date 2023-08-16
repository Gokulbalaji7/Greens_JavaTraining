package string;

public class String_class2 {

	public static void main(String[] args) {

		String a = " Gokul ";

		String b = " gokul ";

		String c = " Greens tech java training  ";

//to find length value	
		
		int g = a.length();
		System.out.println("length value is " + g);
		
// to find index value
// a.length thn returntype then add -1 after the length()	
		
		int findindexvalue = a.length()-1;
		System.out.println("index value is " + findindexvalue);
		
		boolean g1 = a.equals(b);
		System.out.println("boolean equals is " + g1);

		boolean g2 = a.equalsIgnoreCase(b);
		System.out.println("equalsIgnoreCase is " + g2);

		String g3 = c.toUpperCase();
		System.out.println("uppercase is " + g3);

		String g4 = b.toLowerCase();
		System.out.println("lowercase is" + g4);

		char g5 = a.charAt(3);
		System.out.println("g5 char is " + g5);

		int g6 = a.indexOf('u');
		System.out.println("indexof u is " + g6);

		int g7 = b.indexOf('r');
		System.out.println("indexof unknown char is " + g7);

		int g8 = c.lastIndexOf('n');
		System.out.println("lastindexof n is " + g8);

		boolean g9 = a.contains("Gok");
		System.out.println("boolean contains is " + g9);

		boolean g10 = a.contains("gok");
		System.out.println("boolean contains is " + g10);

		boolean g11 = c.startsWith("G");
		System.out.println("boolean startswith " + g11);

		boolean g12 = c.endsWith("g");
		System.out.println("boolean startswith " + g12);

		String g13 = c.trim();
		System.out.println("trim only space in "+ g13);
		
		String g14 = c.replace("t", "T");
		System.out.println("replace new char is"+g14);
		
		String g15 = c.replaceAll("training","program");
		System.out.println("string word is" + g15);
		
		String g16 = b.concat(c);
		System.out.println("To merge a two strings"+g16);
		
		String g17 = c.substring(3);
		System.out.println("after subtring only printed " +g17);
		
		String g18 = c.substring(3, 16);
		System.out.println("in substring end -1 " + g18);
		
		boolean g19 = a.isEmpty();
		System.out.println("empty is " + g19);
			
// split want to know and used for loop . important
	}

}
