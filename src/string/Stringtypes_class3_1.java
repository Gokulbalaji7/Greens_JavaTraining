package string;

public class Stringtypes_class3_1 {

	public static void main(String[] args) {

		         // duplicate value in string and stringbuffer.
		System.out.println("duplicate value in string and stringbuffer");

		// string

		String a = "Gokul";
		String b = "Gokul";

		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));

		// stringbuffer

		StringBuffer c = new StringBuffer("bike");
		StringBuffer d = new StringBuffer("bike");

		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));

		           // concat will be used only in string

		System.out.println("concat will be used only in string");
		String e = "car";
		String f = "motor";

		System.out.println(System.identityHashCode(e));
		System.out.println(System.identityHashCode(f));

		String g1 = e.concat(f);
		System.out.println(System.identityHashCode(g1));

		           // append will be used only in stringbuffer

		System.out.println("append will be used only in stringbuffer");

		StringBuffer g2 = new StringBuffer("gulf");
		StringBuffer g3 = new StringBuffer("abroad");

		System.out.println(System.identityHashCode(g2));
		System.out.println(System.identityHashCode(g3));

		StringBuffer g4 = g2.append(g3);
		System.out.println(System.identityHashCode(g4));

	}

}
